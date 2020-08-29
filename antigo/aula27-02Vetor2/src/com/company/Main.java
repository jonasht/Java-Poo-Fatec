package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int vetor1[] = {1,3,5,7,9,11,13,15,17,19};
        int vetor2[] = new int[20];
        Arrays.fill(vetor2, 30);
        System.arraycopy(vetor1, 2, vetor2, 0, 5);

        for (int i = 0; i < vetor2.length ; i++) {
            System.out.printf("vetor 2 [%d] = %d \n", i, vetor2[i]);
        }
    }
}
