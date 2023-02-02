/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

import java.util.Scanner;

/**
 
 * . Escribe un método que, dado un String, devuelve otro objeto String en el que
    se cambian todas las vocales minúsculas del original por la letra 'a'. Escribe un
    programa que permita comprobar el funcionamiento

 * 
 * @author ivamar
 */
public class Ejercicio2 {
    
    public static String cambiarVocales(String cadena){
        /*for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)=='a'){
               cadena.t(i)='a'
            }else if(cadena.charAt(i)=='e'){
                
            }else if(cadena.charAt(i)=='o'){
            
             }else if(cadena.charAt(i)=='u'){
                
             }else if(cadena.charAt(i)=='i') {   
        }
        
    }*/
        cadena=cadena.replace('e', 'a');
        cadena=cadena.replace('o', 'a');
        cadena=cadena.replace('i', 'a');
        cadena=cadena.replace('u', 'a');
        
        return cadena;
}
            public static void main(String[] args) {
                
                
                System.out.println(cambiarVocales("Manolo"));
                
                
                
                
    }
    
}
