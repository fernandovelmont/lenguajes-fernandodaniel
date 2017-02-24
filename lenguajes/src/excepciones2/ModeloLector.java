/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Fernandodaniel
 */
public class ModeloLector {
        public String leerArchivo(File file)throws FileNotFoundException, IOException{//trhows 
            String informacion= "nada";
           
            FileInputStream fis=new FileInputStream(file);
            StringBuilder builder=new StringBuilder(); //Sirve para construir strings que se van leyendo caracter por caracter 
            int ch;
            while((ch=fis.read())!=-1){ 
                builder.append((char)ch); //append es agregar otro bloque para que se construya el archivo,casting para cambiar el tipo de dato
            }
            String nada= null;
            informacion=builder.toString();
            return informacion;
        }
    
}
