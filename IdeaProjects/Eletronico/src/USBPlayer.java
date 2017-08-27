/**
 * Created by Chatles Luttos on 23/08/17.
 */
public class USBPlayer {
    CD cd;
    int i=0,j=0;
    public void avancarMusica(){
        i++;
        if (i > cd.musicas.size()) i = 1;
        cd.musicas.get(i);
        System.out.println(i);
    }
    public void recuarMusica(){
        j++;
        if (j < 1) j = cd.musicas.size();
        cd.musicas.get(j);
        System.out.println(j);
    }
}
