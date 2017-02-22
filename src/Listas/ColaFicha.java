package Listas;

/**
 *
 * @author Christian
 */
public class ColaFicha {
    //Atributos
    NodoFicha cabeza;
    NodoFicha ultimo;
    
    //Constructor
    public ColaFicha(){
        this.cabeza = null;
        this.ultimo = null;
    }
    
    //Meter datos a la cola
    public void encolar(NodoFicha nuevo){
        if(isEmpty()){
            this.cabeza = nuevo;
            this.ultimo = nuevo;
        }
        else{
            ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    //Sacar datos de la cola
    public NodoFicha desencolar(){
        NodoFicha aux = this.cabeza;
        if(!isEmpty() && Count()!=1){
           this.cabeza = this.cabeza.getSiguiente();
           return aux; 
        }
        else{
            this.cabeza = this.ultimo = null;
            return aux;
        }
    }
    
    public String showCola(){
        String retorno = "";
        if(!isEmpty()){
            NodoFicha aux = this.cabeza;
            while(aux!=null){
                retorno = retorno+"| "+aux.getFicha().getLetra()+" |";
                aux = aux.getSiguiente();
            }
        }
        else{
            retorno = "COLA VACÍA";
        }
        return retorno;
    }
    
    public int Count(){
        int contador = 0;
        NodoFicha aux = this.cabeza;
        while(aux!=null){
            aux = aux.getSiguiente();
            contador++;
        }
        return contador;
    }
    
    //verificar si la cola está vacía
    public boolean isEmpty(){
        return this.cabeza==null;
    }
}
