package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Aluno vetAlunos[] = new Aluno[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("quantidades de alunos para cadastrar: ");
        int qtd = Integer.parseInt(sc.nextLine());

        if(qtd>10){
            System.out.println("desculpe, só é possivel cadastrar somente 10 alunos");
        }else{

            // um FOR para cadastrar os users
            for (int i = 0; i < qtd; i++) {
                Aluno aluno = new Aluno();
                aluno.cadastrar();
                vetAlunos[i] = aluno;
            }
        }
        for (Aluno aluno: vetAlunos) {

            if(aluno!=null) {
                aluno.imprimir();
            }else{
                break;

            }
        }
    }
}