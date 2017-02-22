/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Christian
 */
public class ListaJugadores {
    NodoJugador cabeza;
    NodoJugador ultimo;
    
    public ListaJugadores(){
        cabeza = null;
        ultimo = null;
    }
    
    public void insertarJugador(NodoJugador nuevo){
        if(isEmpty()){
           cabeza = nuevo;
           ultimo = nuevo;
           cabeza.setSiguiente(ultimo);
           ultimo.setSiguiente(cabeza);
        }
        else{
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            nuevo.setSiguiente(cabeza);
        }
    }
    
    public String showPlayers(){
        String retorno = "";
        if(!isEmpty()){
            NodoJugador aux = this.cabeza;
            do{
                retorno = retorno+"| "+aux.getJugador().getUsuario()+" |";
                aux = aux.getSiguiente();
            }while(aux.getSiguiente()!=cabeza.getSiguiente());
        }
        else{
            retorno = "NO HAY JUGADORES";
        }
        return retorno;
    }
    
    public boolean verificarSiExiste(String usuario){
        boolean si = false;
        if(!isEmpty()){
            NodoJugador aux = this.cabeza;
            do{
                if(aux.getJugador().getUsuario().equals(usuario)){
                    si = true;
                }
                aux = aux.getSiguiente();
            }while(aux.getSiguiente()!=cabeza.getSiguiente());
        }
        return si;
    }
    public boolean isEmpty(){
        return cabeza==null;
    }
}
