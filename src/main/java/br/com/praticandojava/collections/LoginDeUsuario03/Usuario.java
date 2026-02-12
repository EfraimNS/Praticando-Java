package br.com.praticandojava.collections.LoginDeUsuario03;

import java.util.Objects;

public class Usuario {

    private String userName;
    private String senha;


    public Usuario(String userName, String senha){
        this.userName =userName;
        this.senha = senha;
    }

    public String getUserName() {
        return userName;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(userName, usuario.userName) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, senha);
    }
}
