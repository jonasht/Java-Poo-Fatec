package com.company;

public class Aluno {

    // atributos
    public int ra;
    public String nome;
    public String email;

    // metados
    public void matricular(){
        System.out.println("Aluno " + nome + ", matriculado com sucesso ");
    }

    public void cancelarMatricula(){
        System.out.println("matricula cancelado, aluno de ra: " + ra);
    }


    public void apresentarDadosAluno() {

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Dados do aluno:");
        System.out.println("nome = " + nome);
        System.out.println("ra = " + ra);
        System.out.println("email = " + email);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

    }
}
