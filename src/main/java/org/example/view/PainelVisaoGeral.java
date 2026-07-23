package org.example.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PainelVisaoGeral extends JPanel {

    private JLabel lblSaldoValor, lblReceitasValor, lblDespesasValor;
    private JLabel lblSaldoTitulo, lblReceitasTitulo, lblDespesasTitulo;
    private JPanel cardSaldo, cardReceitas, cardDespesas;
    private JTable tabelaTransacoes;
    private JScrollPane barraRolagem;


    public PainelVisaoGeral() {
        setLayout(new BorderLayout());
        inicializarCards();
        estilizarCards();
        inicializarTabela();
        estilizarTabela();
    }

    private void inicializarCards(){
        JPanel painelCards = new JPanel();
        painelCards.setLayout(new GridLayout(1,3,15,0));
        painelCards.setOpaque(false);

        this.cardSaldo = new JPanel();
        this.cardReceitas = new JPanel();
        this.cardDespesas = new JPanel();

        this.lblSaldoValor = new JLabel("R$ 0,00");
        this.lblReceitasValor = new JLabel("R$ 0,00");
        this.lblDespesasValor = new JLabel("R$ 0,00");

        this.lblSaldoTitulo = new JLabel("Saldo Atual");
        this.lblReceitasTitulo = new JLabel("Receita Atual");
        this.lblDespesasTitulo = new JLabel("Despesa Atual");


        cardSaldo.setLayout(new GridLayout(2,1));
        cardReceitas.setLayout(new GridLayout(2,1));
        cardDespesas.setLayout(new GridLayout(2,1));

        cardSaldo.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cardReceitas.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        cardDespesas.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        painelCards.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        cardSaldo.add(lblSaldoTitulo);
        cardSaldo.add(lblSaldoValor);

        cardReceitas.add(lblReceitasTitulo);
        cardReceitas.add(lblReceitasValor);

        cardDespesas.add(lblDespesasTitulo);
        cardDespesas.add(lblDespesasValor);

        painelCards.add(cardSaldo);
        painelCards.add(cardReceitas);
        painelCards.add(cardDespesas);

        add(painelCards, BorderLayout.NORTH);
    }

    private void estilizarCards(){

        cardSaldo.setBackground(Color.WHITE);
        lblSaldoTitulo.setForeground(Color.GRAY);
        lblSaldoValor.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblSaldoValor.setForeground(Color.GREEN);

        cardReceitas.setBackground(Color.WHITE);
        lblReceitasTitulo.setForeground(Color.GRAY);
        lblReceitasValor.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblReceitasValor.setForeground(Color.GREEN);

        cardDespesas.setBackground(Color.WHITE);
        lblDespesasTitulo.setForeground(Color.GRAY);
        lblDespesasValor.setFont(new Font("SansSerif", Font.BOLD, 18));
        lblDespesasValor.setForeground(Color.GREEN);
    }

    private void inicializarTabela(){
        String[] colunas = {"Descrição", "Valor", "Tipo", "Data", "Categoria"};

        DefaultTableModel tabela =  new DefaultTableModel(colunas, 0);
        tabela.addRow(new Object[]{"Salário", "R$ 1.402,17", "Receita", "15/07/2026", "Bolsa"});
        this.tabelaTransacoes = new JTable(tabela);
        this.barraRolagem = new JScrollPane(tabelaTransacoes);
        add(barraRolagem,BorderLayout.CENTER);
    }

    private void estilizarTabela(){
        barraRolagem.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        barraRolagem.getViewport().setBackground(Color.WHITE);}
}
