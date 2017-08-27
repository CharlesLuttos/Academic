/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Eletronico {
    private String marca;
    private String modelo;
    private boolean ligado;

    public void ligar(){
        ligado = true;
        System.out.println("Inicializando...");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Até mais");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
