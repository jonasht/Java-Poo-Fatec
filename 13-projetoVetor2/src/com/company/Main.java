package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random rand = new Random();

        int[] vetor = new int[10];
        System.out.println("numeros aleatorios não ordenados");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(50);
            System.out.println(vetor[i]);
        }

        Arrays.sort(vetor);
        System.out.println();
        System.out.println("numeros ordenados:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
