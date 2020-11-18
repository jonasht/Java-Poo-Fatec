package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	// write your code here

        // representar uma pessoa que tenha dois carros
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("digite o id da pessoa:");
        pessoa.setId(Integer.parseInt(sc.nextLine()));

        System.out.println("digite o nome da pessoa:");
        pessoa.setName(sc.nextLine());

        System.out.println("digite o email");
        pessoa.setEmail(sc.nextLine());

        List<Carro> listaDeCarros = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Carro c = new Carro();
            System.out.println("digite a marca do carro:");
            c.setMarca(sc.nextLine());

            System.out.println("digite o modelo do carro:");
            c.setModelo(sc.nextLine());
            listaDeCarros.add(c);
        }

        // ligar a lista local na lista de carros
        pessoa.setCarros(listaDeCarros);

        System.out.println(pessoa.toString());

    }
}
