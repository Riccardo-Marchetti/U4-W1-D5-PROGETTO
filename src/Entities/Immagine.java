package Entities;

public class Immagine extends ElementoMultimediale{

    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
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
    public void show(){
        System.out.println(getTitolo() + "*".repeat(luminosità));
    }


}
