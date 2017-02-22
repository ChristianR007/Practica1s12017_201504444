/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;
import Componentes.Comp_Letras;
/**
 *
 * @author Christian
 */
public class NodoPalabra {
    //ATRIBUTOS DE NODO PALABRA
    private NodoPalabra Siguiente;
    private Comp_Letras palabra;
    
    //CONSTRUCTOR
    public NodoPalabra(Comp_Letras palabra){
        this.palabra = palabra;
        this.Siguiente = null;
    }
    
    //GETTERS Y SETTERS

    public NodoPalabra getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoPalabra Siguiente) {
        this.Siguiente = Siguiente;
    }

    public Comp_Letras getPalabra() {
        return palabra;
    }

    public void setPalabra(Comp_Letras palabra) {
        this.palabra = palabra;
    }
    
}
