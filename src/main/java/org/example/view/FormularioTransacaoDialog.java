package org.example.view;

import javax.swing.*;
import java.awt.*;

public class FormularioTransacaoDialog extends JDialog {

    public FormularioTransacaoDialog() {
        setTitle("Transação");
        setSize(400,500);
        setLocationRelativeTo(null);
        setModal(true);

        inicializarFormulario();

        setVisible(true);
    }

    private void inicializarFormulario(){
        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(0, 1, 5, 5));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JLabel lblDescricao = new JLabel("Descrição:");
        JTextField txtDescricao = new JTextField();

        JLabel lblValor = new JLabel("Valor:");
        JTextField txtValor = new JTextField();

        JLabel lblTipo = new JLabel("Tipos:");
        String[] tipos = {"Receita", "Despesa"};
        JComboBox<String> comboTipo = new JComboBox<>(tipos);

        JLabel lblCategoria = new JLabel("Categoria:");
        String[] categorias = {"Alimentação", "Educação", "Lazer"};
        JComboBox<String> comboCategoria = new JComboBox<>(categorias);

        JButton btnSalvar = new JButton("Salvar");

        painelFormulario.add(lblDescricao);
        painelFormulario.add(txtDescricao);

        painelFormulario.add(lblValor);
        painelFormulario.add(txtValor);

        painelFormulario.add(lblTipo);
        painelFormulario.add(comboTipo);

        painelFormulario.add(lblCategoria);
        painelFormulario.add(comboCategoria);

        painelFormulario.add(Box.createVerticalStrut(10));
        painelFormulario.add(btnSalvar);

        add(painelFormulario);
    }
}
