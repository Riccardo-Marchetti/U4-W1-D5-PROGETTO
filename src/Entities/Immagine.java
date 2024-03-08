package Entities;

public class Immagine extends ElementoMultimediale{
    private int luminosità;
    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }
    public void show(){

    }

    @Override
    public void play() {

    }
}
