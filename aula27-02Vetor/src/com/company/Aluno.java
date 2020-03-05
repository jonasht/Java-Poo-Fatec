
package com.company;

import java.util.Scanner;

public class Aluno {
    private int rg;
    private String nome;
    private String email;

    public void cadastrar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Aluno nome: ");
        nome = sc.nextLine();

        System.out.println("RG: ");
        rg = Integer.parseInt(sc.nextLine());

        System.out.println("email: ");
        email = sc.nextLine();

        System.out.println("Cadastrado afetuado sucesso ");
    }

    public void imprimir(){

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("nome : " + nome);
        System.out.println("RG : " + rg);
        System.out.println("email : " + email);
    }
}