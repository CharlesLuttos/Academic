/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Player {
    private int tempo;
    int nrMusica;
    CD cd;

    public Player(){

    }

    public void play() {
        nrMusica = 1;
        System.out.printf("Executando a musica: %d %s \n", nrMusica, cd.musicas.get(nrMusica).nome);
    }

    public void stop(){
        System.out.println("Player parado");
    }

    public void avancarMusica(){
        nrMusica++;
        if (nrMusica > cd.musicas.size()) nrMusica = cd.musicas.size();
        System.out.printf("%s %s %s \n",nrMusica, cd.musicas.get(nrMusica).nome, cd.musicas.get(nrMusica).artista);
    }
    public void recuarMusica() {
        nrMusica--;
        if (nrMusica < 1) nrMusica = 1;
        System.out.printf("%s %s %s \n",nrMusica, cd.musicas.get(nrMusica).nome, cd.musicas.get(nrMusica).artista);
    }

    public static class CDPlayer extends Player{
        public void colocarCD(CD x){
            cd = x;
            System.out.printf("Foi colocado o cd de %s \n",x.artista);
        }

        public void tirarCD(){
            System.out.printf("Foi tirado o cd de %s \n",cd.artista);
            cd = null;
        }
    }
}