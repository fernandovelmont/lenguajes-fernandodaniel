/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class MainCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes =new ArrayList<>();
        //creamos el primer cliente
        Cliente c1=new Cliente("juan",20000,19);
        Cliente c2=new Cliente("Pedro",16500,23);
        Cliente c3=new Cliente("Ana",23000,20);
        
        //Al arrayList que se llama:clientes le agregamos 
        //uno a uno los tres clientes
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        //iteramos el arraylist
        for(Cliente c:clientes){
            System.out.println(c);
        }
        
        
    }
   
}
