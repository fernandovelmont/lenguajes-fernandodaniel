/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.Serializable;

/**
 *
 * @author T-102
 */
public class Usuario implements Serializable  {
    private String nombre;
    private String email;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
