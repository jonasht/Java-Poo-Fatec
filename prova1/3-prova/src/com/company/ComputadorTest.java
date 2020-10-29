package com.company;

public class ComputadorTest {

    public static void main(String[] args) {
	// write your code here
        Computador c1 = new Computador();

        c1.setIdComputador(123);
        c1.setNomeComputador("ThinkPad");
        c1.setQtdMemeoria(20000);
        c1.setValor(25000.50f);
        Computador c2 = new Computador();
        c2.setIdComputador(123);
        c2.setNomeComputador("ThinkPad");
        c2.setQtdMemeoria(20000);
        c2.setValor(25000.50f);

        c1.listarDados();
        c1.atualizarPreco(1000);
        c1.listarDados();
        c1.atualizarPreco(2000);

    }
}
