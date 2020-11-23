package com.company;

import javax.swing.*;

public class GeranciarEscola {

    public static void main(String[] args) {
	// write your code here
        System.out.println("projetos pacotes");
        //apresentar a tela para o usuario
        JFrame janela = new JFrame("cadastro aluno");
        janela.setContentPane(new AlunoView().getPanelAluno());
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);
        System.out.println("fim de programa");




    }
}
