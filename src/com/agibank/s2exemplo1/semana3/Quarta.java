package com.agibank.s2exemplo1.semana3;

import com.agibank.s2exemplo1.semana2.Terca;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quarta {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();
        com.agibank.s2exemplo1.semana2.Terca terca = new Terca();

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

    public void atv1(){
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Digite o valor da tabela nos indices: " + i + " " + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == matriz[i].length - 1) {
                    System.out.printf("%d%n", matriz[i][j]);
                } else {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }
        }
    }
    public void atv2() {
        int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int somaTotal = 0;
        int somaLinha = 0;
        int somaColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaLinha = 0;
            somaColuna = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                somaTotal += matriz[i][j];
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            System.out.printf("somaLinha da linha %d: %d\n", i, somaLinha );
            System.out.printf("somaColuna da coluna %d: %d\n", i, somaColuna );
        }
        System.out.println("somaTotal: " + somaTotal);
    }

    public void atv3() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void atv4() {
        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };
        int[][] matriz2 = new int[matriz[0].length][matriz.length];
        Random ram = new Random();
        int num = ram.nextInt(5);
        boolean find = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == num) {
                    System.out.printf("O Número: %d foi encontrado na posição: Linha %d, Coluna %d", num , i+1, j+1);
                   find = true;
                    break;
                }
                if (find) break;
            }
        }
    }

        public void atv5() {
            int[][] matriz = {
                    {1,2,3},
                    {4,5,6}
            };
            int[][] matriz2 = {
                    {1,2},
                    {3,4},
                    {5,6}
            };
            int[][] matriz3 = new int[matriz[0].length][matriz2.length];

            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (i >= matriz.length || j >= matriz2[0].length) matriz3[i][j] = 0;
                    else matriz3[i][j] = matriz[i][j] * matriz2[i][j];
                }
            }
            for (int[] i : matriz3) System.out.println(Arrays.toString(i));
        }


}
