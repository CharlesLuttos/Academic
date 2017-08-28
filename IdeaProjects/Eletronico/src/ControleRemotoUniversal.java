/**
 * Created by Luttos on 27/08/17.
 */
public class ControleRemotoUniversal extends Eletronico{
    public void ligar(Eletronico eletronico){
        System.out.printf("*%s* \nInicializando...\n\n",eletronico.getMarca());
    }

    public void desligar(Eletronico eletronico){
        System.out.printf("*%s* \nDesligando...\n\n",eletronico.getMarca());
    }
}
