package br.com.praticandojava.collections.exercicio;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Navegador {
    public static void main(String[] args) {

        List<String> historicoNavegador = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.println("1- Acessar site");
            System.out.println("2- Remover ultimo titulo");
            System.out.println("3- Limpar Historico");
            System.out.println("4- Listar historico ");
            System.out.println("5- Sair");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o titulo do site");
                    String titulo = sc.nextLine();
                    historicoNavegador.add(titulo);
                    break;
                case "2":
                    if(!historicoNavegador.isEmpty()) {
                        int ultimoIndice = historicoNavegador.size() - 1;
                        historicoNavegador.remove(ultimoIndice);
                        System.out.println("Removido com sucesso");
                    }else {
                        System.out.println("Historico está vazio");
                    }
                    break;
                case "3":
                    historicoNavegador.clear();
                    System.out.println("Historico limpo com sucesso ");
                    break;
                case "4":
                    if(historicoNavegador.isEmpty()){
                        System.out.println("Historico está vazio");
                    }else {
                        for (String lista : historicoNavegador) {
                            System.out.println(lista);
                        }
                    }

                    break;
                case "5":
                    System.exit(0);
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida");

            }


        }

    }
}
