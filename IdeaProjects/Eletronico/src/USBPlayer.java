import java.util.ArrayList;

/**
 * Created by Chatles Luttos on 23/08/17.
 */
public class USBPlayer extends Player{

    ArrayList<Musicas> musicas;
    public USBPlayer(){
        nrMusica = 1;
    }

    public USBPlayer(Musicas ...m){
        musicas = new ArrayList<>();
        for (Musicas x:m)
            musicas.add(x);
        nrMusica = 1;
    }

    public USBPlayer(ArrayList<Musicas> musicas){
        this.musicas = musicas;
        nrMusica = 1;
    }

    @Override
    public void avancarMusica(){
        nrMusica++;
        if (nrMusica > musicas.size()) nrMusica = 1;
        musicas.get(nrMusica);
        System.out.printf("%d %s %s \n", nrMusica, musicas.get(nrMusica).nome, musicas.get(nrMusica).artista);
    }

    @Override
    public void recuarMusica(){
        nrMusica--;
        if (nrMusica < 1) nrMusica = musicas.size();
        musicas.get(nrMusica);
        System.out.printf("%d %s %s \n", nrMusica, musicas.get(nrMusica).nome, musicas.get(nrMusica).artista);
    }
}