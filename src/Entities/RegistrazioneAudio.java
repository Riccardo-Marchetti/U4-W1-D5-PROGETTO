package Entities;

import Interfaces.Play;

public class RegistrazioneAudio extends ElementoMultimediale implements Play {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
//    Metodo per abbassare il volume
    public void abbassaVolume(){
        volume --;
    }

    //    Metodo per alzare il volume
    public void alzaVolume(){
        volume++;
    }

    //    Metodo per riprodurre
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
        System.out.println(getTitolo() + " !".repeat(volume));
        }
    }
}
