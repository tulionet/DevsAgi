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
                //atv3();
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
}
