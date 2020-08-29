
package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 54;
        String oque = "Levels";
        String resultado;
        String strA = String.valueOf(a);
        resultado = "upei" + strA + " " + oque;

        System.out.println("=-=-=-=-=-=-=-=-=-=-");
        System.out.println("resultado = " + resultado);
        int valorA = Integer.parseInt(strA);
        int v[] = new int[10];
        Random r = new Random();
        for (int i = 0; i <10; i++) {
            v[i] = r.nextInt(100);
        }
        for(int x : v){
            System.out.println("get item = " + x);
        }
    }
}