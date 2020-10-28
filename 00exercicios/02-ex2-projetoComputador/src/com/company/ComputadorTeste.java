package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	// write your code here
        System.out.println("\n\n\nfeito no windows \n\n");

        Computador p1 = new Computador();
        p1.marca = "HP";
        p1.cor = "amarelo";
        p1.modelo = "alguom";
        p1.numeroSerie = 6466;
        p1.preco = 20000.50f; // crise do coronavirus

        p1.imprimir();
        p1.calcularValor();
        p1.imprimir();


        Computador p2 = new Computador();
        p2.marca = "IBM";
        p2.cor = "preto";
        p2.modelo = "antigo thinkpad";
        p2.numeroSerie = 648866;
        p2.preco = 20000.50f; // crise do coronavirus

        p2.imprimir();
        p2.calcularValor();
        p2.imprimir();

        Computador p3 = new Computador();
        p3.marca = "purism";
        p3.cor = "preto";
        p3.modelo = "seguro";
        p3.numeroSerie = 648866;
        p3.preco = 30000.70f; // crise do coronavirus

        int r = p3.alterarValor(50000f);
        if (r == 1) System.out.println("valor alterado com sucesso");
    else System.out.println("valor não alterado");
    }
}
