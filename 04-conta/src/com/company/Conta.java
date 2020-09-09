package com.company;

public class Conta {
    public int conta;
    public int agencia;
    public double saldo;
    public String nome;
    public static double cpmf = 0.01; // compartilhamento p todos os objetos do tipo (conta)

    public void efetuarSaque(double valor){
        saldo = saldo - (valor + (valor * cpmf));

    }

    public void efetuarDeposito(double valor){
        saldo = saldo + valor;

    }

    public void exibirSaldo(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("dados:");
        System.out.println("nome = " + nome);
        System.out.println("saldo da conta: " + saldo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
