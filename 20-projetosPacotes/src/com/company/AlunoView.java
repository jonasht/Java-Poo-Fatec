package com.company;

import com.company.model.Aluno;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AlunoView {
    private JPanel panelAluno;
    private JButton sairButton;
    private JButton gravarButton;
    private JTextField textNome;
    private JTextField textRA;

    public AlunoView() {
        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                Aluno aluno = new Aluno();
                aluno.setRa(Integer.parseInt(textRA.getText()));
                aluno.setNome(textNome.getText());

                JOptionPane.showMessageDialog(null,
                        "gravando: " + aluno.toString(),
                        "Gravado com sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public JPanel getPanelAluno() {
        return panelAluno;
    }
}
