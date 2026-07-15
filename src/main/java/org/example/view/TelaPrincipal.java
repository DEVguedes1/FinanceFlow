package org.example.view;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private JButton btnVisaoGeral, btnTransacoes, btnCategorias;
    private JPanel painelMenu;
    private JPanel painelConteudo;

    public TelaPrincipal(String title){
        setTitle(title);
        setSize(1024,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        inicializarComponentes();
        estilizarTela();
        configurarEventos();

        setVisible(true);
    }

    private void inicializarComponentes(){
        this.painelMenu = new JPanel();
        add(painelMenu,BorderLayout.WEST);

        JPanel painelBotoes = new JPanel(new GridLayout(3, 1, 0, 15));
        painelBotoes.setOpaque(false);

        this.painelConteudo = new JPanel(new BorderLayout());
        add(painelConteudo, BorderLayout.CENTER);

        this.btnCategorias = new JButton("Categoria");
        this.btnTransacoes = new JButton("Transação");
        this.btnVisaoGeral = new JButton("Visão Geral");

        painelBotoes.add(btnVisaoGeral);
        painelBotoes.add(btnTransacoes);
        painelBotoes.add(btnCategorias);
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        painelMenu.add(painelBotoes, BorderLayout.NORTH);
    }

    private void estilizarTela(){
        painelMenu.setPreferredSize(new Dimension(250,768));

        painelMenu.setBackground(new Color(33, 37, 41));
        painelConteudo.setBackground(new Color(248, 249, 250));

        btnCategorias.setBorderPainted(false);
        btnCategorias.setFocusPainted(false);
        btnCategorias.setContentAreaFilled(false);
        btnCategorias.setForeground(Color.WHITE);
        btnCategorias.setFont(new Font("SansSerif", Font.BOLD, 16));

        btnTransacoes.setBorderPainted(false);
        btnTransacoes.setFocusPainted(false);
        btnTransacoes.setContentAreaFilled(false);
        btnTransacoes.setForeground(Color.WHITE);
        btnTransacoes.setFont(new Font("SansSerif", Font.BOLD, 16));

        btnVisaoGeral.setBorderPainted(false);
        btnVisaoGeral.setFocusPainted(false);
        btnVisaoGeral.setContentAreaFilled(false);
        btnVisaoGeral.setForeground(Color.WHITE);
        btnVisaoGeral.setFont(new Font("SansSerif", Font.BOLD, 16));
    }

    private void configurarEventos(){
        btnVisaoGeral.addActionListener(e -> {
                painelConteudo.removeAll();
                painelConteudo.add(new PainelVisaoGeral(), BorderLayout.CENTER);
                painelConteudo.revalidate();
                painelConteudo.repaint();
        });
    }
}
