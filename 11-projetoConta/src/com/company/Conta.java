package com.company;

public class Conta {
    private String conta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    //getters and setter <alt> + <ins>

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return 1;
        }
        return 0;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Dados da conta");
        System.out.println("conta = " + conta);
        System.out.println("agencia = " + agencia);
        System.out.println("nomeCliente = " + nomeCliente);
        System.out.println("saldo = " + saldo);
        System.out.println();
    }
}
