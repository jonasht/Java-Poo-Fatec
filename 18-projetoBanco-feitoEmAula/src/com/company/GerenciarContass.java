package com.company;

public class GerenciarContass {

    public static void main(String[] args) {
	// write your code here // escreva seu codigo aqui

        Poupanca poupanca = new Poupanca();

        Corrente corrente = new Corrente();

        poupanca.setNome("maria");
        poupanca.setNumero(123);
        poupanca.setDiaAniversario(10);
        poupanca.depositar(100);


        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nome do cliente da poupança:" + poupanca.getNome());

        boolean operacao = poupanca.sacar(50);

        if(operacao){
            System.out.println("saque realizado com sucesso");
        }else {
            System.out.println("saldo insuficiente");
        }

        System.out.println("saldo de " + poupanca.getNome() + ": " + poupanca.getSaldo());


        // para conta corrente
        corrente.setNumero(234);
        corrente.setNome("rafael");
        corrente.depositar(1000);
        corrente.setLimite(500);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nome do cliente: " + corrente.getNome());
        System.out.println("saldo atual: " + corrente.getSaldo());

        operacao = corrente.sacar(500);

        if(operacao){
            System.out.println("saque realizado com sucesso");
        }else {
            System.out.println("saldo insuficiente");
        }

        System.out.println("saldo atual: " + corrente.getSaldo());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Corrente corrente1 = new Corrente();
        corrente1.setSaldo(1000);

        GerenciarPatrimonioBanco gp = new GerenciarPatrimonioBanco();
        gp.adicionarConta(corrente);
        gp.adicionarConta(poupanca);
        gp.adicionarConta(corrente1);

        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("total do dinheiro dos clientes no banco: " );
        System.out.println(gp.getTotalPatrimonio());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
