/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

/**
 *Escribe un método que, dada una cadena de caracteres, sustituya todas las
ocurrencias del texto “es” por “no por”. Escribe un segundo método que
sustituya todos los grupos de dígitos por un único carácter asterisco, es decir,
si la cadena de caracteres es “esto1234es5678bueno900” el primer método
debe devolver “no porto1234no por5678bueno900” y el segundo debe
devolver “esto*es*bueno*”. Escribe el programa que permita comprobar que
funciona correctamente.

* Nota: La expresión regular \\d+ significa un dígito o más.
Puedo usar replaceAll( “\\d+” , “*” );
Más información sobre expresiones regulares en Java:
http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
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

