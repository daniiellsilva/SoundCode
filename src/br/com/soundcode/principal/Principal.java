package br.com.soundcode.principal;

import br.com.soundcode.modelos.Musica;
import br.com.soundcode.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Dreams");
        minhaMusica.setCantor("FleetWood Mac");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Daniel Silva");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
    }
}
