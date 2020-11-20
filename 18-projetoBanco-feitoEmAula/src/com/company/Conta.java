package com.company;

public abstract class Conta {
    //atributos
    private int numero;
    private String nome;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metdos
    public void depositar(double valor){
        System.out.println("valor sendo depositado "+ valor);
        saldo += valor;
        System.out.println("total: " + valor);

    }

    public boolean sacar(double valor){

        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
