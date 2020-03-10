package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int a = 20;
        String mercadoria = "Peras";
        String resultado = null; // oresultado tem de ser null porque senão não funciona

        String letraA = String.valueOf(a);
        System.out.println("adquirido" + resultado);

        int valordeA = Integer.parseInt(letraA);
        int v[] = new int[10];
        Random ale = new Random();

        for (int i = 0; i < 10; i++) {
            v[i] = ale.nextInt(100);


        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int ii : v) {
            System.out.println("\titem = " + ii);

        }


    }
}

