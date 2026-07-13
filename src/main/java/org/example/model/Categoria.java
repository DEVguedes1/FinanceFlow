package org.example.model;

public class Categoria {

    private long id;
    private String nome;
    private String corDoGrafico;
    private Usuario usuario;

    public Categoria() {}

    public Categoria( String nome, String corDoGrafico, Usuario usuario) {
        this.nome = nome;
        this.corDoGrafico = corDoGrafico;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDoGrafico() {
        return corDoGrafico;
    }

    public void setCorDoGrafico(String corDoGrafico) {
        this.corDoGrafico = corDoGrafico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
