package br.com.praticandojava.collections.Equals01;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Camila","45612398765L");
        Pessoa p2 = new Pessoa("Camila","45612398765L");


        boolean comparaCpf = p1 == p2;

        boolean comparaCpfequals = p1.equals(p2);

        System.out.println(comparaCpf);
        System.out.println(comparaCpfequals);





    }
}
