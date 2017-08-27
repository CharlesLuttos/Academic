/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Player {
    int tempo;
    CDPlayer cdPlayer;
    USBPlayer usbPlayer;
    int a;
    public Player(){
        cdPlayer = new CDPlayer();
    }

    public void play() {
        System.out.println("Executando a musica ");
    }

    public void stop(){
        System.out.println("Player parado");
    }

    public String classeChamadora () {
        Throwable thr = new Throwable();
        thr.fillInStackTrace ();
        StackTraceElement[] ste = thr.getStackTrace();
        return ste [2].getClassName();
    }

    public void avancarMusica(){
        if (getClass() == cdPlayer.getClass()){
            a++;
            if (a > ((CDPlayer) this).cdPlayer.cd.musicas.size()) a = ((CDPlayer) this).cdPlayer.cd.musicas.size();
            ((CDPlayer) this).cdPlayer.cd.musicas.get(a);
            System.out.printf("%d %s %s",a,((CDPlayer) this).cdPlayer.cd.musicas.get(a).nome,((CDPlayer) this).cdPlayer.cd.musicas.get(a).artista);
        }
        if (getClass() == usbPlayer.getClass()){

        }
    }
    public void recuarMusica(Player player) {
        if (player.getClass() == cdPlayer.getClass()) {
            a--;
            if (a < 0) a = ((CDPlayer) player).cdPlayer.cd.musicas.size();
            ((CDPlayer) player).cdPlayer.cd.musicas.get(a);
            System.out.printf("%d %s %s", a, ((CDPlayer) player).cdPlayer.cd.musicas.get(a).nome, ((CDPlayer) player).cdPlayer.cd.musicas.get(a).artista);
        }
        if (player.getClass() == usbPlayer.getClass()){

        }
    }
}