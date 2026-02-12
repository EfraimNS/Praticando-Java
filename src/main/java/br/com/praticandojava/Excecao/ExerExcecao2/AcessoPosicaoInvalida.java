package br.com.praticandojava.Excecao.ExerExcecao2;

import java.util.Scanner;

public class AcessoPosicaoInvalida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 10 para ver a posição");

        int posicao = sc.nextInt();

        String[] nomes = {"Ana", "Bia", "Leo"};


        try {
            System.out.println("Nome na posição " + posicao + ": " + nomes[posicao]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro: Posição inválida! Escolha um índice dentro do tamanho da lista.");
        }

        sc.close();


    }

}

