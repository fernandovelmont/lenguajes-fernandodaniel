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
public class MayusculasExcepcion extends Exception {
    public MayusculasExcepcion(){
        super("No se permiten mayusculas en el nombre");
    }
    
}
