package br.com.praticandojava.collections.HashCode02;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Produtos p1 = new Produtos(01,"Juliana");
        Produtos p2 = new Produtos(01,"Juliana");



        Set<Produtos> produtos = new HashSet<>();
        produtos.add(p1);
        produtos.add(p2);

        System.out.println(produtos.size());





    }
}
