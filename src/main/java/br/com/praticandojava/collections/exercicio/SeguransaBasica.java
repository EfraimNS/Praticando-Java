package br.com.praticandojava.collections.exercicio;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SeguransaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> login = new HashMap<>();

        while (true) {
            System.out.println("1- Cadastrar usuário e senha");
            System.out.println("2- Fazer login");
            System.out.println("3 - sair");

            String opcao = sc.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do usuário");
                    String usuario = sc.nextLine();

                    System.out.println("Digite a senha");
                    String senha = sc.nextLine();

                    login.put(usuario, senha);
                    System.out.println("Adcionado com sucesso");

                    break;
                case "2":
                    System.out.println("Digite o nome do usuário");
                    String loginUsuario = sc.nextLine();

                    System.out.println("Digite a senha");
                    String loginSenha = sc.nextLine();

                    if (login.containsKey(loginUsuario) && login.get(loginUsuario).equals(loginSenha)) {

                        System.out.println("Acesso permitido");

                    }else {
                        System.out.println("Usuário ou senha incorretos");
                    }

                    break;
                case "3":
                    System.exit(0);
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }


    }
}
