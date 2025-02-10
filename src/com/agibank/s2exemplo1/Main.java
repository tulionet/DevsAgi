package com.agibank.s2exemplo1;

import com.agibank.s2exemplo1.semana3.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("\nDigite qual semana deseja visualizar:\n1 - Segunda-Feira\n2 - Terça-Feira\n3 - Quarta-Feira\n4 - Quinta-Feira\n5 - Sexta-Feira\n6 - Sair");
            switch (sc.nextInt()) {
                case 1:
                    Segunda.main(new String[0]);
                    break;
                case 2:
                    new Terca().main();
                    break;
                case 3:
                    new Quarta().main();
                    break;
                case 4:
                    new Quinta().main();
                    break;
                case 5:
                    new Sexta().main();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.[");
                    break;
            }
        }

    }
}
