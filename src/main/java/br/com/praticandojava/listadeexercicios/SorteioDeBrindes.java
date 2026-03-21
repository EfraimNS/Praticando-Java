package br.com.praticandojava.listadeexercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SorteioDeBrindes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> nomes = new LinkedHashSet<>();

        while (true) {

            System.out.println("\n==========Sorteio de Brindes==========");
            System.out.println("Digite um nome (ou 'parar' para sair): ");

            String usuario = sc.nextLine();

            if (usuario.equalsIgnoreCase("parar")) {
                break;
            }
            nomes.add(usuario);

        }


        int contador = 0;

        System.out.println("\n=== Sorteados ===");

        for (String nome : nomes) {
            if (contador == 3) {
                break;
            }

            System.out.println(nome);
            contador++;


        }

        sc.close();

    }
}
