package com.agibank.s2exemplo1.semana2;

import java.util.Scanner;

public class Terca {

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

    // 1- Crie um programa que verifique se o número digitado pelo usuário é positivo, negativo ou zero.
    public void atv1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro!");
        int vlr = sc.nextInt();

        if (vlr > 0) {
            System.out.println("Número positivo!");
        } else if (vlr == 0){
            System.out.println("Número igual a zero!");
        } else {
            System.out.println("Número negativo!");
        }
    }
    //2- Crie um programa que verifique se o número digitado pelo usuário é par ou ímpar
    public void atv2() {
        System.out.println("Digite um número para verificarmos se ele é par ou ímpar");
        Scanner sc = new Scanner(System.in);
        var vlr = sc.nextInt();
        if ((vlr % 2) == 0 ) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }

    //3- Crie um programa em Java que mostre a situação de um atleta de acordo com seu IMC

    public void atv3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso em quilogramas!");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura em centimetros!");
        float altura = sc.nextFloat();
        float alturaEmMetros = altura / 100;

        float imc = peso / (alturaEmMetros * alturaEmMetros);
        System.out.printf("Seu IMC é %f\n",  imc);

        if  (imc < 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc < 25) {
            System.out.println("Seu peso está normal!");
        } else if (imc <= 30) {
            System.out.println("Você está sobrepeso!");
        } else {
            System.out.println("Obesidade!");
        }
    }

    //4- Crie um programa que verifique o quanto um valor se aproxima da média, em percentual. Entre com o valor e a média.

    public void atv4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor!");
        float vlr = sc.nextFloat();
        System.out.println("Digite a média!");
        float media = sc.nextFloat();

        float calcPercentMedia = Math.abs((vlr - media) / media) * 100;

        System.out.printf("O valor %.2f está %.0f %% proximo da média: %.2f ", vlr, calcPercentMedia, media);

    }
    //5- Crie um programa que verifique a situação de um aluno através de sua nota final em uma disciplina. Aprovado: 6 ou acima; Exame: entre 4 (inclusive) e 6 (exclusivo). Reprovado: abaixo de 4
    public void atv5 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota final de 0 a 10");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 10){
            System.out.println("Nota inválida!");
            System.exit(1);
        }

        if (nota >= 6) {
            System.out.println("Parabéns, você está aprovado!");
        } else if (nota < 6 && nota >= 4) {
            System.out.println("Necessário fazer exame por conta da nota: " + nota);
        } else {
            System.out.println("Reprovado por conta da nota baixa!\nNota: " + nota);
        }
    }
}
