package com.agibank.s2exemplo1.semana3;

import java.util.Scanner;

public class Sexta {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();

        switch (vlr) {
            case 1:
                atv1();
                break;
            case 2:
//                atv2();
                break;
            case 3:
//                atv3();
                break;
            case 4:
//                atv4();
                break;
            case 5:
//                atv5();
                break;
            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }
/*    Nota:

    Nome devs:
    Tulio Neto, Bruno Henrique, Victoria rocha, Matheus Rocco, Carolina Guedes
    Nome Tester:
    */
    public void atv1() {
        int idade = 30;
        double contrMensal = 1000;
        double taxaMensal = 0.01;
        int totalAnos = 65;
        int totalContribuicoes = totalAnos * 12;
        double saldoFinal = 0;
        int cont = 0;
        double[][] taxasAnuais = {
                {0, taxaMensal},
                {20, taxaMensal + 0.03},
                {40, taxaMensal + 0.05},
                {60, taxaMensal + 0.07}
        };

        double[] saldoFinalAnos4 = new double[totalAnos];
        double[] saldoFinalAnos6 = new double[totalAnos];
        double[] saldoFinalAnos8 = new double[totalAnos];
        double[] saldoFinalAnos = new double[totalAnos];

        for (int i = 0; i < totalContribuicoes / 12; i++) {
            int anoAtual = i / 12;

            if (anoAtual >= taxasAnuais[3][0]) {
                taxaMensal = taxasAnuais[3][1];
            } else if (anoAtual >= taxasAnuais[2][0]) {
                taxaMensal = taxasAnuais[2][1];
            } else if (anoAtual >= taxasAnuais[1][0]) {
                taxaMensal = taxasAnuais[1][1];
            } else {
                taxaMensal = taxasAnuais[0][1];
            }

            saldoFinal += (contrMensal * (Math.pow(1 + taxaMensal, 12) - 1) / taxaMensal);

                saldoFinalAnos[cont] = saldoFinal;
                cont++;

        }

            for (double i : saldoFinalAnos) {
                System.out.println(i);
            }

        double saldoTotal4 = 0;
        double saldoTotal6 = 0;
        double saldoTotal8 = 0;

        for (int i = 0; i < saldoFinalAnos.length; i++) {
            saldoFinalAnos4[i] = saldoFinalAnos[i] * 1.04;
            saldoFinalAnos6[i] = saldoFinalAnos[i] * 1.06;
            saldoFinalAnos8[i] = saldoFinalAnos[i] * 1.08;
        }

        for (int i = 0; i < saldoFinalAnos.length; i++) {
            saldoTotal4 += saldoFinalAnos4[i];
            saldoTotal6 += saldoFinalAnos6[i];
            saldoTotal8 += saldoFinalAnos8[i];
        }

        int expectativaVida = 20;
        int mesesDeVida = expectativaVida * 12;

        double retiradaMensal4 = saldoTotal4 * (0.04 / (1 - Math.pow(1 + 0.04, -mesesDeVida)));
        double retiradaMensal6 = saldoTotal6 * (0.06 / (1 - Math.pow(1 + 0.06, -mesesDeVida)));
        double retiradaMensal8 = saldoTotal8 * (0.08 / (1 - Math.pow(1 + 0.08, -mesesDeVida)));

        System.out.println("Idade atual: " + idade);

        System.out.printf("Com taxa de 4%%: R$ %.2f%n", saldoTotal4);
        System.out.printf("Renda mensal estimada (20 anos): R$ %.2f%n", retiradaMensal4);

        System.out.printf("Com taxa de 6%%: R$ %.2f%n", saldoTotal6);
        System.out.printf("Renda mensal estimada (20 anos): R$ %.2f%n", retiradaMensal6);

        System.out.printf("Com taxa de 8%%: R$ %.2f%n", saldoTotal8);
        System.out.printf("Renda mensal estimada (20 anos): R$ %.2f%n", retiradaMensal8);
    }








}
