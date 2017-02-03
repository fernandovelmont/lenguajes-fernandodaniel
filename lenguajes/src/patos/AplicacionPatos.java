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
public class AplicacionPatos {
    public static void main(String[] args) {
        PatoCanadiense pc1=new PatoCanadiense();
        PatoCanadiense pc2=new PatoCanadiense();
       System.out.println(PatoCanadiense.color);
       
       PatoEuropeo  pe1=new PatoEuropeo();
       PatoEuropeo  pe2=new PatoEuropeo();
       System.out.println(PatoEuropeo.color);
       
       PatoMexicano  pm1=new PatoMexicano();
       PatoMexicano  pm2=new PatoMexicano();
       System.out.println(PatoMexicano.color);
       
    }
}
