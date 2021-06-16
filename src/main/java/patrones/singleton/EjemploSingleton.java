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
public class EjemploSingleton {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            ConexionDBSingleton con =  ConexionDBSingleton.getInstacia();
            System.out.println("CON = " + con);
        }
              
    }
}
