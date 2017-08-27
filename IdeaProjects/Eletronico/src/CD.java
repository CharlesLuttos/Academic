import java.util.ArrayList;

/**
 * Created by Fantoche on 23/08/17.
 */
public class CD {
    String album, artista;
    int ano;
    ArrayList<Musica> musicas;
    public CD(){
        musicas = new ArrayList<>();
    }
    class Musica{
        String nome;
        String artista;
        String compositor;
        Time tempo;

    }
}
