package com.company;

public class Computador {
    
    //criar os atributos
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    //métodos getters and setters
    //<alt> + <insert>

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //métodos do exercício
    public void imprimir(){
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("marca = " + marca);
        System.out.println("-----------------------------------");
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
            return;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }
    public int alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }
        return 0;
    }
}
