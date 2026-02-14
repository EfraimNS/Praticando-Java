package br.com.praticandojava.collections.HistoricoDeNavegaçao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Historico {

    private List<String> urls = new ArrayList<>();


    public void adcionarUrl(String url) {
        urls.add(0,url);
    }

    public String consultarIndice(int indice) {
        if (indice < 0 || indice >= urls.size()) {
            throw new RuntimeException("Indice inválido");
        }
        return urls.get(indice);
    }

    public void limparAntigos(int n) {
        while (urls.size() > n) {
            urls.remove(urls.size() - 1);
        }
    }

    public void exibirHistorico() {
        System.out.println("Historico do mais recente para o mais antigo");
        for (int i = 0; i < urls.size(); i++ ) {
            System.out.println(i + "..." + urls.get(i));
        }
    }



}
