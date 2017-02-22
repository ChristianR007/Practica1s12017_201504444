package Componentes;
import Listas.ColaFicha;
import Listas.NodoFicha;
import java.util.Random;

/**
 *
 * @author Christian
 */

import java.util.ArrayList;

public class Random1 {
    
    ColaFicha fichas = new ColaFicha();
    ArrayList Guar_Temporal = new ArrayList();
    
    public Random1(){
        
        for(int i = 0; i<12; i++){
            Guar_Temporal.add(new Ficha("A",1));
            Guar_Temporal.add(new Ficha("E",1));
        }
        for(int i = 0; i<9; i++){
            Guar_Temporal.add(new Ficha("O",1));
        }
        for(int i = 0; i<6; i++){
            Guar_Temporal.add(new Ficha("I",1));
            Guar_Temporal.add(new Ficha("S",1));
        }
        for(int i = 0; i<5; i++){
            Guar_Temporal.add(new Ficha("N",1));
            Guar_Temporal.add(new Ficha("R",1));
            Guar_Temporal.add(new Ficha("U",1));
            Guar_Temporal.add(new Ficha("D",2));
        }
        for(int i = 0; i<4; i++){
            Guar_Temporal.add(new Ficha("L",1));
            Guar_Temporal.add(new Ficha("T",1));
            Guar_Temporal.add(new Ficha("C",3));
        }
        for(int i = 0; i<2; i++){
            Guar_Temporal.add(new Ficha("G",2));
            Guar_Temporal.add(new Ficha("B",3));
            Guar_Temporal.add(new Ficha("M",3));
            Guar_Temporal.add(new Ficha("P",3));
            Guar_Temporal.add(new Ficha("H",4));
        }
        Guar_Temporal.add(new Ficha("F",4));
        Guar_Temporal.add(new Ficha("V",4));
        Guar_Temporal.add(new Ficha("Y",4));
        Guar_Temporal.add(new Ficha("Q",5));
        Guar_Temporal.add(new Ficha("J",8));
        Guar_Temporal.add(new Ficha("Ñ",8));
        Guar_Temporal.add(new Ficha("X",8));
        Guar_Temporal.add(new Ficha("Y",10));  
    }
    
    public void meterFichasACola(){
        Random r = new Random();
        while(!Guar_Temporal.isEmpty()){
            int index = r.nextInt(Guar_Temporal.size());
            Ficha nueva =(Ficha) Guar_Temporal.get(index);
            fichas.encolar(new NodoFicha(nueva));
            Guar_Temporal.remove(index);   
        }
    }
    public ColaFicha getFichas() {
        return fichas;
    }
}
