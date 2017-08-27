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

        /**
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
        xyz.funcao.ativarUSBPlayer();
        System.out.print(xyz.cdPlayer.classeChamadora());
        */
    }
}