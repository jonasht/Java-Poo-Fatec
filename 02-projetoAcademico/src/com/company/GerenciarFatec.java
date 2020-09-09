package com.company;

public class GerenciarFatec {

    public static void main(String[] args) {
	// write your code here
        //matriculando os 2 alunos
        Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        aluno2 = new Aluno();

        // dar as caracteristicas do aluno 1 e 2
        aluno1.ra = 412;
        aluno1.nome = "Jonas Teixeira";
        aluno1.email = "jonas@mail.com";


        aluno2.ra = 472;
        aluno2.nome = "Pedro pedraso";
        aluno2.email = "pedro@mail.com";

        // matricular
        aluno1.matricular();
        aluno2.matricular();

        // as acoes com os objetos, matricular os 2 alunos
        aluno1.apresentarDadosAluno();
        aluno1.apresentarDadosAluno();

        // cancelar a matricula do aluno
        aluno2.cancelarMatricula();
    }
}