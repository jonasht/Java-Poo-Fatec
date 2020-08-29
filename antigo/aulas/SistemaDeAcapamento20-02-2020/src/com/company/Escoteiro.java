package com.company;

public class Escoteiro {

    protected char grupo;
    public int id;
    public String nome;
    public int idade;

    public void registrrAcapamento(){
        if (idade <= 5){
            grupo = '-';
            return;
        }

        if (idade < 11){
            grupo = 'A';
            return;
        }

        if (idade < 18){
            grupo = 'B';
            return;
        }

        grupo = 'C';// se não cair em nenhum IF, vai cair aqui, mas se cair em um IF não vai passar aqui por causa do return;
    }

    public void mostrar(){

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("\tInformações do acampamento:");
        System.out.println("\nnome do escoteiro:" + nome);
        System.out.println("id: " + id);
        System.out.println("idade:");
        System.out.println("foi selocionado para o");
        System.out.println("Grupo: " + grupo);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

}
