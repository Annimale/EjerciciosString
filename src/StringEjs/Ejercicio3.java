/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

/**
 *Escribe un método que, dada una cadena de caracteres, devuelve la mitad
inicial de la cadena. Escribe un programa que pruebe el método con las
cadenas “Hola que tal” y “Adiós”
 * @author ivamar
 */
public class Ejercicio3 {
    
    public static String mitadCadena(String cadena){
        
        /*for (int i = 0; i < cadena.length(); i++) { SE PUEDE HACER CON UN BUCLE PERO ES MUCHO MAS SENCILLO 
                if(cadena.length())
            
        }*/
        
        
        return cadena.substring(0, cadena.length()/2);
    }
    public static void main(String[] args) {
        
        System.out.println(mitadCadena("Manolito"));
        
    }
}
