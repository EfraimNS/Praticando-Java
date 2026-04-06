package br.com.praticandojava.listadeexercicios;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class DicionarioDeProdutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        while (true) {
            System.out.println("\n-------MENU---------");
            System.out.println("1 - Cadastrar categoria/produto");
            System.out.println("2 - Remover Categoria");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");

            int opcao = 0;
            try {
                System.out.println("Digite a opção desejada");
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido");
                sc.nextLine();
                continue;
            }
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a categoria");
                    String categoria = sc.nextLine();

                    System.out.println("informe o produto");
                    String produto = sc.nextLine();

                    if (map.containsKey(categoria)) {
                        System.out.println("Categoria já existe, produto será substituído");
                        return;
                    }
                    map.put(categoria, produto);
                    System.out.println("Produto cadastrado com sucesso!");

                    break;
                case 2:
                    System.out.println("Informe a categoria");
                    categoria = sc.nextLine();

                    if (map.containsKey(categoria)) {
                        map.remove(categoria);
                        System.out.println("Categoria removida com sucesso ");
                    } else {
                        System.out.println("Categoria não encontrada");
                    }
                    break;
                case 3:
                    for (String chave : map.keySet()) {
                        System.out.println("Categoria: " + chave + " | Produto: " + map.get(chave));
                    } // Verificar se map esta vazio

                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida");

            }

        }


    }
}
