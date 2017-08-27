/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Player {
    int tempo;
    CDPlayer cdPlayer;
    USBPlayer usbPlayer;


    public void play() {
        System.out.println("Executando a musica ");
    }

    public void stop(){
        System.out.println("Player parado");
    }

    public void avancarMusica(){
        System.out.println();
    }
    public void recuarMusica(){
        System.out.println();
    }

}