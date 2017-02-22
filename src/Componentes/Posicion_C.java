package Componentes;

/**
 *
 * @author Christian
 */
public class Posicion_C {

    int coorX;
    int coorY;
    String tipo;
    Ficha ficha;

    public Posicion_C(int x, int y, String tipo) {
        this.coorX = x;
        this.coorY = y;
        this.tipo = tipo;
        this.ficha = null;
    }

    public int getCoorX() {
        return coorX;
    }

    public void setCoorX(int coorX) {
        this.coorX = coorX;
    }

    public int getCoorY() {
        return coorY;
    }

    public void setCoorY(int coorY) {
        this.coorY = coorY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
}
