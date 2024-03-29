package Entities;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
//        PROVA SENZA SCANNER:
//        RegistrazioneAudio regAud = new RegistrazioneAudio("TracciaAudio1", 3, 5);
//        Video reg = new Video("TracciaVideo1", 3, 5, 5);
//        reg.abbassaVolume();
//        reg.diminuisciLuminosità();
//        reg.diminuisciLuminosità();
//        regAud.abbassaVolume();
//        reg.play();
//        regAud.play();


        //      Array elementi
        ElementoMultimediale[] elementoMultimediale = new ElementoMultimediale[5];
        //      SCANNER:
        Scanner scanner = new Scanner(System.in);

        //      creazione degli elementi nell'array
        for (int i = 0; i < elementoMultimediale.length; i++) {
            System.out.println("Digita 1 per creare una registrazione audio - 2 per creare una registrazione video - 3 per creare un immagine");
            int input = Integer.parseInt(scanner.nextLine());
        switch (input){
            case 1: {
                System.out.println("inserisci un titolo");
                    String titolo = scanner.nextLine();
                System.out.println("inserisci una durata");
                    int durata = Integer.parseInt(scanner.nextLine());
                System.out.println("inserisci il volume da 0 a 10");
                    int volume = Integer.parseInt(scanner.nextLine());
                RegistrazioneAudio regAudio = new RegistrazioneAudio(titolo, durata, volume);
                elementoMultimediale[i] = regAudio;
                break;
            }
            case 2: {
                System.out.println("inserisci un titolo");
                    String titolo = scanner.nextLine();
                System.out.println("inserisci una durata");
                    int durata = Integer.parseInt(scanner.nextLine());
                System.out.println("inserisci il volume da 0 a 10");
                    int volume = Integer.parseInt(scanner.nextLine());
                System.out.println("inserisci la luminosità da 0 a 10");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                Video regVideo = new Video(titolo, durata, volume, luminosita);
                elementoMultimediale[i] = regVideo;
                break;
            }
            case 3: {
                System.out.println("inserisci un titolo");
                    String titolo = scanner.nextLine();
                System.out.println("inserisci la luminosità da 0 a 10");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    Immagine immagine = new Immagine(titolo, luminosita);
                elementoMultimediale[i] = immagine;
                break;
            }
            default: {
                System.out.println("errore");
            }
        }
        }

        //    verifica input e esegue il metodo
        int input;
        System.out.println("Digita un numero da 1 a 5 per eseguire un elemento (0) per uscire");
        do{
            input = Integer.parseInt(scanner.nextLine());
            if(input > 0 && input < 6){
                if(elementoMultimediale[input - 1] instanceof Immagine){
                    ((Immagine) elementoMultimediale[input - 1 ]).show();

                    System.out.println("Digità + per alzare la luminosità o - per abbassarla");
                    String controlloLuminosita = scanner.nextLine();
                    if (controlloLuminosita.equals("+")) {
                        ((Immagine) elementoMultimediale[input - 1 ]).aumentaLuminosita();
                        System.out.println("luminosità alzata di 1");
                    } else if (controlloLuminosita.equals("-")) {
                        ((Immagine) elementoMultimediale[input - 1 ]).diminuisciLuminosita();
                        System.out.println("luminosità abbassata di 1");
                    }


                } else if (elementoMultimediale[input - 1 ] instanceof RegistrazioneAudio){
                    ((RegistrazioneAudio) elementoMultimediale[input - 1 ]).play();

                    System.out.println("Digità + per alzare il volume o - per abbassarlo");
                    String controlloVolume = scanner.nextLine();
                    if(controlloVolume.equals("+")){
                        ((RegistrazioneAudio) elementoMultimediale[input - 1 ]).alzaVolume();
                        System.out.println("volume alzato di 1");
                    } else if (controlloVolume.equals("-")) {
                        ((RegistrazioneAudio) elementoMultimediale[input - 1 ]).abbassaVolume();
                        System.out.println("volume abbassato di 1");
                    }

                } else if (elementoMultimediale[input - 1 ] instanceof Video){
                    ((Video) elementoMultimediale[input - 1 ]).play();

                    System.out.println("Digità + per alzare la luminosità o - per abbassarla");
                    String controlloLuminosita = scanner.nextLine();
                    if (controlloLuminosita.equals("+")) {
                        ((Video) elementoMultimediale[input - 1 ]).aumentaLuminosita();
                        System.out.println("luminosità alzata di 1");
                    } else if (controlloLuminosita.equals("-")) {
                        ((Video) elementoMultimediale[input - 1 ]).diminuisciLuminosità();
                        System.out.println("luminosità abbassata di 1");
                    }

                    System.out.println("Digità + per alzare il volume o - per abbassarlo");
                    String controlloVolume = scanner.nextLine();
                    if(controlloVolume.equals("+")){
                        ((Video) elementoMultimediale[input - 1 ]).alzaVolume();
                        System.out.println("volume alzato di 1");

                    } else if (controlloVolume.equals("-")) {
                        ((Video) elementoMultimediale[input - 1 ]).abbassaVolume();
                        System.out.println("volume abbassato di 1");
                    }
                }
            } if(input != 0 ){
                System.out.println("Digita un numero da 1 a 5 per eseguire un elemento (0) per uscire");
            }


        } while (input != 0);


    }
}