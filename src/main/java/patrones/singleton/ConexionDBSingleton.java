/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.singleton;

/**
 *
 * @author Gardel
 */
public class ConexionDBSingleton {
    
    private static ConexionDBSingleton instancia;
    
    private ConexionDBSingleton(){
        
       System.out.println("Conectandose algun motor de base de datos");              
       
    }
    
    public static ConexionDBSingleton getInstacia(){
        
       if(instancia == null){
            instancia = new ConexionDBSingleton();
       }
        return instancia;
    }
    
}

 
