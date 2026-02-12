package br.com.praticandojava.collections.HistoricoDeNavegaçao04;

public class Main {
    public static void main(String[] args) {
        Historico historico = new Historico();


        historico.adcionarUrl("https://google.com");
        historico.adcionarUrl("https://youtube.com");
        historico.adcionarUrl("https://github.com");
        historico.adcionarUrl("https://stackoverflow.com");
        historico.adcionarUrl("https://microsoft.com");
        historico.adcionarUrl("https://openai.com");



        System.out.println("Consultar a url" + ".." + historico.consultarIndice(0));
        System.out.println("Consultar a url" + ".." + historico.consultarIndice(3));

        historico.limparAntigos(5);

        historico.exibirHistorico();







    }
}
