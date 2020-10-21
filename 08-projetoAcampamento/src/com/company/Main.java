package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("feito no linux");

        Acapamento membro = new Acapamento();
        Scanner ler = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("digite nome do membro do acampamento:");
        membro.nome = ler.nextLine();

        System.out.println("digite a idade do membro do acampamento:");
        membro.idade = Integer.parseInt(ler.nextLine());

        membro.imprimir();

        membro.separarGrupo();

        membro.imprimir();



    }
}
