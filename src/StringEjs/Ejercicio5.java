/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *Escribe un método que, dada una cadena de caracteres, cuente cuántas
veces aparece la misma en dicho texto. Por ejemplo, para la cadena “En un
lugar de la mancha, de cuyo nombre no puedo acordarme”, si se cuenta
cuántas veces aparece “o ”, o dicho de otra forma, cuántas palabras acaban
en o, debería indicar que son 3.
 * @author skril
 */
public class Ejercicio5 {
    
    public static int contadorVeces (String texto, String buscar){// La cadena en la que se quiere contar cuantes veces aparece el texto y el texto en el que se quiere buscar
       /* int contador=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.contains("o")) {
                contador++;
                
            }
            
        }
       */
       int pos =0;
       int veces=0;
       
       while((pos=texto.indexOf(buscar,pos))>=0){// Lo que hacemos aqui es asignamos a pos a la posicion de la palabra que queremos buscar ejemplo 24, una vez hemos asignado puesto que 24
           pos++;// una vez hemos asignado puesto que 24 es >=0 ahora pos aumenta y es 25, veces ahora vale 1, ahora va a buscar el siguiente texto que queramos buscar y pos vale (por ejemplo) 44
                // asi hasta que no encuentra el texto que queremos buscar entonces cuando no encuentra indexOf vale -1 y sale del bucle
           veces++;// 
       }
       return veces;                                                             
     
       
       
    }
    
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Veces que aparecen palabras que acaban en  o+espacio :  " +contadorVeces("En un lugar de la mancha cuyo edobre no puedo acrodarme","o "));
    }
    
}
