package com.company;

import javax.swing.*;
import java.awt.*;

public class DepoisDoLoginPage {
    Msg msg = new Msg();
    JFrame frame = new JFrame();

    //+_+_+_+_+_+_+_+_+_+_+__+_+_+_++__+_+_+_+_+_

    JLabel mensagem0_lb = new JLabel();
    JLabel mensagem1_lb = new JLabel();

    DepoisDoLoginPage(String userID){
        //colocando a lebal
        mensagem0_lb.setBounds(0, 0, 400, 35);

        mensagem0_lb.setFont(new Font(null, Font.ITALIC, 25));
        mensagem0_lb.setText("bem vindo " + userID);
        mensagem0_lb.setBounds(0, 0, 400, 35);

        mensagem1_lb.setFont(new Font(null, Font.ITALIC, 25));
        mensagem1_lb.setText(msg.getMensagem());
        mensagem1_lb.setBounds(0, 100, 400, 35);

        frame.add(mensagem0_lb);
        frame.add(mensagem1_lb);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
