package br.com.praticandojava.Excecao.ExerExcecao3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaIncorreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do usuário");

        try {
            int idade = sc.nextInt();
        }catch (InputMismatchException exception ) {
            System.out.println("Erro: Por favor, digite apenas números inteiros para a idade");
        }


        sc.close();
    }
}
