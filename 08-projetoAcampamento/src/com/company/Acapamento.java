package com.company;

public class Acapamento {
    // atributos

    public String nome;
    public char equipe;
    public int idade;

    // metados
    public void imprimir(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("dados do membro do acampamento");
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("equipe = " + equipe);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public void separarGrupo(){
        if(idade < 6){
            equipe = '-';
            return;
        }
        if(idade < 11){
            equipe = 'A';

        }
        if(idade < 21){
         equipe = 'B';
         return;
        }
        equipe = 'C';
    }


}
