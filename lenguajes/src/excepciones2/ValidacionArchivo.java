/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author Fernandodaniel
 */

import java.io.*;
public class ValidacionArchivo {
    public static void validarExtencion(File file)throws ExtencionNoValidaException{
        //Preguntamos el nombre
        String nombre= file.getName();
        
    int indice1= nombre.indexOf(".");
    int indice2= nombre.length();
    String extencion=nombre.substring(indice1-1, indice2);
    if(!extencion.endsWith("txt"))
        throw new ExtencionNoValidaException();
    
        
  }
    public static void ValidarMayusculas(File file)throws MayusculasExcepcion{
        String nombre=file.getName();
        //usar touppr Case()o tolower case()
    }
}
