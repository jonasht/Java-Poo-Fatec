package com.company;

public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public int sacar(double valor){

        if (saldo > 0) {
            System.out.println("valor do saque: " + valor);
            saldo -= valor;

            return 1;

        }else{
            return 0;
        }

    }

    public void depositar(double valor){
        System.out.println("valor do deposito: " + valor);
        saldo += valor;
    }

    public void imprimir(){
        System.out.println("================================");
        System.out.println("conta = " + conta);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("agencia = " + agencia);
        System.out.println("saldo = " + saldo);
        System.out.println("================================");

    }

}
