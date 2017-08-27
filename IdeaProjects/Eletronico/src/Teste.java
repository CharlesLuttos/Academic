import java.util.ArrayList;

/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Teste {
    public static void main(String[] args) {
        AparelhoSom xyz = new AparelhoSom();
        xyz.setMarca("Sony");
        xyz.setPotencia(60);
        xyz.ligar();
        for (int i = 0; i < 5; i++) {
            xyz.funcao.aumentarVolume();
        }
        String artista1 = "Los Hermanos";
        CD cd = new CD("Bloco do eu sozinho",artista1,
                       new Musicas("Todo carnaval tem seu fim",artista1,"Marcelo Camelo", 252),
                       new Musicas("A flor",artista1,"Rodrigo amarante", 210),
                       new Musicas("Retrato pra Iaia",artista1,"Marcelo Camelo", 282),
                       new Musicas("Assim sera",artista1,"Marcelo Camelo", 194),
                       new Musicas("Casa pre-fabricada",artista1,"Marcelo Camelo", 245)
         );

        ArrayList<Musicas> musicas = new ArrayList<>();
        musicas.add(new Musicas("Pais e filhos","Legião urbana","Renato Russo",330));
        musicas.add(new Musicas("All you need is love","The beatles","John Lennon",212));
        musicas.add(cd.musicas.get(1));
        musicas.add(new Musicas("Construção","Chico Buarque",280));

        xyz.funcao.ativarCDplayer();
        xyz.cdPlayer.colocarCD(cd);
        xyz.cdPlayer.play();
        xyz.cdPlayer.avancarMusica();
        xyz.cdPlayer.avancarMusica();
        xyz.cdPlayer.stop();
        xyz.cdPlayer.tirarCD();
        xyz.funcao.ativarRadio();
        xyz.funcao.aumentarVolume();
        xyz.funcao.aumentarVolume();
        xyz.funcao.ativarUSBPlayer(musicas);
        xyz.usbPlayer.avancarMusica();
        xyz.usbPlayer.avancarMusica();

        for (int i = 0; i<29; i++)
            xyz.funcao.aumentarVolume();
        xyz.desligar();
    }
}