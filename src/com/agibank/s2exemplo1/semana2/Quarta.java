package com.agibank.s2exemplo1.semana2;

import java.util.Scanner;

public class Quarta {

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
                atv4();
                break;
            case 5:
                atv5();
                break;
            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }

    public void atv1() {
        //Um cliente deseja escolher o tipo de investimento a ser feito> CDB, CDI, Tesouro Direto, FII. Faça um programa em java que permita ao usuário fazer esta escolha. Dê mensagem de acordo com o investimento escolhido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha qual investimento deseja ser feito:\n1 - CDB\n2 - CDI\n3 - Tesouro Direto\n4 - FII");

        switch (sc.nextByte()) {
            case 1:
                System.out.println("Escolheu CDB");
                break;
            case 2:
                System.out.println("Escolheu CDI");
                break;
            case 3:
                System.out.println("Escolheu Tesouro Direto");
                break;
            case 4:
                System.out.println("Escolheu FII");
                break;
            default:
                System.out.println("Opção inválida na lista!");

        }
    }

    public void atv2() {
        //Um banco precisa de uma ferramenta para saber o nível de satisfação de atendimento do cliente (de zero a 5). Desenvolva uma solução computacional para resovler esta necessidade. Mostre mensagens coerentes com as avaliações dadas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma avaliação de 0 a 5 para nosso sistema!");

        switch (sc.nextByte()) {
            case 1:
                System.out.println("Que pena, iremos rever nossos conceitos para melhorarmos. Obrigado pela participação!");
                break;
            case 2:
                System.out.println("Que pena, iremos analisar suas dificuldades para uma melhoria. Obrigado pela participação!");
                break;
            case 3:
                System.out.println("Sinto muito, nos esforçaremos mais da próxima vez. Obrigado pela participação!");
                break;
            case 4:
                System.out.println("Ótimo, sempre pensamos em nossos clientes. Obrigado pela participação!");
                break;
            case 5:
                System.out.println("Perfeito, continuaremos fazendo um trabalho com excelência. Obrigado pela participação!");
                break;
            default:
                System.out.println("Opção inválida");


        }
    }

    public void atv3() {
//        Implementar um programa que imprima a tabuada de um número digitado pelo usuário.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número que queira ver a tabuada: ");
        var vlr = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + vlr + " = " + vlr * i);
        }
    }

    public void atv4() {
        /*Faça um programa que calcule e mostre o quadrado de um número N
        inteiro positivo, digitado pelo usuário. O cálculo deve ser feito através da
        soma dos N primeiros números ímpares. Ex: Se N=3 o programa calculará
        1+3+5=9, que é o quadrado de 3.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int vlr = sc.nextInt();
        int calc = 1;
        int calcTotal = 0;
        for (int i = 0; i < vlr ; i++) {
            System.out.println(calc);

            calcTotal += calc;
            calc += 2;

        }
        System.out.println("O calculo total é " + calcTotal);
    }

    public void atv5() {
 /*       Calcule a expressão, sem utilizar a função pow() da math.h: XY
        Onde: X e Y são digitados pelo usuário*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Calculo de exponenciação!\nDigite um valor base: ");
        int vlr = sc.nextInt();
        System.out.print("Digite um valor como expoente: ");
        int exp = sc.nextInt();

        int vlrBase = vlr;
        double resultado = 0;

        if (exp == 0) {
            System.out.println(1);
        } else if (exp < 0) {
            resultado = 1 / Math.abs(exp);
            System.out.printf("%.2f\n", resultado);
        } else {
            for (int i = 1; i < exp; i++) {
                vlr = vlr * vlrBase;
            }
            System.out.println(vlr);
        }
    }
}
