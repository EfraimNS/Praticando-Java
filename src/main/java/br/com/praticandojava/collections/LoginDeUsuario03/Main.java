package br.com.praticandojava.collections.LoginDeUsuario03;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Usuario goku = new Usuario("Goku","CAMEHAMEHAA123");
        Usuario vegeta = new Usuario("Vegeta","Seuverme123");
        Usuario popo = new Usuario("Senhor Popo","Popo123");

        List<Usuario> lista = new ArrayList<>();
        lista.add(goku);
        lista.add(vegeta);
        lista.add(popo);

        Usuario usuarioLogin = new Usuario("Vegeta","Seuverme123");

        if(lista.contains(usuarioLogin)){
            System.out.println("Login efetuado com sucesso");
        }else {
            System.out.println("Não foi possivel realizar o login, verifique os dados informados");
        }

    }
}
