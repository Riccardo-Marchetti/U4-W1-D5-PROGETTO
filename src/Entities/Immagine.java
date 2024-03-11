package Entities;

public class Immagine extends ElementoMultimediale{

    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //    Metodo per alzare la luminosità
    public void aumentaLuminosita(){
        luminosita ++;
    }

    //    Metodo per diminuire la luminosità
    public void diminuisciLuminosita(){
        luminosita --;
    }

    //    Metodo per riprodurre
    public void show(){
        System.out.println("Titolo: " + getTitolo() + " Luminosità: " + "* ".repeat(luminosita));
    }


}
