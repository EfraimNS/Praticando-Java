package br.com.praticandojava.collections.GruposDeTrabalho05;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<String> timeBackend = new HashSet<>();
        timeBackend.add("Leonardo da Silva");
        timeBackend.add("Fernanda Silveira");
        timeBackend.add("Luana de Oliveira");
        timeBackend.add("Luna de Pereira");

        Set<String> timeFrontend = new HashSet<>();
        timeFrontend.add("Juliana Silva");
        timeFrontend.add("Fernanda Silveira");
        timeFrontend.add("Tereza Marques");
        timeFrontend.add("Luna de Pereira");


        Set<String> timeGeral = new HashSet<>();
        timeGeral.addAll(timeBackend);
        timeGeral.addAll(timeFrontend);

        timeGeral.retainAll(timeBackend);
        timeGeral.retainAll(timeFrontend);

        System.out.println(" Funcionarios Fullstack da Empresa -> " + timeGeral);




    }
}
