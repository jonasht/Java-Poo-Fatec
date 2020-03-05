package com.company;

public class GerenciadorDeConta {
    public static void main(String[] variavel) {
        Conta.cpmf = 0.01;

        Conta conta1;

        conta1 = new Conta();
        conta1.numero = 123;
        conta1.nomeCliente = "Angela Saurino";
        conta1.cpmf = 0.02;
        conta1.efetuarDeposito(5000.0);
        conta1.efetuarSaque(500.0);
        conta1.mostrarExtrato();

        Conta conta2;

        conta2 = new Conta();
        conta2.numero = 234;
        conta2.nomeCliente = "Caulino Saurino";
        conta2.cpmf = 0.02;
        conta2.efetuarDeposito(8000.0);
        conta2.efetuarSaque(3.0);
        conta2.mostrarExtrato();


    }
}
