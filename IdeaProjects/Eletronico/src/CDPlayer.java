/**
 * Created by Charles Luttos on 23/08/17.
 */
public class CDPlayer extends Player{
    CD cd;
    int a = 1, b = 1;
    public void colocarCD(CD cd){
        this.cd = cd;
    }
    public void tirarCD(){
        System.out.println("Foi tirado o cd de "+cd.artista);
    }

    @Override
    public void avancarMusica(){
        a++;
        if (a > cd.musicas.size()) a = cd.musicas.size();
        cd.musicas.get(a);
        System.out.printf("%d %s %s",a,cd.musicas.get(a).nome,cd.musicas.get(a).artista);
    }
    @Override
    public void recuarMusica(){
        a--;
        if (a < 0) a = cd.musicas.size();
        cd.musicas.get(a);
        System.out.printf("%d %s %s",a,cd.musicas.get(a).nome,cd.musicas.get(a).artista);
    }
}
