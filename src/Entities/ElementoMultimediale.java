package Entities;


import Interfaces.Play;

public abstract class ElementoMultimediale  {
       private String titolo;
       public ElementoMultimediale(String titolo){
           this.titolo = titolo;
       }

    public String getTitolo() {
        return titolo;
    }

}
