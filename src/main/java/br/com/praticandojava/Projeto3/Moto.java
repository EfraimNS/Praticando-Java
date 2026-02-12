package br.com.praticandojava.Projeto3;

public class Moto extends Veiculo implements Tarifavel {
    private int cilindradas;

    public Moto(String placa, String modelo, int cilindradas) {
        super(placa, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
    }

    @Override
    public double calcularValor(long minutos) {
        return minutos * 0.20;
    }
}
