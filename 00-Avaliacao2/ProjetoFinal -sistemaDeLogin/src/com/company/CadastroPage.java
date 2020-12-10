package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPage implements ActionListener {
    JFrame frame = new JFrame();

    JLabel telaCadastro_lb = new JLabel("cadastre sua nova conta");

    JLabel login_lb = new JLabel("login: ");
    JTextField login_field = new JTextField();

    JLabel senha_lb = new JLabel("senha: ");
    JTextField senha_field = new JTextField();

    JButton cadastrar_bt = new JButton("registrar-se");

    JButton voltar_bt = new JButton("Voltar");

    JLabel mensagem_lb = new JLabel();




    CadastroPage(){
        telaCadastro_lb.setBounds(50, 0, 300, 25);

        login_lb.setBounds(50, 100, 75, 25);
        login_field.setBounds(125, 100, 200, 25);

        senha_lb.setBounds(50, 150, 75, 25);
        senha_field.setBounds(125, 150, 200, 25);

        mensagem_lb.setBounds(125, 250, 200, 25);

        cadastrar_bt.setBounds(125, 200, 200, 25);
        cadastrar_bt.setFocusable(false);
        cadastrar_bt.addActionListener(this);

        voltar_bt.setBounds(125, 300, 200, 25);
        voltar_bt.setFocusable(false);
        voltar_bt.addActionListener(this);

        // colocando na frame
        frame.add(telaCadastro_lb);
        frame.add(login_lb);
        frame.add(login_field);
        frame.add(senha_lb);
        frame.add(senha_field);
        frame.add(cadastrar_bt);
        frame.add(mensagem_lb);
        frame.add(voltar_bt);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        LoginESenha loginESenha = new LoginESenha();
        if(actionEvent.getSource()==cadastrar_bt) {
            if (loginESenha.getLoginInfo().containsKey(login_field.getText())) {
                mensagem_lb.setForeground(Color.red);
                mensagem_lb.setText("Esta conta já existe");
            }

                String login = login_field.getText();
                String senha = senha_field.getText();
                loginESenha.setLongininfo(login, senha);

                LoginPage loginPage = new LoginPage(loginESenha.getLoginInfo());

                frame.dispose();
        }

        if(actionEvent.getSource()==voltar_bt){
            LoginPage loginPage = new LoginPage(loginESenha.longininfo);
            frame.dispose();
        }
    }
}
