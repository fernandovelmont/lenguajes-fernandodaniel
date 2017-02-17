/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Fernandodaniel
 */
public class Primera {
 
     public static void main(String[] args) {
        //vamos primero la familia de exepciones que
        
        //el compilador se hace cargo de ellas
        int x=0;
        int y=2;
        //este renglon lanza una exepcion que se llama aritmetic exepcion
   //     System.out.println(y/x);
        int[] arreglo={1,2,3};
     //   System.out.println(arreglo[3]);
     try{
        float a=2;
        float b=Float.parseFloat("veinte"); //->clases wrapper
        System.err.println(a*b);
     }catch(Exception hola){
         System.out.println(hola.getMessage());
     }
        
    }
}

