
package Ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    private  File archivo;
    
    public void crearArchivo(){
        archivo = new File("agendaContactos.txt");
        
        try {
            if(archivo.createNewFile()){
                //Se crea el archivo
            }
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo, true);    //Se activa el true para que añada mas texto y no solo lo actualice
            escribir.write(persona.getNombres()+"%"+persona.getEmail()+"%"+persona.getTelefono()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
}
