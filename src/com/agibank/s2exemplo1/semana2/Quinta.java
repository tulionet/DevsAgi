package com.agibank.s2exemplo1.semana2;

import java.util.Scanner;

public class Quinta {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();
        Terca terca = new Terca();

        switch (vlr) {
            case 1:
                atv1();
                break;
            case 2:
                atv2();
                break;
            case 3:
                atv3();
                break;
            case 4:
                //atv4();
                break;
            case 5:
                //atv5();
                break;
            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }

    public void atv1() {
        // Faça um programa que calcule o fatorial de qualquer número digitado pelo usuário,
        // sabendo que o fatorial de um número é o produtório dos números inteiros entre 1 e ele mesmo.

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de fatoração!");
        int num = 0;
        do {
        System.out.print("Digite um número inteiro e positivo: ");
        num = sc.nextInt();

        } while(num <= 0);
        int resultado = num;
        int cont = num;
        for (int i = 1; i < cont; i++) {
            resultado = resultado * (num - 1);
            num--;
        }
        System.out.println("Resultado: " + resultado);
    }

    public void atv2() {
     /*   A sequência de Fibonacci segue a seguinte ordem: 0,1,1,2,3,5,8,13,21,34,55,89,...
        Repare que cada termo é a somatória dos dois anteriores, sendo que os dois primeiros são 0 (zero) e o 1 (um)
        Faça um programa que receba um valor do usuário e imprima os termos da sequÇencia de Fibonacci menores
        que o valor digitado*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de Fibonacci");
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

            System.out.print(a + ", ");
            System.out.print(b);
        do{
            int c = a + b;
            if(c >= num) {
                break;
            }
            System.out.print(", " + c);
            a = b;
            b = c;
        }while(true);
    }

    public void atv3() {
/*        Em uma loja, todos os clientes que comprarem mais de 300,00 receberão um desconto proporcional
        ao valor de sua compra, de acordo com
        com a tabela abaixo:
        Valor da compra(R$) Desconto
        Até 500,00          5
        De 501,00 a 1000,00 10
        Acima de 1000,00    12
        Você foi incumbido de fazer um programa que permita que o cliente entre com o valor dos produtos
        comprados e mostre o total da compra, o valor do desconto e o preço a pagar. Pergunte ao usuário
        se deseja terminar a digitação dos produtos e também se deseja finalizar o programa*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mercado!");
        double totalCompra = 0;
        double totalCompraDesconto = 0;
        double vlrDesconto = 0;

        double compra = 1;

        do {

        do {
            System.out.println("Bem vindo, Cliente!");
            System.out.println("Digite o valor da sua compra: \nDigite 0 para sair.\n");
            compra = sc.nextDouble();
            totalCompra += compra;
        } while(compra != 0);
        if (totalCompra > 300 && totalCompra <= 500) {
            vlrDesconto = totalCompra * 0.005;
            totalCompraDesconto = totalCompra - vlrDesconto;
        } else if (totalCompra > 500 && totalCompra <= 1000) {
            vlrDesconto = totalCompra * 0.1;
            totalCompraDesconto = totalCompra - vlrDesconto;
        } else if (totalCompra > 1000) {
            vlrDesconto = totalCompra * 0.12;
            totalCompraDesconto = totalCompra - vlrDesconto;
        }
        System.out.println(totalCompra);
        System.out.println(vlrDesconto);
        System.out.println(totalCompraDesconto);

            System.out.print("Deseja atender o proximo cliente?\nDigite 1 para sim e 0 para não: ");
            if (sc.nextByte() == 0 ? true : false) {
                break;
            }

        }while(true);

    }
}
