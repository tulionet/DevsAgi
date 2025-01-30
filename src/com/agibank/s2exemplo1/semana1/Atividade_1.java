package com.agibank.s2exemplo1.semana1;

import java.util.Scanner;

public class Atividade_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a sua idade para abertura de conta");
            int idade = scan.nextInt();

            if (idade < 18) {
                System.out.printf("Sua idade " + idade + " não bate com nossas diretrizes!");
            } else {
                System.out.println("Parabens, conta criada!");
                System.out.println("Digite seu saldo de conta");
                float saldo = scan.nextFloat();
                System.out.println("Seu limite de conta é: " + saldo * 0.4);

                float mediasaldo = saldo * 12;
                System.out.println("Digite o valor do empréstimo desejado");
                float emprestimo = scan.nextFloat();
                if (mediasaldo > emprestimo * 0.4) {
                    System.out.println("Parabens pelo emprestimo!");
                } else {
                    System.out.println("Não foi possível fazer esse empréstimo!");
                }
            }
        }

/*
            Scanner scan =  new Scanner(System.in);
            System.out.println("Exercicio  1------------------");
            //ex1
            System.out.println("Digite o saldo Mensal Fixo");
            float saldoMensal = scan.nextFloat();
            float saldoTotal = saldoMensal;
            for (int i = 1; i <= 12; i++) {
                System.out.println("O saldo do " + i + " mês é igual a: " + saldoTotal );
                saldoTotal = saldoTotal + saldoMensal;
            }
            System.out.println("Exercicio 2 ------------------");
            //ex2
            float saldoTotalEx2 = 0;
            for (int i = 1; i <= 12; i++) {
                System.out.println("Escreva o saldo desse mês: ");
                float valorMensal = scan.nextFloat();
                saldoTotalEx2 = saldoTotalEx2 + valorMensal;
                System.out.println("O saldo do " + i + " mês é igual a: " + saldoTotalEx2 );
            }

            System.out.println("Exercicio 3 ------------------");
            //ex3
            float vlrInicialEx3 = 1000;
            float saldoTotalEx3 = vlrInicialEx3;
            for (int i = 1; i <= 12; i++) {
                System.out.println("Escreva o saldo desse mês: ");
                float valorMensal = scan.nextFloat();
                saldoTotalEx3 = saldoTotalEx3 * 1.005f;
                saldoTotalEx3 = saldoTotalEx3 + valorMensal;
                System.out.println("O saldo do mês " + i + " é igual a: " + saldoTotalEx3 );
            }




        }
    }
*/

}
