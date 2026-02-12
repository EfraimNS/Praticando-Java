package br.com.praticandojava.Projeto3;

public class Carro extends Veiculo implements Tarifavel {

    private int capacidadePortamalas;

    public Carro(String placa, String modelo, int capacidadePortamalas) {
        super(placa, modelo);
        this.capacidadePortamalas = capacidadePortamalas;
    }

    public int getCapacidadePortamalas() {
        return capacidadePortamalas;
    }

    public void setCapacidadePortamalas(int capacidadePortamalas) {
        this.capacidadePortamalas = capacidadePortamalas;
    }

    @Override
    void exibirDados() {
        super.exibirDados();
    }

    @Override
    public double calcularValor(long minutos) {
        return minutos * 0.10;
    }
}
