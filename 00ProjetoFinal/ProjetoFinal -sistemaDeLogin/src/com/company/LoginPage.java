package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton login_bt = new JButton("Entrar");
    JButton resetar_bt = new JButton("Resetar");
    JButton cadastrar_bt = new JButton("Registrar-se");
    JButton recuperConta_bt = new JButton("Recuperar Conta");

    JTextField login_field = new JTextField();
    JPasswordField senha_field = new JPasswordField();

    JLabel login_lb = new JLabel("Login: ");
    JLabel senha_lb = new JLabel("senha:");
    JLabel message_lb = new JLabel("==========");

    HashMap<String, String> logininfo = new HashMap<String, String>();


    LoginPage(HashMap<String, String> loginInfoOriginal){
        logininfo = loginInfoOriginal;

        // =-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-==-=-=-=-=
        login_lb.setBounds(50, 100, 75, 25);
        senha_lb.setBounds(50, 150, 75, 25);


        message_lb.setBounds(125, 250, 250, 35);
        message_lb.setFont(new Font(null, Font.ITALIC, 25));

        login_field.setBounds(125, 100, 200, 25);
        senha_field.setBounds(125, 150, 200, 25);

        login_bt.setBounds(225, 200, 100, 25);
        login_bt.setFocusable(false);
        login_bt.addActionListener(this);

        resetar_bt.setBounds(125, 200, 100, 25);
        resetar_bt.setFocusable(false);
        resetar_bt.addActionListener(this);

        cadastrar_bt.setBounds(125, 300, 200, 25);
        cadastrar_bt.setFocusable(false);
        cadastrar_bt.addActionListener(this);

        recuperConta_bt.setBounds(125, 335, 200, 25);
        recuperConta_bt.setFocusable(false);
        recuperConta_bt.addActionListener(this);

        // add na tela
        frame.add(login_lb);
        frame.add(senha_lb);
        frame.add(message_lb);
        frame.add(login_field);
        frame.add(senha_field);

        frame.add(login_bt);
        frame.add(resetar_bt);
        frame.add(cadastrar_bt);
        frame.add(recuperConta_bt);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        LoginESenha loginESenha = new LoginESenha();

        if(actionEvent.getSource()== cadastrar_bt){
            CadastroPage cadastroPage = new CadastroPage();
            frame.dispose();
        }
        if(actionEvent.getSource()== recuperConta_bt){
            RecuperarContaPage recuperarContaPage = new RecuperarContaPage();
            frame.dispose();
        }
        if(actionEvent.getSource()== resetar_bt){
            login_field.setText("");
            senha_field.setText("");

        }
        if(actionEvent.getSource()== login_bt){

            String login = login_field.getText();
            String password = String.valueOf(senha_field.getPassword());

            if(logininfo.containsKey(login)){
                if(logininfo.get(login).equals(password)){
                    message_lb.setForeground(Color.green);
                    message_lb.setText("carregando...");

                    //dispose remove a antiga frame p ql entrarah
                    frame.dispose();
                    DepoisDoLoginPage welcomePage = new DepoisDoLoginPage(login);

                }else {
                    message_lb.setForeground(Color.red);
                    message_lb.setText("senha incorreta");
                }
            }else{
                message_lb.setForeground(Color.cyan);
                message_lb.setText("usuario incorreto");
            }

        }

    }
}
