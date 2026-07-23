package org.example.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PainelTransacoes extends JPanel {
    public PainelTransacoes() {
        setLayout(new BorderLayout());
        inicializarCardTopo();
        inicializarTabela();
    }

    private void inicializarCardTopo(){
       JPanel painelTopo = new JPanel();
       painelTopo.setLayout(new BorderLayout());
       add(painelTopo,BorderLayout.NORTH);

       JLabel title = new JLabel("Transações");
       painelTopo.add(title,BorderLayout.WEST);
       title.setFont(new Font("SansSerif", Font.BOLD, 20));

       JButton button = new JButton("+ Nova Transação");
       painelTopo.add(button,BorderLayout.EAST);
       button.addActionListener(
               e -> new FormularioTransacaoDialog());

       painelTopo.setOpaque(false);
       setBackground(Color.WHITE);
       painelTopo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    private void inicializarTabela(){
        String[] colunas = {"Descrição", "Valor", "Tipo", "Data", "Categoria"};

        DefaultTableModel tabela = new DefaultTableModel(colunas, 0);
        JTable tabelaTransacoes = new JTable(tabela);
        JScrollPane painelCentro = new JScrollPane(tabelaTransacoes);
        add(painelCentro, BorderLayout.CENTER);
    }
}
