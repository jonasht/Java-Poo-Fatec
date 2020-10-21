package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // estudando/fazendo com carinho

        // sexa da pessoa, valor do salario, idade e nome da pessoa

        char sexo;
        double salario;
        int idade;
        String nome;


        Scanner ler = new Scanner(System.in);

        System.out.println("nome: ");
        nome = ler.nextLine();

        System.out.println("sexo: ");
        sexo = ler.nextLine().charAt(0);

        System.out.println("salario:  ");
        salario = Double.parseDouble(ler.nextLine());

        System.out.println("idade: ");
        idade = Integer.parseInt(ler.nextLine());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("sexo = " + sexo);
        System.out.println("salario = " + salario);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        double valor = 3434.3434f;
        System.out.println("valor = " + valor);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
