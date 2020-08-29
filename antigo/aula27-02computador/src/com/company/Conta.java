package com.company;

public class Conta {
    public  String nomeCliete;
    public  String conta;
    public  String agencia;
    public double saldo;

    public void mostrar(){

        System.out.println("===-===-===-===-===-===-===-===-===-===");

        System.out.println("nomeCliete = " + nomeCliete );
        System.out.println("\nagencia = " + agencia);
        System.out.println("conta = " + conta);
        System.out.println("saldo = " + saldo);
    }

    public int sacar(double valor){

        if (valor <= saldo){
            saldo -= valor;
            return -1;
        }
        return 0;

    }
    public void depositar(double valor){
        saldo += valor;
    }


}
