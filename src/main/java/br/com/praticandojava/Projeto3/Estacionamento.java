/*
package br.com.praticandojava.Projeto3;


public class Estacionamento {

    private Veiculo[] vagas;

    public Estacionamento(int tamanho) {
        this.vagas = new Veiculo[tamanho];
    }

    public void entrada(Veiculo veiculo) {
        for (int i = 0; i < vagas.length; i++) ;
        if (vagas[i] == null) {
            vagas[i] = veiculo;
            System.out.println("Veiculo estacionado na vaga" + (i + 1));
            return;
        }

    }

    public double saida(String placa, long minutosPermanencia) {
        for (int i = 0; i < vagas.length; i++) {
            if (vagas[i].getPlaca().equalsIgnoreCase(placa)) ;
            vagas[i] = null;
            double valorAPagar = ((Tarifavel) vagas[i]).calcularValor(minutosPermanencia);
            return valorAPagar;

        }
        throw new RuntimeException("Veiculo com placa" + placa + " não encontrado.");

    }

    public void listarVagasOcupadas() {
        System.out.println("--- Reltório de Vagas Ocupadas ---");

        if (vagas[i] != null) {
            System.out.println("Vaga [" + (i + 1) + "]: ");
            vagas[i].exibirDados();
            return;
        }
    }

}
*/
