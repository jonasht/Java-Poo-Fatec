package com.company;

public class Conta {
    public int numero;
    public double saldo;

    /**
     * para o valor Valor a ser cobrado p deposito da conta corrente do cliente
     */

    public void depositar(double valor){
        saldo += valor;
    }
    /**
     * Valor a se informado do tido double p retirada da conta
     */

    public void sacar(double valor){
        saldo -= valor;
    }

}
