import java.util.ArrayList;
/**
 * Created by Charles Luttos on 23/08/17.
 */
public class CD {
    String album, artista;
    int ano;
    ArrayList<Musicas> musicas;

    public CD(){
        musicas = new ArrayList<>();
    }

    public CD(Musicas ... musicas){
        this.musicas = new ArrayList<>();
        for (Musicas m: musicas)
            this.musicas.add(m);
    }

    public CD(String artista, Musicas... musicas){
        this.musicas = new ArrayList<>();
        for (Musicas m: musicas)
            this.musicas.add(m);
        this.artista = artista;
    }

    public CD(String album, String artista, Musicas... musicas){
        this.musicas = new ArrayList<>();
        for (Musicas m: musicas)
            this.musicas.add(m);
        this.artista = artista;
        this.album = album;
    }
}