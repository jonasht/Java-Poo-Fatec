package com.company;

public class Passagem {

    public static void chamar(Pessoa pessoa) {

	// write your code here

        pessoa.nome = "Gustavo";
        pessoa.idade = 36;
        System.out.println(pessoa.hashCode());

    }

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "ana";
        pessoa1.idade = 14;
        chamar(pessoa1);

        System.out.println("=-=-==-=-==-=-==-=-==-=-==-=-==-=");
        System.out.println("=-=-==-=-==-= dados: =-=-==-=-==-=\n");

        System.out.println("pessoa1.nome = " + pessoa1.nome);
        System.out.println("pessoa1.idade = " + pessoa1.idade);
        System.out.println("hash code: " + pessoa1.hashCode());

        System.out.println("\n=-=-==-=-==-=-==-=-==-=-==-=-==-=");
    }
}
