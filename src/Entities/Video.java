package Entities;

import Interfaces.Play;

public class Video extends ElementoMultimediale implements Play {
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    //    Metodo per abbassare il volume
    public void abbassaVolume(){
        volume --;
    }

    //    Metodo per alzare il volume
    public void alzaVolume(){
        volume++;
    }

    //    Metodo per alzare la luminosità
    public void aumentaLuminosità(){
        luminosità ++;
    }

    //    Metodo per diminuire la luminosità
    public void diminuisciLuminosità(){
        luminosità --;
    }

    //    Metodo per riprodurre
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " !".repeat(volume) + " *".repeat(luminosità));
        }
    }
}
