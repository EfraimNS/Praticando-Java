package br.com.praticandojava.collections.Equals01;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private long cpf;

    Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf == pessoa.cpf;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
