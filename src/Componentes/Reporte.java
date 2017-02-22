package Componentes;

import Listas.ListaPalabras;
import java.io.*;

/**
 *
 * @author Christian
 */
public class Reporte {

    public Reporte() {
        //JOptionPane.ShowMessageDialog(null,"Reporte creado exitosamente")
    }

    public boolean generarReporteDiccionario(ListaPalabras diccionario) {
        boolean estado = true;
        try {
            
        } catch (Exception e) {
            estado = false;
        }
        return estado;
    }

    private void crearDot(String nombre, String texto) {
        File f;
        FileWriter escribir;
        try {
            f = new File(nombre);
            escribir = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(escribir);
            PrintWriter salida = new PrintWriter(bw);
            salida.write(texto);
        } catch (Exception e) {

        }
    }

}
