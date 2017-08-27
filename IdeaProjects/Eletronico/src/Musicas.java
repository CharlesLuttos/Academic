/**
 * Created by Charles Luttos on 24/08/17.
 */
public class Musicas {
    String nome;
    String artista;
    String compositor;
    int tempo;
    public Musicas(){

    }
    public Musicas(String nome){
        this.nome = nome;
    }
    public Musicas(String nome, String artista){
        this.nome = nome;
        this.artista = artista;
    }
    public Musicas(String nome, String artista, String compositor){
        this.nome = nome;
        this.artista = artista;
        this.compositor = compositor;
    }
    public Musicas(String nome, String artista, String compositor, int tempo){
        this.nome = nome;
        this.artista = artista;
        this.compositor = compositor;
        this.tempo = tempo;
    }
}