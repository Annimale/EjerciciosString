/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

/**
 *
 * @author ivamar
 */
public class Ejercicio4 {
    
    public static String cambiarPalabras(String cadena){
        
        return cadena.replaceAll("es", "no por");
 
    }
       
    public static String cambiarDigitos(String cadeno){
        
        return cadeno.replaceAll("\\d", "*");
    }
    
    
    
    
    
    
        public static void main(String[] args) {
        
            
            System.out.println(cambiarPalabras(" Es un buen coche, pero el mio es mejor"));
            
            System.out.println(cambiarDigitos("Tengo 123 coches, y tu ?"));
            
            
    }
        
    }

