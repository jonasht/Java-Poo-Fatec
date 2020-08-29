package com.company;

public class GerenciadorDeAcapamento {

    public static void main(String[] args) {
        Escoteiro escoteiro1 = new Escoteiro();
        escoteiro1.id = 123;
        escoteiro1.nome = "Anderson";
        escoteiro1.idade = 13;

        escoteiro1.mostrar();

        escoteiro1.registrrAcapamento();
        escoteiro1.mostrar();


        Escoteiro escoteiro2 = new Escoteiro();
        escoteiro2.id = 234;
        escoteiro2.nome = "Roberto";
        escoteiro2.idade = 7;

        escoteiro2.registrrAcapamento();

        escoteiro2.mostrar();

        Escoteiro escoteiro3 = new Escoteiro();
        escoteiro3.id = 345;
        escoteiro3.nome = "Socrates";
        escoteiro3.idade = 18;

        escoteiro3.registrrAcapamento();

        escoteiro3.mostrar();
    }
}
