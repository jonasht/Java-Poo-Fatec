package com.company;

public class Main { // tem que suar main aqui porque o java 11 não aceita o java 8 sim
    void alterar(int a){
        a = 100;
        System.out.println("a interno = " + a);
    }

    public static void main(String[] args) {

        Main obj = new Main();
        int a  =  28;
        obj.alterar(a);
        System.out.println("mostrar a da pilha do main: " + a);
    }
}