package com.company;

public class ContaTeste {

    public static void main(String[] args) {
        Conta.cpmf = 0.02;

        Conta conta1 = new Conta();
        conta1.conta = 101;
        conta1.nome = "Jonas t";
        conta1.agencia = 727;
        conta1.efetuarDeposito(90000);
        conta1.efetuarSaque(110);
        conta1.exibirSaldo();


        Conta conta2 = new Conta();
        conta2.conta = 101;
        conta2.nome = "Erika";
        conta2.agencia = 121;
        conta2.efetuarDeposito(8000);
        conta2.efetuarSaque(100);
        conta2.exibirSaldo();

    }
}
