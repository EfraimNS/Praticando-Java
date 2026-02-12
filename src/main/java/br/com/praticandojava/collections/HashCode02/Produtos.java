package br.com.praticandojava.collections.HashCode02;

import java.util.Objects;

public class Produtos {

    private int id;
    private String nome;

    public Produtos(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return id == produtos.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
