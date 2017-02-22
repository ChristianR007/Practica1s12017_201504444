package Componentes;

import Listas.ListaFichasJugador;

/**
 *
 * @author Christian
 */
public class Jugador {

    private String N_Usuario;
    private ListaFichasJugador fichasDeJugador;

    public Jugador(String Nombre, ListaFichasJugador fichasPl) {
        this.N_Usuario = Nombre;
        this.fichasDeJugador = fichasPl;
    }

    public void setUsuario(String user) {
        this.N_Usuario = user;
    }

    public String getUsuario() {
        return this.N_Usuario;
    }
}
