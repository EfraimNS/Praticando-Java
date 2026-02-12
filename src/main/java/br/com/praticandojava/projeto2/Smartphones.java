package br.com.praticandojava.projeto2;

public class Smartphones extends Produto{
    private String modeloImei;

    public Smartphones(String nome, double price, String modeloImei) {
        super(nome, price);
        this.modeloImei = modeloImei;
    }

    public String getModeloImei() {
        return modeloImei;
    }

    public void setModeloImei(String modeloImei) {
        this.modeloImei = modeloImei;
    }

    @Override
    public String getDetalhes() {
        return this.modeloImei;
    }
}
