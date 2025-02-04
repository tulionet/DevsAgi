package com.agibank.s2exemplo1.semana3;

import java.util.Arrays;
import java.util.Scanner;

public class Terca {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();

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
//                atv5();
                break;
            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }

    public void atv1() {
        double[] vet = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0};
        double anterior = vet[0];
        int maior = 0;
        int menor = 0;
        for (int i = 1; i < vet.length; i++) {
            if (anterior < vet[i]) maior++;
            else menor ++;
            anterior = vet[i];
        }
        System.out.printf("Maior: %d Menor: %d\n", maior, menor);
    }

    public void atv2() {
        double[] vet = {5000,3000,7000,4000,6000};
        double[] percentuais = new double[5];
        double total = 0;
        int cont = 0;
        System.out.println(vet.length);
        for (double i : vet) total += i;
        for (double i: vet) {
            percentuais[cont] = i / total * 100;
            cont++;
        }
        System.out.printf("Total investido = %.2f\n", total);
        System.out.print("Percentual de cada ação: ");
        for (double i: percentuais) System.out.printf(" %.2f ", i);
    }


    public void atv3() {
        double[] compra = {10000, 8000, 12000, 7000, 15000};
        double[] venda = {12000,8500,14000,7200,18000};
        double[] diferenca = new double[compra.length];
        double total = 0;
        for (int i = 0; i < diferenca.length; i++) {
            diferenca[i] = venda[i] - compra[i];
            total += diferenca[i];
        }
        if (total > 20000) {
            total = total - (total * 0.15);
        }
        System.out.println("Lucro total: R% " + total);
    }

    public void atv4() {
        int meses = 6;
        double taxa = 0.02;
        double[] vet = new double[meses];
        double vlrInicial = 1000;
        vet[0] = vlrInicial;

        for (int i = 1; i < vet.length; i++) {
            vet[i] = vet[i-1] * (1+taxa);
            System.out.printf("%.2f ", vet[i]);
        }

    }
}
