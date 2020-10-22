package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here

        Computador comp1 = new Computador();
        //atribuir na mao, ou pedir para o usuario entrar com dados.
        comp1.setMarca("hP");
        comp1.setModelo("IT 90");
        comp1.setCor("Prata");
        comp1.setNumeroSerie(12345);
        comp1.setPreco(2500.0);
        comp1.imprimir();
        System.out.println(); //pular uma linha
        comp1.calcularValor();
        comp1.imprimir();

        System.out.println();
        Computador comp2 = new Computador();
        comp2.setMarca("IBM");
        comp2.setModelo("IBM X45");
        comp2.setCor("Preta");
        comp2.setNumeroSerie(23456);
        comp2.setPreco(5000.0);
        comp2.imprimir();
        comp2.calcularValor();
        System.out.println();
        comp2.imprimir();
        int resposta = comp2.alterarValor(-8990.0);
        System.out.println();
        if(resposta==1){
            System.out.println("Valor Alterado com Sucesso");
        }else{
            System.out.println("Valor NÃO alterado");
        }

        comp2.imprimir();

    }
}
