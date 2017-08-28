/**
 * Created by Luttos on 27/08/17.
 */
public class TesteControleRemoto {
    public static void main(String[] args){
        ControleRemotoUniversal controle = new ControleRemotoUniversal();
        controle.ligar(new AparelhoSom("Sony"));
        controle.ligar(new Projetor("BenQ"));
        controle.ligar(new Radio("Philips"));
    }
}