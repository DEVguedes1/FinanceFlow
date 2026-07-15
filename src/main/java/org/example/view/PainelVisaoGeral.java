package org.example.view;

import javax.swing.*;
import java.awt.*;

public class PainelVisaoGeral extends JPanel {

    private JLabel lblSaldoValor, lblReceitasValor, lblDespesasValor;
    private JLabel lblSaldoTitulo, lblReceitasTitulo, lblDespesasTitulo;
    private JPanel cardSaldo, cardReceitas, cardDespesas;

    public PainelVisaoGeral() {
        setLayout(new BorderLayout());
        inicializarCards();
        estilizarCards();
    }

    private void inicializarCards(){
        JPanel painelCards = new JPanel();
        painelCards.setLayout(new GridLayout(1,3,15,0));

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
}
