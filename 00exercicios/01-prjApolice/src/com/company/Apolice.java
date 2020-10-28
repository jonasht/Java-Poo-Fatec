package com.company;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    void imprimir(){
        System.out.println("==========================");
        System.out.println("nome do segurado: " + getNomeSegurado());
        System.out.println("idade: " + getIdade());
        System.out.println("premio: " + getValorPremio() + " dolares");


        System.out.println("==========================");
    }

}
