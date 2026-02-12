package br.com.praticandojava.projeto2;

public class Eletronicos extends Produto{
    private String tensao;

    public Eletronicos(String nome, double price, String tensao) {
        super(nome, price);
        this.tensao = tensao;
    }

    public String gettensao() {
        return tensao;
    }

    public void settensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public String getDetalhes() {
        return this.tensao;
    }
}
