/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Componentes.Posicion_C;
/**
 *
 * @author Christian
 */
public class NodoCasilla {
    NodoCasilla siguiente;
    Posicion_C casilla;
    
    public NodoCasilla(Posicion_C casilla){
        this.casilla = casilla;
    }

    public NodoCasilla getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCasilla siguiente) {
        this.siguiente = siguiente;
    }

    public Posicion_C getCasilla() {
        return casilla;
    }

    public void setCasilla(Posicion_C casilla) {
        this.casilla = casilla;
    }
    
}
