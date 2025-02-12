package com.agibank.s2exemplo1.semana4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual atividade deseja fazer de 1 a 10");
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
/*
                Implemente um método chamado calcularVolatilidade() que recebe um array de retornos diários
                de uma ação e retorna o desvio padrão dos retornos.
*/
                System.out.println("Calculo de volatilidade para descobrir o desvio padrão!");
                System.out.print("Digite a quantidade de valores que deseja verificar a volatilidade: ");
                int vlr6 = sc.nextInt();
                double[] retornosDiarios = new double[vlr6];
                for (int i = 0; i < vlr6 ; i++) {
                    System.out.printf("Digite o %d valor: ", i+1);
                    retornosDiarios[i] = sc.nextDouble();
                }
                System.out.printf("Volatilidade: %.3f", calcularVolatilidade(retornosDiarios));
                break;
            case 7:
/*
                Crie um método chamado simularCarteira() que recede um array com os valores inciais
                de 3 ativos financeiros e os retornos médios esperados para cada ativo.
                O método deve calcular o valor final da carteira após 1 ano.
*/

                double[] valores = {1000.0, 2000.0, 1500.0};
                double[] retornos = {0.05, 0.03, 0.04};
                System.out.println(simularCarteira(valores, retornos));
                break;
            case 8:
/*
                Implemente um método chamado calcularJurosCompostos() que calcula o montante final
                de um investimento com juros compostos, dado o capital inicial, a taxa de juros mensal
                e o número de meses.
*/
                double capitalInicial = 1000.0;
                double taxaJurosMensal = 0.02;
                int numMeses = 12;
                System.out.println(calcularJurosCompostos(capitalInicial, taxaJurosMensal, numMeses));
                break;
            case 9:
/*
            Crie um método chamado calcularCorrelacao() que recebe duas séries de preços
            de ativos e calcula a correlação entre elas. A fórmula da correlação é
            Cor = Cov(X,Y) / aX*aY
*/
                double[] serie1 = {1, 2, 3 , 4, 5};
                double[] serie2 = {2, 4, 6, 8, 10};
                System.out.println(calcularCorrelacao(serie1, serie2));
                break;
            case 10:
/*
                Crie um método chamado simularPrecoMonteCarlo() que simula o preço de uma
                ação após n períodos (diários) usando o modelo de caminhada aleatória
                    (random.nextGaussian()) com drift. O método deve receber o preço inicial,
                    a média do retorno diário, a volatilidade e o número de períodos (em dias).
*/
                double precoInicial = 100;
                double mediaRetorno = 0.001;
                double volatilidadeDiaria = 0.02;
                int periodos = 10;
                System.out.println(Arrays.toString(simularPrecoMonteCarlo(precoInicial, mediaRetorno, volatilidadeDiaria, periodos)));
                break;
            default:
                System.out.println("Opção inválida.");
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
        for (int i = 0; i < mediaMovelPrecos.length; i++) mediaMovelPrecos[i] = (precos[i] + precos[i+1] + precos[i+2]) / tempo;
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

    private static double calcularVolatilidade(double[] retornosDiarios) {
        double media = calculoDeMedia(retornosDiarios);
        double variancia = calculoDeVariancia(retornosDiarios, media);
        return Math.sqrt(variancia);
    }

    private static double calculoDeMedia (double[] valores) {
        double soma = 0;
        for (double i : valores) soma += i;
        return  soma / valores.length;
    }

    private static double calculoDeVariancia (double[] valores, double media) {
        double soma = 0;
        for (double i : valores) soma += Math.pow(i - media, 2);
        return soma / valores.length;
    }

    private static double simularCarteira(double[] valores, double[] retornos) {
        if (valores.length != retornos.length) return 0;
        double saldoFinal = 0;
        for (int i = 0; i < valores.length; i++) {
            saldoFinal += valores[i] * (1 + retornos[i]);
        }
        return saldoFinal;
    }

    private static double calcularJurosCompostos(double capitalIni, double taxaJurosMensal, int numMeses) {
        double saldoTotal = 0;
        saldoTotal += capitalIni * Math.pow(1 + taxaJurosMensal, numMeses);
        return saldoTotal;
    }

    private static double calcularCorrelacao(double[] serie1, double[] serie2) {
        if (serie1.length != serie2.length) return 0;
        int tamanho = serie1.length;

        double mediaSerie1 = calculoDeMedia(serie1);
        double mediaSerie2 = calculoDeMedia(serie2);

        double[] diferencaMedias1 = new double[tamanho];
        double[] diferencaMedias2 = new double[tamanho];

        double[] produtoDiferenca = new double[tamanho];

        double somaProdutoDiferenca = 0;

        double[] listaQuadradoDiferenca1 = new double[tamanho];
        double[] listaQuadradoDiferenca2 = new double[tamanho];
        double totalDiferenca1 = 0;
        double totalDiferenca2 = 0;

        for (int i = 0; i < tamanho; i++) {
            diferencaMedias1[i] = serie1[i] - mediaSerie1;
            diferencaMedias2[i] = serie2[i] - mediaSerie2;
            produtoDiferenca[i] = diferencaMedias1[i] * diferencaMedias2[i];
        }

        for (double i : produtoDiferenca) somaProdutoDiferenca += i;

        for (int i = 0; i < tamanho; i++) {
            listaQuadradoDiferenca1[i] = produtoDiferenca[i] / 2;
            listaQuadradoDiferenca2[i] = produtoDiferenca[i] * 2;
            totalDiferenca1 += listaQuadradoDiferenca1[i];
            totalDiferenca2 += listaQuadradoDiferenca2[i];
        }

        double resultado = 0;

        resultado = somaProdutoDiferenca / (Math.sqrt(totalDiferenca1 * totalDiferenca2));
        return resultado;
    }

    private static double[] simularPrecoMonteCarlo(double precoInicial, double mediaRetornoDiario, double volatilidade, int numDias) {
        double[] precosSimulados = new double[numDias];
        Random random = new Random();
        double Z = random.nextGaussian();
        precosSimulados[0] = precoInicial;
        for (int i = 1; i < precosSimulados.length; i++) {
            precosSimulados[i] = precosSimulados[i-1] * Math.exp(mediaRetornoDiario+(volatilidade*Z));
        }
        return precosSimulados;
    }

}
