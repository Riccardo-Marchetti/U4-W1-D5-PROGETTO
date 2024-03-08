package Entities;

public class RegistrazioneAudio extends ElementoMultimediale {

    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }
    public void abbassaVolume(){
        volume --;
    }
    public void alzaVolume(){
        volume++;
    }


    @Override
    public void play() {

    }
}
