package com.agibank.s2exemplo1.semana7;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca, int carr) {
    }

    public void mostrarInformacoes() {
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
    }

    public String getMarca() {
        return marca;
    }





    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Acelerando");
    }
}

