package br.com.praticandojava.listadeexercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControleDeEstoque {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> estoque = new HashMap<>();

        while (true) {
            System.out.println("\n=========MENU========");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Atualizar produto");
            System.out.println("3 - Consultar produto");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do produto");
                    int codigo = sc.nextInt();

                    if(estoque.containsKey(codigo)){
                        System.out.println("Produto ja existe no sistema");
                    }else {
                        System.out.println("Digite a quantidade");
                        int quantidade = sc.nextInt();

                        estoque.put(codigo, quantidade);
                    }

                    break;
                case 2:
                    System.out.println("Digite o código do produto");
                    codigo = sc.nextInt();

                    if (estoque.containsKey(codigo)) {
                        System.out.println("Informe a nova quantidade");
                        int novaQuantidade = sc.nextInt();
                        estoque.put(codigo, novaQuantidade);

                        System.out.println("Produto atualizado com sucesso ");
                    } else {
                        System.out.println("Produto não localizado, informe um produto existente no sistema");
                    }
                    break;
                case 3:
                    System.out.println("Digite o código do produto ");
                    codigo = sc.nextInt();

                    if (estoque.containsKey(codigo)) {
                        System.out.println("Quantidade: " + estoque.get(codigo));
                    } else {
                        System.out.println("Produto não encontrado");
                    }
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
