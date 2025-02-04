package com.agibank.s2exemplo1.semana3;

import com.agibank.s2exemplo1.semana2.Terca;

import java.util.Arrays;
import java.util.Scanner;

public class Segunda {
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
        double[] vet = {100.0, 101.5, 99.0, 102.0, 105.0};

        double percentualDiario = vet[0];
        for (int i = 1; i < vet.length; i++) {
            percentualDiario = ((vet[i] - vet[i-1]) / vet[i-1]) * 100;
            System.out.printf("%.2f%%, ", percentualDiario);
        }
        System.out.println();

    }

    public void atv2() {
        double[] vet = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};
        double maior = vet[0];
        double menor = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
            } else if (menor > vet[i]) {
                menor = vet[i];
            } else {
                System.out.println("Erro");
            }
        }
        System.out.printf("Maior: %.2f Menor: %.2f\n", maior, menor);
    }

    public void atv3() {
        double[] vet = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0};
        double mediaMovel = 0;
        for (int i = vet.length-1; i > vet.length-4; i--) {
            mediaMovel += vet[i];
        }
        mediaMovel = mediaMovel / (vet.length-4);
        System.out.println("Média móvel dos últimos 3 dias: " + mediaMovel);
    }

    public void atv4() {
        double[] vet = {98.5, 102.0, 100.5, 101.0, 105.0};
        double vlrAnterior = vet[0];
        double crescimentoDiario = 0;
        for (int i = 1; i < vet.length; i++) {
            crescimentoDiario += ((vet[i] - vet[i-1]) / vet[i-1]) * 100;
            System.out.println(crescimentoDiario);
        }
    }

    public void atv5() {
        double[] vet = {100, 500, 300, 400, 100, 150, 200, 300, 950, 200};
        int[] diasAlta = new int[3];
        double aux = vet[0];
        int cont = 0;

        for (int i = 0; i < vet.length; i++) {

            if (aux < vet[i]) {
                cont++;
                System.out.printf("O valor: %.2f é menor que o %.2f", aux, vet[i]);
                System.out.println(" Contador: " + cont  );
                if (cont == 3) {
                    diasAlta[0] = i - 2;
                    diasAlta[1] = i - 1;
                    diasAlta[2] = i;
                    break;
                }
            } else {
                cont = 0;
                System.out.printf("O valor: %.2f é maior que o %.2f", aux, vet[i]);
                System.out.println(" Contador: " + cont  );
            }
                aux = vet[i];
        }
            if (cont < 3) {
                System.out.println("Sem tendência de alta identificada");
            } else {
                System.out.println(Arrays.toString(diasAlta));
            }

    }
}
