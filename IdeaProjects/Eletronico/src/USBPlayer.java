import java.util.ArrayList;

/**
 * Created by Chatles Luttos on 23/08/17.
 */
public class USBPlayer extends Player{
    int i=0,j=0;
    ArrayList<Musicas> musicas;
    public USBPlayer(){

    }

    public USBPlayer(Musicas ...m){
        musicas = new ArrayList<>();
        for (Musicas x:m)
            musicas.add(x);
    }
    //@Override
    public void avancarMusica(){
        i++;
        if (i > musicas.size()) i = 1;
        musicas.get(i);
        System.out.println(i);
    }
    //@Override
    public void recuarMusica(){
        j++;
        if (j < 1) j = musicas.size();
        musicas.get(j);
        System.out.println(j);
    }
}