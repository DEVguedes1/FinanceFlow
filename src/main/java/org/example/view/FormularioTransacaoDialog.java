package org.example.view;

import javax.swing.*;
import java.awt.*;

public class FormularioTransacaoDialog extends JDialog {

    private String descricao,valor,tipo,categoria;
    private JTextField txtDescricao,txtValor;
    private JComboBox<String> comboTipo, comboCategoria;

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
        txtDescricao = new JTextField();

        JLabel lblValor = new JLabel("Valor:");
        txtValor = new JTextField();

        JLabel lblTipo = new JLabel("Tipos:");
        String[] tipos = {"Receita", "Despesa"};
        comboTipo = new JComboBox<>(tipos);

        JLabel lblCategoria = new JLabel("Categoria:");
        String[] categorias = {"Alimentação", "Educação", "Lazer"};
        comboCategoria = new JComboBox<>(categorias);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(
                e -> salvar());

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

    private void salvar(){
        descricao = txtDescricao.getText();
        valor = txtValor.getText();
        tipo = (String) comboTipo.getSelectedItem();
        categoria = (String) comboCategoria.getSelectedItem();

        if (getDescricao().trim().isEmpty() ||
            getValor().trim().isEmpty() ||
                getTipo().trim().isEmpty() ||
                    getCategoria().trim().isEmpty()){
                        System.out.println("Preencha todos os campos!");
                        return;
        }

        System.out.println("Salvo com sucesso");
        dispose();
    }

    public String getDescricao() {
        return descricao;
    }

    public String getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }
}
