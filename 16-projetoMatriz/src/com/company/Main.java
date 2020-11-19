package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] matriz = new int[3][5];
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < 3; i++) {
            Arrays.fill(matriz[i], 15);
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
