package br.com.praticandojava.collections.ContagemDePalavras06;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase com plavras repetidas");
        String texto = scanner.nextLine();

        String[] palavras = texto.split("\\s+");

        Map<String, Integer> mapa = new HashMap<>();

        for(String palavra :palavras) {
            if(!mapa.containsKey(palavra)) {
                mapa.put(palavra, 1);
            }else {
                int valorAtual = mapa.get(palavra);
                mapa.put(palavra, valorAtual + 1);
            }
        }

        System.out.println("vezes que a palavra aparece");

        for (Map.Entry<String, Integer> entry : mapa.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        scanner.close();

    }
}
