package br.com.praticandojava.Excecao.ExerExcecao5;

import java.util.Scanner;

public class Conta {
    private double saldo = 100.0;



    public double getSaldo() {
        return saldo;
    }


    public void saque() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar ");
        double sacar = sc.nextDouble();
        if (saldo < sacar) {
            throw new SaldoInsuficienteExc("Erro no saque");
        }
            System.out.println("Saque efetuado com sucesso ");

    }
}
