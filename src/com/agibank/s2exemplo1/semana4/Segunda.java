package com.agibank.s2exemplo1.semana4;

import java.util.Arrays;
import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 5");
        var vlr = sc.nextInt();

        switch (vlr) {
            case 1:
/*                Crie um método estático chamado converterMoeda() que recebe um valor em reais (R$)
                e uma taxa de conversão para dólares(USD) e retorna o valor convertido.
*/
                System.out.println("Conversor de moedas!");
                System.out.print("Digite o valor em reais: ");
                double valor = sc.nextDouble();
                System.out.print("Digite a taxa de conversão: ");
                double taxa = sc.nextDouble();
                System.out.printf("%.1f reais equivalem a %.2f dólares.", valor, converterMoeda(valor, taxa));
                break;
            case 2:
/*
                Implemente um método chamado calcularJurosSimples() que recebe o capital inicial,
                a taxa de juros anual (%) e o tempo (em anos).
                O método deve retornar o montante final após o periodo.
*/
                System.out.println("Calculo de juros simples!");
                System.out.print("Digite o Capital inicial: ");
                double capital = sc.nextDouble();
                System.out.print("Digite a taxa anual do investimento: ");
                double taxaAnos = sc.nextDouble();
                System.out.print("Digite o periodo em anos que o montante ficará rendendo: ");
                int anos = sc.nextInt();
                System.out.printf("Montante final: %.1f", calcularJurosSimples(capital,taxaAnos,anos));
                break;
            case 3:
/*
                Crie um método chamado calcularCrescimento() que recebe o preço de uma ação
                em dois dias consecutivos e calcula a variação percentual.
*/
                System.out.println("Calculo de crescimento do valor de ações");
                System.out.print("Quantos dias serão analisados: ");
                int dias = sc.nextInt();
                double[] vlrAcaoDias = new double[dias];
                for (int i = 0; i < vlrAcaoDias.length; i++) {
                    System.out.print("Digite o valor do dia " + (i+1) + " : ");
                    vlrAcaoDias[i] = sc.nextDouble();
                }
                System.out.printf("Crescimento: %.1f%%", calcularCrescimento(vlrAcaoDias));
                break;
            case 4:
/*
                Implemente um método chamado calcularMediaMovel() que recebe um array de preços de uma ação
                e um intervalo de tempo n. O metodo deve calcular a média móvel para o intervalo dado
*/
                System.out.println("Calculo de média móvel!");
                double[] precos = {100, 102, 101, 103, 105};
                int intervalo = 3;
                System.out.println("Média móvel: " + Arrays.toString(calcularMediaMovel(precos, intervalo)));
                break;
            case 5:
/*
                Crie um método chamado compararAtivos() que recebe os retornos médios de dois ativos
                financeiros e retorna o nome do ativo com maior retorno.
*/
                System.out.println("Comparação de valor de ativos!");
                System.out.print("Quantos ativos serão comparados: ");
                int qtd = sc.nextInt();
                double[] ativos = new double[qtd];

                for (int i = 0; i < ativos.length; i++) {
                    System.out.print("Digite o valor do Ativo " + (i+1) + " : " );
                    ativos[i] = sc.nextDouble();
                }
                System.out.printf("O ativo com maior retorno é: Ativo %d", compararAtivos(ativos));
                break;
            case 6:

            default:
                System.out.println("Opção inválida.[");
                break;
        }
    }

    private static double converterMoeda(double valor, double taxaConversao ) {
        return valor / taxaConversao;
    }

    private static double calcularJurosSimples(double capitalIni, double taxaAnual, int tempoAnos) {
        taxaAnual = taxaAnual / 100;
        double diferencaCapitalTaxa = capitalIni * taxaAnual;
        double capitalTotal = capitalIni + (diferencaCapitalTaxa * tempoAnos);
        return capitalTotal;
    }

    private static double calcularCrescimento(double[] vlrDias) {
        double precoAcao1 = vlrDias[0];
        double precoAcao2 = vlrDias[vlrDias.length-1];
        double crescimento = ((precoAcao2 / precoAcao1) - 1) * 100;
        return crescimento;
    }

    private static double[] calcularMediaMovel(double[] precos, int tempo) {
        double[] mediaMovelPrecos = new double[precos.length - tempo +1];
        for (int i = 0; i < mediaMovelPrecos.length; i++) {
            mediaMovelPrecos[i] = (precos[i] + precos[i+1] + precos[i+2]) / tempo;
        }
        return  mediaMovelPrecos;
    }

    private static int compararAtivos(double[] ativos) {
        double maior = ativos[0];
        int cont = 1;
        for (int i = 1; i < ativos.length; i++) {
            if (maior < ativos[i]) {
                maior = ativos[i];
                cont++;
            }
        }
        return cont;
    }

//    private static double calcularVolatilidade(double[] retornosDiarios) {
//
//    }

}
