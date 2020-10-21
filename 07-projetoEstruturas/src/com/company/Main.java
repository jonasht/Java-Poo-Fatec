package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 0 ; i <= 10 ; i++){
            if (i % 3 == 0) continue;
            System.out.println("i = " + i);
        }

        System.out.println("fim do primeiro programa");

        boolean continua = true;
        int x = 19;

        do {
            System.out.println("estou no laço...");
            System.out.println("valor de x = " + x);
            if (x > 200) {
                continua = false;
            }
            x += 12;

        }while (continua);
        System.out.println("valor do x final = " + x);



    }
}
