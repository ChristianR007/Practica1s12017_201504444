/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Componentes.Jugador;
/**
 *
 * @author Christian
 */
public class NodoJugador {
    //ATRIBUTOS DE NODO JUGADOR
    Jugador jugador;
    NodoJugador siguiente;
    
    public NodoJugador(Jugador Player){
        this.jugador = Player;
        siguiente = null;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public NodoJugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoJugador siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
