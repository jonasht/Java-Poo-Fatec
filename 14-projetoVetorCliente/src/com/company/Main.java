package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        // vetor para tres clientes

        Cliente[] clientes = new Cliente[3];

        // entrada de dados dos clientes
        for (int i = 0; i < 3; i++) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            clientes[i] = new Cliente();
            System.out.println("digite o id do cliente:");
            clientes[i].setId(Integer.parseInt(sc.nextLine()));

            System.out.println("digite o nome do cliente:");
            clientes[i].setNome(sc.nextLine());
            System.out.println();

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(clientes[i].toString());
        }
    }
}
