/**
 * Created by Charles Luttos on 23/08/17.
 */
public class AparelhoSom extends Eletronico{
    private int potencia;
    private int volume;
    private String tipo;
    public Funcao funcao;
    CDPlayer cdPlayer;
    USBPlayer usbPlayer;

    public AparelhoSom(){
        funcao = new Funcao();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    class Funcao{
        public void aumentarVolume(){
            volume++;
            if (volume > 20) volume = 20;
        }
        public void diminuirVolume(){
            volume--;
            if (volume < 0) volume = 0;
        }
        public String ativarCDplayer(){
            cdPlayer = new CDPlayer();
            tipo = "Cd player";
            return "Player definido para "+tipo;
        }
        public String ativarDVDplayer(){
            tipo = "Dvd player";
            return "Player definido para "+tipo;
        }
        public String ativarRadio(){
            tipo = "nulo";
            return "Player definido para "+tipo;
        }
        public String ativarUSBPlayer(){
            usbPlayer = new USBPlayer();
            tipo = "nulo";
            return "Player definido para "+tipo;
        }
    }
}