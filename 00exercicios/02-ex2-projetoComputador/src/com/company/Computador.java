package com.company;

public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    public void imprimir(){
        System.out.println("===================================");
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preço = " + preco);
        System.out.println("===================================");




    }
    public void calcularValor(){
        if (marca == "HP"){
            preco *= 1.30;
        }
        if (marca == "IBM"){
            preco *= 1.50;
        }
    }
    public int alterarValor(double v){
        if (v > 0){
            preco = v;
            return 1;
        }
        return 0;
    }
}
