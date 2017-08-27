/**
 * Created by Charles Luttos on 23/08/17.
 */
public class Eletronico {
    private String marca;
    private String modelo;
    private boolean ligado;

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
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
