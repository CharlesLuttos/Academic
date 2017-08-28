import java.util.ArrayList;

/**
 * Created by Charles Luttos on 23/08/17.
 */
public class AparelhoSom extends Eletronico{
    private int potencia;
    private int volume = 0;
    private String tipo;
    public Funcao funcao;
    Player.CDPlayer cdPlayer;
    USBPlayer usbPlayer;

    public AparelhoSom(){
        funcao = new Funcao();
        volume = 0;
    }

    public AparelhoSom(String marca){
        funcao = new Funcao();
        volume = 0;
        setMarca(marca);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public class Funcao{
        public void aumentarVolume(){
            volume++;
            if (volume > 20) volume = 20;
            System.out.printf("Volume: %d \n",volume);
        }
        public void diminuirVolume(){
            volume--;
            if (volume < 0) volume = 0;
            System.out.printf("Volume: %d \n",volume);
        }
        public void ativarCDplayer(){
            cdPlayer = new Player.CDPlayer();
            imprimirTipo("CD player");
        }
        public void ativarDVDplayer(){
            imprimirTipo("Dvd player");
        }

        public void ativarRadio(){
            imprimirTipo("nulo");
        }

        public void ativarUSBPlayer(ArrayList<Musicas> musicas) {
            usbPlayer = new USBPlayer(musicas);
            imprimirTipo("USB Player");
            imprimirListaMusicas(musicas);
            System.out.printf("Executando a música: 1 %s %s \n", usbPlayer.musicas.get(0).nome, usbPlayer.musicas.get(0).artista);
        }

        private void imprimirTipo(String tipo){
            System.out.printf("Player definido para %s \n",tipo);
        }

        private void imprimirListaMusicas(ArrayList<Musicas> m){
            int nrMusica = 1;
            System.out.printf("Foram carregadas %d músicas: \n",m.size());
            for (Musicas x:m) {
                System.out.printf("%d %s %s %s \n", nrMusica, x.nome, x.artista, x.compositor);
                nrMusica++;
            }
        }
    }
}