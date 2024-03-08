package Entities;

public class Video extends ElementoMultimediale{
    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }
    public void abbassaVolume(){
        volume --;
    }
    public void alzaVolume(){
        volume++;
    }
    public void aumentaLuminosità(){
        luminosità ++;
    }
    public void diminuisciLuminosità(){
        luminosità --;
    }

    @Override
    public void play() {

    }
}
