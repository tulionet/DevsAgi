package com.agibank.s2exemplo1.semana3;

import java.util.Scanner;

public class Terca {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();
        com.agibank.s2exemplo1.semana2.Terca terca = new com.agibank.s2exemplo1.semana2.Terca();

        switch (vlr) {
            case 1:
//                atv1();
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
}
