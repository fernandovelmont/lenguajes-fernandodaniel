/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patos;

/**
 *
 * @author Fernandodaniel
 */
public class PatoCanadiense extends Pato implements ComportamientoVolar{
    
    public  static final String color="cafe";//static compartido 
    //final por que el color no va a cambiar
    
    @Override
    public void volar(){
        System.out.println("Soy pato canadiense y vuelo");
        
    }
}
