package br.com.praticandojava.Excecao.ExerExcecao5;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("Seu saldo atual é de " + conta.getSaldo());
        try {
            conta.saque();
        }catch (SaldoInsuficienteExc exception) {
            System.out.println(exception.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Erro letras não são permitidas ");
        }
    }
}
