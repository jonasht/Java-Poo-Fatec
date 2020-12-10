// read me
// não estah sendo possivel recuperar a conta das pessoas que acabaram de fazer cadastro
// mas para quem cadastro escrevendo no codigo está funcionando normalmente

package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecuperarContaPage implements ActionListener {
    JFrame frame = new JFrame();

    JLabel telaCadastro_lb = new JLabel("recupere sua nova conto");
    JLabel login_lb = new JLabel("login: ");
    JTextField login_field = new JTextField();

    JLabel senha_lb = new JLabel("senha: ");
    JLabel mostrarSenha_lb = new JLabel("----------");

    JButton recuperar_bt = new JButton("recuperar");

    JButton voltar_bt = new JButton("voltar");
    JLabel mensagem_lb = new JLabel();


    RecuperarContaPage(){

        login_lb.setBounds(50, 100, 75, 25);
        login_field.setBounds(125, 100, 200, 25);

        senha_lb.setBounds(50, 150, 75, 25);
        mostrarSenha_lb.setBounds(125, 150, 200, 25);

        recuperar_bt.setBounds(125, 200, 200, 25);
        recuperar_bt.setFocusable(false);
        recuperar_bt.addActionListener(this);

        mensagem_lb.setBounds(125, 235, 300, 25);

        voltar_bt.setBounds(125, 300, 200, 25);
        voltar_bt.setFocusable(false);
        voltar_bt.addActionListener(this);

        // colocando na frame
        frame.add(login_lb);
        frame.add(login_field);
        frame.add(senha_lb);
        frame.add(mostrarSenha_lb);
        frame.add(recuperar_bt);
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

        if (actionEvent.getSource()==recuperar_bt) {
            String login = login_field.getText();
            if (loginESenha.getLoginInfo().containsKey(login)){
                mostrarSenha_lb.setForeground(Color.green);
                mostrarSenha_lb.setText((String) loginESenha.getLoginInfo().get(login));
                mensagem_lb.setForeground(Color.green);
                mensagem_lb.setText("senha recuperada com sucesso");
                } else {
                    mostrarSenha_lb.setForeground(Color.red);
                    mostrarSenha_lb.setText("============");

                    mensagem_lb.setForeground(Color.black);
                    mensagem_lb.setText("Login nao cadastrado");
                }

            }
            if (actionEvent.getSource() == voltar_bt) {

                LoginPage loginPage = new LoginPage(loginESenha.longininfo);

                frame.dispose();
            }
        }

}
