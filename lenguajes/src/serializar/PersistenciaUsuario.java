/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-102
 */
import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
    
    /*
    Primer metodo de tipo accion guardar
    */
    ArrayList<Usuario> usuarios=new ArrayList<>();
    
    public void guardar(Usuario u)throws Exception{
        File file= new File("tabla-usuario");
        if(file.exists()) usuarios=buscarTodos();
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
       usuarios.add(u);
        oos.writeObject(usuarios);
    }
    //BUSCAR TODOS
    
   public   ArrayList<Usuario> buscarTodos ()throws Exception{
       File file=new File("tabla-usuario");
       FileInputStream fis=new FileInputStream(file);
       ObjectInputStream ois=new ObjectInputStream (fis);
       usuarios= (ArrayList<Usuario>)ois.readObject();
       return usuarios;
   }
    
   public Usuario buscarPorNombre(String nombre)throws Exception {
    File file=new File("basesita-usuarios");
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois=new ObjectInputStream(fis);
    Usuario encontrado=null;
    Usuario u= (Usuario) ois.readObject();
    
    if(u.getNombre().equals(nombre))encontrado=u;
    return encontrado;
}
   
   //BUSCAR POR ID
   public Usuario buscarPorId(int id)throws Exception{
       Usuario buscado=null;
       usuarios= buscarTodos();
       //Comienza la busqueda
       buscado= usuarios.get(id);
       return buscado;
       }
}
