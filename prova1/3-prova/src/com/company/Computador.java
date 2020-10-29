package com.company;

public class Computador {
    private int idComputador;
    private String nomeComputador;
    private int qtdMemeoria;
    private double valor;

    public int getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(int idComputador) {
        this.idComputador = idComputador;
    }

    public String getNomeComputador() {
        return nomeComputador;
    }

    public void setNomeComputador(String nomeComputador) {
        this.nomeComputador = nomeComputador;
    }

    public int getQtdMemeoria() {
        return qtdMemeoria;
    }

    public void setQtdMemeoria(int qtdMemeoria) {
        this.qtdMemeoria = qtdMemeoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



    public void listarDados(){
        System.out.println("==============================");
        System.out.println("dados:");
        System.out.println("idComputador = " + getIdComputador());
        System.out.println("nomeComputador = " + getNomeComputador());
        System.out.println("qtdMemeoria = " + getQtdMemeoria());
        System.out.println("valor = " + getValor());
    }

    public void atualizarPreco(double valor){
        System.out.println("================");
        setValor(valor);
        //usuNivel();
    }
}
