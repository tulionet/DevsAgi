package com.agibank.s2exemplo1.semana4;

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
        double[] saldos = {100,200,300,400,500,600,700,800,900,1000};
        System.out.print("Digite o índice da conta: ");
        int indice = sc.nextInt();
        indice--;
        try {
            System.out.println(saldos[indice]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro: Conta não encontrada");
        }
    }

    public void atv2() {
        double[] saldos = new double[5];
        int vlrMovel = 3;
        double[] mediaMovel = new double[saldos.length-2];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < saldos.length; i++) {
                System.out.println("Digite o preço da ação no dia " + (i+1) + " : ");
                String str = sc.nextLine();
                saldos[i] = Double.parseDouble(str);
            }

            if (mediaMovel.length < 3 ) throw new IllegalArgumentException();

            else {
                for (int i = saldos.length-1; i > 0; i--) {
                    mediaMovel[(saldos.length-1) - i] = (saldos[i] + saldos[i-1] + saldos[i-2]) / vlrMovel;
                    System.out.println("Média Móvel (dia " + (i+1) + "): " + mediaMovel[(saldos.length-1) - i]);
                    if ((saldos.length-1) - i == mediaMovel.length-1) break;
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println("Não é possível utilização de quaisquer outros caracteres além de números!");
        }
    }

    public void atv3() {
        double[][] matriz = {
                {0.2,0.5,1.1,0.4,0.3},
                {0.7,0.9,0.1,0.6,0.8}
        };
        int coluna = 5;
        int linha = 5;
        int contL = 0;
        int contC = 0;
        try {
            for (int i = 0; i < linha; i++) {
                contL ++;
                for (int j = 0; j < coluna; j++) {
                    System.out.print(matriz[i][j] + ", ");
                    if (matriz[i][j] > 1) {
                        throw new IllegalArgumentException("O valor na posição [" + i + "][" + j + "] é maior que 1.");
                    }

                    contC++;
                }
                contC = 0;
                System.out.println();
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.printf("Erro: Valor inválido encontrado na célula [%d][%d]: L1", contL, contC);
        }

    }
}
