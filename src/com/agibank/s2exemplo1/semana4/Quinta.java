package com.agibank.s2exemplo1.semana4;


import java.util.Arrays;
import java.util.Scanner;

public class Quinta {
    public void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();

        switch (vlr) {
            case 1:
                String[] str = {"1","2","3"};
                atv1(str);
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
            case 6:
                atv6();
                break;
            case 7:
                atv7();
                break;
            case 8:
                atv8();
                break;
            case 9:
                atv9();
                break;
//            case 10:
//                atv10();
//                break;
            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }
    public void atv1(String[] args) {
        System.out.println("Average finder v0.1");
        double avg = findAverage(args);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result/input.length;
    }

    public void atv2() {
/*
        Calculo do retorno diário de uma ação: Dado um vetor com os preços de uma ação nos
        ultimos 5 dias, calcule o percentual de variação diária em relação ao dia anterior
*/
        double[] valores = {100,102,101,103,105};
        double[] resultado = new double[valores.length-1];
        double aux = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado[i-1] = ((valores[i] - aux) / aux) * 100;
            aux = valores[i];
        }
        System.out.println(Arrays.toString(resultado));
    }

    public void atv3() {
/*
        Media dos gastos mensais> um usuário acompanha seus gastos mensais em um vetor de 12 posições.
        Seu objetivo é calcular:
        O gasto médio mensal.
        Quantos meses tiveram gasto acima da média.
*/

        double[] gastosMensais = {1200,1350,1100,1250,1400,1300,1250,1400,1500,1600,1550,1650};
        double total = 0;
        for (double i : gastosMensais) total += i;
        double media = total / gastosMensais.length;
        int cont = 0;
        for (double i :gastosMensais) {
            if (i > media) {
                cont++;
            }
        }
        System.out.printf("Média de gasto: %.2f\n", media);
        System.out.printf("Meses acima da média: %d", cont);

    }
    public void atv4() {
/*
    Simulação de pagamento de empréstimo: dado um valor de empréstimo e uma quantidade de parcelas,
    o programa deve calcular o valor de cada parcela e armazenar os resultados em um vetor.
*/
        double vlrEmprestimo = 1000;
        int parcelas = 4;

        double vlrParcelas = vlrEmprestimo / parcelas;

        for (int i = 0; i < parcelas; i++) {
            System.out.printf("%.2f ", vlrParcelas);
        }

    }
    public void atv5() {
/*
        Matriz de transações bancárias: um banco acompanha 3 clientes e suas 5 transações
        mais recentes. O saldo inicial de cada cliente é de 100 reais. Crie uma matriz 3x5 e
        preencha com os valores das transações. Depois, para cada cliente, calcule e exiba.
        O total movimentado
        O saldo final, considerando que cada cliente começou com 1000.0 na conta.
*/
        double[][] matriz = {
                {100, -50, 200, -30, 50},
                {-100, -200, 50, 100, 150},
                {300, -100, -50, -150, 200}
        };
        double sldInicial = 1000;

        for (int i = 0; i < matriz.length; i++) {
            double saldoTotal = sldInicial;
            double totalMovimentado = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                saldoTotal += matriz[i][j];
                totalMovimentado += matriz[i][j];
            }
            System.out.printf("Cliente %d: Total Movimentado = %.2f | Saldo Final = %.2f\n", i, totalMovimentado, saldoTotal);
        }
    }
    public void atv6 () {
/*
        Conversão de Moeda para Viagem: Um turista deseja converter valores em reais para dólares ao longo de 7 dias de viagem. O programa deve:
        Criar um vetor com os valores gastos em reais por dia.
        Converter cada valor para dólares usando uma taxa fixa informada pelo usuário.
*/
        double[] valoresReais = {100,200,300,400,500,600,700};
        float taxa = 5;
        double[] valoresDolares = new double[valoresReais.length];

        for (int i = 0; i < valoresReais.length; i++) {
            valoresDolares[i] = valoresReais[i] / taxa;
        }
        System.out.println("Valores Convertidos: \n");
        for (int i = 0; i < valoresReais.length; i++) {
            System.out.printf("%.2f ", valoresDolares[i] );
        }
    }


    public void atv7 () {
/*
        6. Cálculo do Retorno Médio de um Investimento: Um investidor aplica dinheiro em uma ação
        por N dias. Ele deseja calcular o retorno médio diário, definido como:
        RetornoMedio = (1 / N-1) E(((Pi-1-P)/Pi-1)×100)
*/
        double[] valores = {100,102,101,103,105};
        double somaTotal = 0;
        for (int i = 0; i < valores.length-1; i++) {
            somaTotal += ((valores[i+1] - valores[i]) / valores[i]) * 100;
        }
        double resultado = (1f/(valores.length-1)) * somaTotal;
        System.out.println(resultado);
    }

    public void atv8 () {
/*            7. Matriz de Risco de Ativos: Dada uma matriz A de N x M, onde cada linha representa um ativo
        financeiro e cada coluna representa o retorno do ativo em um determinado dia, calcule o risco
        total de cada ativo. O risco é definido como a soma do módulo das variações diárias:
        Risco =Σ|Αi,j+1 -Αi,j !|
            */
        double[][] matriz = {
                {1.0,1.2,1.1,1.3},
                {0.9,1.0,1.1,1.2},
                {1.5,1.6,1.4,1.3}
        };
        for (int i = 0; i < matriz.length; i++) {
        double somaVariacoes = 0;
            for (int j = 0; j < matriz[0].length-1; j++) {
                somaVariacoes += Math.abs((matriz[i][j+1] - matriz[i][j]));
            }
            System.out.printf("%.1f ", somaVariacoes);
        }
    }

    public void atv9 () {
        double vlrEmprestimo = 10000;
        double taxaJurosMensal = 0.02;
        int numParcelas = 12;
        double vlrParcela = (vlrEmprestimo*taxaJurosMensal) / (1-Math.pow(1+taxaJurosMensal, -numParcelas));
        System.out.println(vlrParcela);
        double[][] matriz = new double[5][numParcelas];


        for (int i = 0; i < matriz[0].length; i++) {
            matriz[0][i] = i+1;                               // número da parcela;
            matriz[1][i] = i == 0 ? vlrEmprestimo : matriz[4][i-1]; // saldo devedor antes do pagamento
            matriz[2][i] = matriz[1][i] * taxaJurosMensal;                           //valorjuros
            matriz[3][i] = vlrParcela - matriz[2][i];                           // amortização
            matriz[4][i] = matriz[1][i] - matriz[3][i];                           // saldo devedor após o pagamento
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%-15.2f", matriz[i][j]);
            }
            System.out.println();
        }


    }

}
