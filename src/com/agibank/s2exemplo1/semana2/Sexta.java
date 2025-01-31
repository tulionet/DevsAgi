package com.agibank.s2exemplo1.semana2;


import java.util.Scanner;

public class Sexta {
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
/*  O usuário informa seus gastos mensais um por um. O programa soma os valores e para quando
    um gasto negativo for digitado. Se o total ultrapassar
    R$ 5000, o programa exibe um alerta*/
        Scanner sc = new Scanner(System.in);
        double vlrTotal = 0;
        double vlrMensal = 0;
        System.out.println("Calculo de gastos Mensais!");

        while(true) {
            System.out.print("Digite o valor gasto: (Digite 0 para sair) ");
            vlrMensal = sc.nextDouble();
            vlrTotal += vlrMensal;
            if (vlrMensal == 0){
                break;
            } else if (vlrMensal <= 0) {
                System.out.println("Não aceita valores negativos!");
                vlrTotal += Math.abs(vlrMensal);
                break;
            } else if (vlrTotal >= 5000){
                System.out.println("Atenção! você está gastando demais.");
            }
        }
        System.out.println("Total gasto: " + vlrTotal);
    }

    public void atv2() {
/*        O usuário tem uma dívida e quer simular pagamentos mensais fixos.
        A cada mês, o saldo da dívida é reduzido pelo valor pago.
        O programa deve mostrar o saldo atualizado a cada mês até a dívida ser quitada.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Controlador de dívidas!");
        System.out.print("Digite o valor total da sua dívida: ");
        double divida = sc.nextDouble();
        double vlrMensal = 0;
        int cont = 1;

        do {
            System.out.printf("Digite o valor do pagamento do mês %d: ", cont);
            double aporte = sc.nextDouble();
            if (aporte < 0) {
                System.out.println("Não é aceito valores negativos!");
            }else {
            vlrMensal += aporte;
            cont++;
            System.out.printf("Saldo restante: R$%.2f\n", divida - vlrMensal);
            }
        } while(vlrMensal < divida);
        System.out.println("Dívida quitada!");
    }

    public void atv3() {
/*        Simule um caixa eletrônico onde o usuário pode sacar dinheiro.
        O saldo inicial da conta será digitado pelo usuário e o usuário pode fazer saques até que o saldo acabe.
        Se o usuário tentar sacar mais do que tem, o programa exibe uma mensagem de erro.
        O programa acaba quando o valor saque for negativo ou quando a conta for zerada*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Caixa eletrônico virtual!");
        System.out.print("Digite seu saldo inicial para abertura de conta: ");
        double sldInicial = sc.nextDouble();
        System.out.println("Conta aberta!");
        double vlrSaque = 0;
        double sld = sldInicial;

        while(true) {
            System.out.println("Deseja fazer um saque?\n1 - Sim\n2 - Não");
            if (sc.nextByte() != 1) {
                break;
            }
            System.out.print("Digite o valor do saque: ");
            vlrSaque = sc.nextDouble();
            if (vlrSaque > sld) {
                System.out.println("Erro: saldo insuficiente!");
            } else {
                sld -= vlrSaque;
                if (sld == 0) {
                    System.out.println("Saldo zerado! Conta vazia.");
                    break;
                }
                System.out.printf("Novo saldo: R$%.2f\n", sld);
            }
        }
    }

    public void atv4() {
 /*       Um usuário deseja converter Reais (BRL) para dolares(USD), mas há um limite diário de 1000 para conversão.
        O programa deve perguntar o valor desejado, verificar se está dentro do limite e calcular a conversão com
        uma taxa de cambio de 1 USD = 5 BRL.
        O programa termina quando o valor a ser convertido for negativo ou quando atingir o limite diário.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de real para dolar");
        System.out.println("Taxa de câmbio hoje: 1 USD = 5 BRL");
        int limiteConversao = 1000;
        double saldo = 0;

        while(limiteConversao > saldo) {
            System.out.print("Digite o valor a converter: ");
            double vlr = sc.nextDouble();
            saldo += vlr;
            if (limiteConversao < saldo) {
                System.out.printf("Erro: O limite diário de R$%d foi ultrapassado! Encerrando conversões", limiteConversao);
                break;
            }
            System.out.printf("Você receberá %.0f USD\n", vlr / 5);
        }
    }

    //Dev: Tulio Neto
    //Tester: Vini. Buzzo Nota 100

    public void atv5() {
        int velocidade = 0;
        int graus = 0;
        double g = 9.8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a velocidade em m/s");
        velocidade = sc.nextInt();
        System.out.println("Digite a angulação que o projétil foi lançado");
        graus = sc.nextInt();

        double rad = Math.toRadians(graus);
        double x = 0;
        double y = 0;
        double t = 0.01;

        while(y >= 0) {
        x = velocidade * Math.cos(rad) * t;
        y = (velocidade * Math.sin(rad) * t) - ((0.5 * g) * (t * t));
        t += 0.01;
        System.out.printf("X: %.2f Y: %.2f\n", x, y);
        }


    }
}
