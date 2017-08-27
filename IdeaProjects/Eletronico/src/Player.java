import java.sql.Time;

/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Player {
    Time tempo;
    int nrMusica;

    public void play() {
        System.out.println("Executando a musica ");
        nrMusica = 1;
    }

    public void stop(){
        System.out.println("Player parado");
        nrMusica = 0;
    }

    public void avancarMusica(){
        nrMusica++;
        System.out.println(nrMusica);
    }
    public void recuarMusica(){
        nrMusica--;
        System.out.println(nrMusica);
    }

}