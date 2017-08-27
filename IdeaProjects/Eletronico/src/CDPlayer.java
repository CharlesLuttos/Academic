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
        this.cd = null;
    }
}
