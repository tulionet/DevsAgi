/*
package com.agibank.s2exemplo1.semana4;

import java.util.InputMismatchException;
import java.util.Scanner;

*/
/*
Nota 100
Nome do Dev: Tulio Jacinto Neto
Nome do Tester: Carollina Guedes Machado
*//*


public class Sexta {
    public static void main(String[] args) {
*/
/*
        Simulação de Carteira de investimentos: Um investidor acompanha sua carteira de ações diariamente.
        Ele deseja um programa que registre os preços de N ativos financeiros ao longo de M dias e permita
        operações de consulta e análise dos investimentos. Não precisa realizar as entradas. A tabela abaixo
        simula preços diários das ações. Use os dados da tabela na matriz como entrada em hardcode.
*//*

        double[][] matriz = {
                {22.5, 23.0, 22.0, 24.5, 25.0},//PETR4
                {85.0, 86.5, 84.0, 83.5, 87.0},//VALE3
                {30.0, 29.5, 30.5, 31.0, 32.5}//ITUB4
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Simulação de carteira de investimentos!");
        System.out.printf("Digite o que deseja fazer:\n" +
                "1 - Verificar a média de preços de um ativo.\n" +
                "2 - Identificar a maior valorização dentre os ativos.\n" +
                "3 - Visualização de lucro perda dos ativos.\n" +
                "4 - Consultar preço do ativo em dia especifico\n" +
                "5 - Sair.\n");
        byte escolha = sc.nextByte();
        byte ativos = 0;
        byte dia = 0;
        int tamanhoMaximoColuna = matriz[0].length;
        int tamanhoMaximoLinha = matriz.length;

        try {
            switch (escolha) {
                case 1:
*/
/*                    System.out.println("\nDigite qual ativo deseja calcular a média\n" +
                            "1 - PETR4\n" +
                            "2 - VALE3\n" +
                            "3 - ITUB4\n");
                    ativos = sc.nextByte();*//*

// caso queira utilizar dinamicamente apenas descomente esse scanner, e comente/apague o debaixo.
                    ativos = 1;

                    if (ativos > tamanhoMaximoLinha || ativos < 1) { //verificação para erros
                        System.out.println("Não possui esse ativo na lista!");
                        break;
                    }
                    System.out.printf("Média de preços do ativo: ");
                    if (ativos == 1) System.out.print("PETR4: ");
                    else if (ativos == 2) System.out.print("VALE3 ");
                    else if (ativos == 3) System.out.print("ITAB4 ");
                    ativos--;
                    System.out.printf("-> %.1f", mediaPrecos(matriz, ativos));
                    break;
                case 2:
                    double[] valorizacao = maiorValorizacao(matriz); //Resultado da maior valorização indice 0 é o ativo indice 1 é a porcentagem
                    int indice = (int) valorizacao[0];

                    System.out.printf("Ativo com maior valorização: ");
                    if (indice == 0) System.out.print("PETR4: ");
                    else if (indice == 1) System.out.print("VALE3 ");
                    else if (indice == 2) System.out.print("ITAB4 ");
                    System.out.printf("(de %.1f para %.1f, ", matriz[indice][0], matriz[indice][tamanhoMaximoColuna - 1]);
                    if (matriz[indice][0] < matriz[indice][tamanhoMaximoColuna - 1]) System.out.printf("crescimento ");
                    else System.out.printf("decrescimento ");
                    System.out.printf("de -> %.2f%%)\n", valorizacao[1]);

                    break;
                case 3:
                    double[] valores = simulaLucroPerda(matriz); //Resultado de todas as porcentagens

                    for (int i = 0; i < tamanhoMaximoLinha; i++) {
                        if (i == 0) System.out.print("PETR4: ");
                        else if (i == 1) System.out.print("VALE3 ");
                        else if (i == 2) System.out.print("ITAB4 ");
                        if (valores[i] > 0) System.out.print("Lucro");
                        else System.out.print("Perda");
                        System.out.printf(" (%.2f%%)\n", valores[i]);
                    }

                    break;
                case 4:
*/
/*                    System.out.println("\nDigite qual ativo deseja consultar o preço:\n" +
                            "1 - PETR4\n" +
                            "2 - VALE3\n" +
                            "3 - ITUB4\n");
                    ativos = sc.nextByte();
                    System.out.printf("Digite o dia da verificação: de 1 a %d : ", tamanhoMaximoColuna);
                    dia = sc.nextByte();
                    if (dia <= 0 || dia > tamanhoMaximoColuna) {
                        System.out.println("Dia não disponivel!");
                        break;
                    }*//*

 // caso queira utilizar dinamicamente apenas descomente esse trecho, e comente/apague os 2 debaixo

                    //hardcode
                    ativos = 2;
                    dia = 3;

                    if (ativos > tamanhoMaximoLinha || ativos < 1) { //verificação para erros
                        System.out.println("Não possui esse ativo na lista!");
                        break;
                    }

                    System.out.print("Consulta do preço do ativo ");
                    if (ativos == 1) System.out.print("PETR4: ");
                    else if (ativos == 2) System.out.print("VALE3 ");
                    else if (ativos == 3) System.out.print("ITAB4 ");
                    System.out.printf("no dia %d -> %.1f\n", dia, consultaPreco(matriz, ativos, dia));

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Opção inválida!");
        }
    }

    public static double mediaPrecos(double[][] matriz, byte ativo) {
        double totalSoma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            totalSoma += matriz[ativo][i];
        }
        double media = totalSoma / matriz[ativo].length;

        return media;
    }

    public static double[] maiorValorizacao(double[][] matriz) {
        double valorização = 0;
        double[] ativoValorizado = new double[2];
        int tamanho = matriz[0].length - 1;
        for (int i = 0; i < matriz.length ; i++) {
            if (valorização < ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100) {
                valorização = ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100;
                ativoValorizado[0] = i;
                ativoValorizado[1] = valorização;
            }
        }
        return ativoValorizado;
    }
    public static double[] simulaLucroPerda(double[][] matriz) {
        double[] valores = new double[matriz.length];
        double valorização = 0;
        int tamanho = matriz[0].length - 1;
        for (int i = 0; i < matriz.length ; i++) {
            valorização = ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100;
            valores[i] = valorização;
        }
        return valores;

    }
    public static double consultaPreco(double[][] matriz, byte ativo, int dia) {
        ativo--;
        dia--;
        if (dia > matriz[0].length) return 0;
        return matriz[ativo][dia];
    }
}
*/
//Corrigido
package com.agibank.s2exemplo1.semana4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Nota 100
Nome do Dev: Tulio Jacinto Neto
Nome do Tester: Carollina Guedes Machado
*/

public class Sexta {
    public static void main(String[] args) {
/*
        Simulação de Carteira de investimentos: Um investidor acompanha sua carteira de ações diariamente.
        Ele deseja um programa que registre os preços de N ativos financeiros ao longo de M dias e permita
        operações de consulta e análise dos investimentos. Não precisa realizar as entradas. A tabela abaixo
        simula preços diários das ações. Use os dados da tabela na matriz como entrada em hardcode.
*/
        double[][] matriz = {
                {22.5, 23.0, 22.0, 24.5, 25.0},//PETR4
                {85.0, 86.5, 84.0, 83.5, 87.0},//VALE3
                {30.0, 29.5, 30.5, 31.0, 32.5}//ITUB4
        };
        String[] ativo = {
                "PETR4", "VALE3", "ITUB4"
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Simulação de carteira de investimentos!");
        System.out.printf("Digite o que deseja fazer:\n" +
                "1 - Verificar a média de preços de um ativo.\n" +
                "2 - Identificar a maior valorização dentre os ativos.\n" +
                "3 - Visualização de lucro perda dos ativos.\n" +
                "4 - Consultar preço do ativo em dia especifico\n" +
                "5 - Sair.\n");
        byte escolha = sc.nextByte();
        byte ativos = 0;
        byte dia = 0;
        int tamanhoMaximoColuna = matriz[0].length;
        int tamanhoMaximoLinha = matriz.length;

        try {
            switch (escolha) {
                case 1:
                    System.out.println("\nDigite qual ativo deseja calcular a média\n" +
                            "1 - PETR4\n" +
                            "2 - VALE3\n" +
                            "3 - ITUB4\n");
                    ativos = sc.nextByte();
// caso queira utilizar dinamicamente apenas descomente esse scanner, e comente/apague o debaixo.
//                    ativos = 1;

                    if (ativos > tamanhoMaximoLinha || ativos < 1) { //verificação para erros
                        System.out.println("Não possui esse ativo na lista!");
                        break;
                    }
                    System.out.printf("Média de preços do ativo: ");
                    System.out.printf("%s: ", ativo[ativos-1]);
                    System.out.printf("-> %.1f", mediaPrecos(matriz, ativos));
                    break;
                case 2:
                    double[] valorizacao = maiorValorizacao(matriz); //Resultado da maior valorização indice 0 é o ativo indice 1 é a porcentagem
                    int indice = (int) valorizacao[0];

                    System.out.printf("Ativo com maior valorização: ");
                    System.out.printf("%s: ", ativo[ativos]);
                    System.out.printf("(de %.1f para %.1f, ", matriz[indice][0], matriz[indice][tamanhoMaximoColuna - 1]);
                    if (matriz[indice][0] < matriz[indice][tamanhoMaximoColuna - 1]) System.out.printf("crescimento ");
                    else System.out.printf("decrescimento ");
                    System.out.printf("de -> %.2f%%)\n", valorizacao[1]);

                    break;
                case 3:
                    double[] valores = simulaLucroPerda(matriz); //Resultado de todas as porcentagens

                    for (int i = 0; i < tamanhoMaximoLinha; i++) {
                        System.out.printf("%s: ", ativo[i]);
                        if (valores[i] > 0) System.out.print("Lucro");
                        else System.out.print("Perda");
                        System.out.printf(" (%.2f%%)\n", valores[i]);
                    }

                    break;
                case 4:
                    System.out.println("\nDigite qual ativo deseja consultar o preço:\n" +
                            "1 - PETR4\n" +
                            "2 - VALE3\n" +
                            "3 - ITUB4\n");
                    ativos = sc.nextByte();
                    System.out.printf("Digite o dia da verificação: de 1 a %d : ", tamanhoMaximoColuna);
                    dia = sc.nextByte();
                    if (dia <= 0 || dia > tamanhoMaximoColuna) {
                        System.out.println("Dia não disponivel!");
                        break;
                    }
                    // caso queira utilizar dinamicamente apenas descomente esse trecho, e comente/apague os 2 debaixo

                    //hardcode
//                    ativos = 2;
//                    dia = 3;

                    if (ativos > tamanhoMaximoLinha || ativos < 1) { //verificação para erros
                        System.out.println("Não possui esse ativo na lista!");
                        break;
                    }

                    System.out.print("Consulta do preço do ativo ");
                    System.out.printf("%s: ", ativo[ativos-1]);
                    System.out.printf("no dia %d -> %.1f\n", dia, consultaPreco(matriz, ativos, dia));

                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        } catch (InputMismatchException exception) {
            System.out.println("Opção inválida!");
        }
    }

    public static double mediaPrecos(double[][] matriz, byte ativo) {
        ativo--;
        double totalSoma = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            totalSoma += matriz[ativo][i];
        }
        double media = totalSoma / matriz[ativo].length;

        return media;
    }

    public static double[] maiorValorizacao(double[][] matriz) {
        double valorização = 0;
        double[] ativoValorizado = new double[2];
        int tamanho = matriz[0].length - 1;
        for (int i = 0; i < matriz.length ; i++) {
            if (valorização < ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100) {
                valorização = ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100;
                ativoValorizado[0] = i;
                ativoValorizado[1] = valorização;
            }
        }
        return ativoValorizado;
    }
    public static double[] simulaLucroPerda(double[][] matriz) {
        double[] valores = new double[matriz.length];
        double valorização = 0;
        int tamanho = matriz[0].length - 1;
        for (int i = 0; i < matriz.length ; i++) {
            valorização = ((matriz[i][tamanho] - matriz[i][0]) / matriz[i][0]) * 100;
            valores[i] = valorização;
        }
        return valores;

    }
    public static double consultaPreco(double[][] matriz, byte ativo, int dia) {
        ativo--;
        dia--;
        if (dia > matriz[0].length) return 0;
        return matriz[ativo][dia];
    }
}

