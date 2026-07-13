package org.example.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transacao {

    private long id;
    private String descricao;
    private LocalDate data;
    private BigDecimal valor;
    private TipoTransacao tipo;
    private Categoria categoria;
    private Usuario usuario;

    public Transacao() {}

    public Transacao(String descricao, LocalDate data, BigDecimal valor,
                        TipoTransacao tipo, Categoria categoria, Usuario usuario) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
