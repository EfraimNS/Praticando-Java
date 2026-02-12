package br.com.praticandojava.Excecao.ExerExcecao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Digite um número inteiro para o numerador ");
            int numerador = sc.nextInt();

            System.out.println("Digite um número inteiro para o denominador ");
            int denominador = sc.nextInt();

            int resultado = numerador / denominador;
            System.out.println("O resultado da dívisão é igual a " + resultado);

        }catch (ArithmeticException exception) {
            System.out.println("Erro: Não é permitido dividir por zero");
        }catch (InputMismatchException exception) {
            System.out.println("Digite apenas números");
        }



    }
}
