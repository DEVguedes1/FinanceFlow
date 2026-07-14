package org.example.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JPanel painelMenu;
    private JPanel painelConteudo;

    public TelaPrincipal(String title){
        setTitle(title);
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        inicializarComponentes();
    }

    private void inicializarComponentes(){
        this.painelMenu = new JPanel();
        add(painelMenu,BorderLayout.WEST);
        painelMenu.setLayout(new GridLayout(0, 1, 0, 10));

        this.painelConteudo = new JPanel();
        add(painelConteudo, BorderLayout.CENTER);
    }
}
