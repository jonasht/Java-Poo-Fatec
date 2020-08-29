package com.company;

/*
esse codigo foi codado por jonas
that code was coded by jonas

 */
public class Conta {

    public int numero;
    public String nomeCliente;
    public double saldo;
    public static double cpmf;

    //remove -
    public void efetuarSaque(double valor){
        saldo -= (valor + (valor * cpmf));

    }
    //coloca +
    public void efetuarDeposito(double valor){
        saldo += valor;
    }

    public void mostrarExtrato(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("\tInformações da conta:\n");
        System.out.println("numero: " + numero);
        System.out.println("nome: " + nomeCliente);
        System.out.println("saldo: " + saldo);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
