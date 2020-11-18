package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] x = new int[10];

        Random rand = new Random();
        System.out.println("=-=-=-=-=-=-=-=-=-=");
        System.out.println("nuemros aleatorios");
        for (int i = 0; i < 10; i++) {
            x[i] = rand.nextInt(100);
            System.out.println(i + "-" + x[i]);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=");
    }
}
