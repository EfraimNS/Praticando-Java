package br.com.praticandojava.Projeto3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Estacionamento estacionamento = new Estacionamento(10);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("--- SISTEMA SMARTPARK---");
            System.out.println("1. Entrada de Veículo");
            System.out.println("2. Saída de Veículo");
            System.out.println("3. Listar Vagas Ocupadas");
            System.out.println("4. Sair");
            System.out.println("Escolha uma Opção");

            // Fazendo cast e lançando exceção
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido");
                continue;
            }

            


        }



    }
}
