package br.com.praticandojava.Excecao.ExerExcecao4;

public class ValidandoSenha {
    public static void main(String[] args) {
        try {
            String senha = "12312";
            verificarSenha(senha);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void verificarSenha(String senha) {
        if (senha.length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres");
        }
        System.out.println("Senha valida");
    }
}
