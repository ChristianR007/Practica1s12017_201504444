package Componentes;

/**
 *
 * @author Christian
 */
public class Ficha {

    private String letra;
    private int puntaje;

    public Ficha(String letter, int points) {
        this.letra = letter;
        this.puntaje = points;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
