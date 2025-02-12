package com.agibank.s2exemplo1.semana3;

import java.util.Arrays;
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

    public void atv1() {
        Scanner sc = new Scanner(System.in);
        int idade = 0, idadeDesejadaAposentadoria = 0;
        double taxaJurosAnual = 0, contribMensal = 0;

        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.print("Contribuição mensal para a aposentadoria: ");
        contribMensal = sc.nextDouble();
        System.out.print("Taxa de juros anual esperada: ");
        taxaJurosAnual = sc.nextDouble();
        System.out.print("Idade desejada para a aposentadoria: ");
        idadeDesejadaAposentadoria = sc. nextInt();

        System.out.println("Simulação de Previdência Privada\n");
        System.out.printf("Idade atual: %d\n", idade);
        System.out.printf("Contribuição mensal: R$ %.2f\n", contribMensal);
        System.out.printf("Taxa de juros anual esperada: %.0f%%\n", taxaJurosAnual);
        System.out.printf("Idade desejada para aposentadoria: %d anos\n\n", idadeDesejadaAposentadoria);

        int totalAnos = idadeDesejadaAposentadoria - idade;
        double[] saldoFinalAnos = new double[totalAnos];
        double taxaJurosMensal = (taxaJurosAnual / 100) / 12;

        for (int i = 0; i < totalAnos ; i++) {
            saldoFinalAnos[i] = contribMensal * (Math.pow(1+taxaJurosMensal, totalAnos*12)-1) / taxaJurosMensal;
//            System.out.println("O ano " + i + " recebeu o valor: " + saldoFinalAnos[i]);
        }

        double[][] matriz = new double[4][totalAnos];
        for (int i = 0; i < matriz.length; i++) {
            double taxaJuros = 0;
            if (i == 0) taxaJuros = 4;
            else if (i == 1) taxaJuros = 6;
            else if (i == 2) taxaJuros = 8;
            else if (i == 3) taxaJuros = 10;
            taxaJuros = (taxaJuros / 100) / 12;
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = contribMensal * (Math.pow(1+taxaJuros, (j+1) * 12)-1) / taxaJuros;
            }
        }
        System.out.println("\nSaldo final estimado!");
        System.out.printf("Com taxa de 4%%: R$ %.2f\n", matriz[0][totalAnos-1]);
        System.out.printf("Com taxa de 6%%: R$ %.2f\n", matriz[1][totalAnos-1]);
        System.out.printf("Com taxa de 8%%: R$ %.2f\n", matriz[2][totalAnos-1]);
        System.out.printf("Com taxa de 10%%: R$ %.2f\n", matriz[3][totalAnos-1]);

        System.out.println("\nRenda mensal estimada para 20 anos de aposentadoria: ");

        int expectativaVida = 20;
        double taxaJurosMensalidade = 0;
        taxaJurosMensalidade = (4.0 / 100) / 12;
        double rendaMensal = matriz[0][totalAnos-1] * (taxaJurosMensalidade / (1-(Math.pow(1+taxaJurosMensalidade, (-expectativaVida)*12))));
        taxaJurosMensalidade = (6.0 / 100) / 12;
        double rendaMensal6 = matriz[0][totalAnos-1] * (taxaJurosMensalidade / (1-(Math.pow(1+taxaJurosMensalidade, (-expectativaVida)*12))));
        taxaJurosMensalidade = (8.0 / 100) / 12;
        double rendaMensal8 = matriz[0][totalAnos-1] * (taxaJurosMensalidade / (1-(Math.pow(1+taxaJurosMensalidade, (-expectativaVida)*12))));
        taxaJurosMensalidade = (10.0 / 100) / 12;
        double rendaMensal10 = matriz[0][totalAnos-1] * (taxaJurosMensalidade / (1-(Math.pow(1+taxaJurosMensalidade, (-expectativaVida)*12))));
        System.out.printf("Com taxa de 4%%: R$ %.2f\n", rendaMensal);
        System.out.printf("Com taxa de 6%%: R$ %.2f\n", rendaMensal6);
        System.out.printf("Com taxa de 8%%: R$ %.2f\n", rendaMensal8);
        System.out.printf("Com taxa de 10%%: R$ %.2f\n", rendaMensal10);

    }
}
