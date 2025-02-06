package com.agibank.s2exemplo1.semana3;

import com.agibank.s2exemplo1.semana2.Terca;

import java.util.Arrays;
import java.util.Scanner;

public class Quinta {
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
    public void atv1() {
        //Receba uma matriz quadrada nxn e calcule a soma dos elementos da diagonal principal e da diagonal secundária.
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int diagonalPrimaria = 0, diagonalSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            diagonalPrimaria += matriz[i][i];
            diagonalSecundaria += matriz[i][(matriz.length - 1) - i];
        }

        System.out.println("Soma da Diagonal Principal: " + diagonalPrimaria);
        System.out.println("Soma da Diagonal Secundária: " + diagonalSecundaria);
    }
    public void atv2() {
/*        Verifique se uma matriz qudrada nxn é uma matriz identidade.
        Definição: uma matriz identidade possui ls na diagonal principal e 0s em todos os outros elementos
    */
        int[][] matriz = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][i] == 1 && matriz[i][j] != 0) {
                    cont++;
                }
            }
        }

        if (cont == matriz.length) System.out.println("A matriz é uma identidade!");
        else System.out.println("A matriz não é uma identidade!");

    }
    public void atv3() {
//        Dada uma matriz nxm de números reais, normalize os valores, dividindo cada elemento pelo maior valor presente na matriz
        double[][] matriz = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0}
        };
        double[][] matriz2 = new double[matriz.length][matriz[0].length];
        double maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (maior < matriz[i][j]) maior = matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz2[i][j] = matriz[i][j] / maior;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%.2f ", matriz2[i][j]);
            }
            System.out.println(
            );
        }

    }
    public void atv4() {
//            Implmente uma função para rotacionar uma matriz quadrada nxn em 90 graus no sentido horário
        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                System.out.printf("%d ", matriz[j][i]);
            }
            System.out.println();
        }
    }
    public void atv5() {

    }
}
