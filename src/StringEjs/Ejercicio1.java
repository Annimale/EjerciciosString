
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringEjs;

import java.util.Scanner;

/**
 *
 * @author ivamar
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        String name;
        String apellido1;
        String apellido2;

        System.out.println("Introduce tu nombre, primer apellido y segundo apellido");
        name = tcl.nextLine();
        apellido1 = tcl.nextLine();
        apellido2 = tcl.nextLine();

        System.out.println("Primer punto en minusculas:  " + name.toLowerCase() + " , " + apellido1.toLowerCase() + " , " + apellido2.toLowerCase());
        System.out.println("***************************");
        System.out.println("Primer punto en mayusculas:  " + name.toUpperCase() + " , " + apellido1.toUpperCase() + " , " + apellido2.toUpperCase());
        System.out.println("***************************");
        System.out.println("La longitud de la cadena de nombre es: "+name.length()+", la longitud  del primer apellido es:  "+apellido1.length()+"  , la longitud del segundo apellido es:   "+apellido2.length());
        System.out.println("***************************");
        System.out.println("Segundo punto, los dos primeros caracteres de la cadena nombre:   "+name.charAt(0)+name.charAt(1)+"  , los dos primeros caracteres del primer apellido:   "+apellido1.charAt(0)+apellido1.charAt(1)+"  , los dos primeros caracteres del segundo apellido:  "+apellido2.charAt(0)+apellido2.charAt(1));
        System.out.println("***************************");
        System.out.println("Segundo punto, los dos ultimos caracteres de la cadena nombre:   "+name.charAt(name.length()-2)+name.charAt(name.length()-1)+"  , los dos primeros caracteres del primer apellido:   "+apellido1.charAt( apellido1.length()-2)+apellido1.charAt(apellido1.length()-1)+"  , los dos primeros caracteres del segundo apellido:  "+apellido2.charAt(apellido2.length()-2)+apellido2.charAt(apellido2.length()-1));
//      System.out.println("\n"); PARA AÑADIR UN ESPACIO ENTRE LINEAS
       
        char lastCaracter=name.charAt(name.length()-1);
        int contCaracter=0;
        
            for (int i = 0; i < name.length(); i++) {
                if((name.toLowerCase().charAt(i)==lastCaracter)){
                    contCaracter++;
                }
            
        }
        System.out.println("***************************");    
        System.out.println("Numero de caracteres que hay en name:  "+contCaracter);
        System.out.println("***************************");
        
        //Si la primera letra que es mayuscula se repite en la cadena te las cambia a mayusculas todas esos mismo caracteres
        for (int i = 0; i < name.length(); i++) {
            if (name.toLowerCase().charAt(i)==name.toLowerCase().charAt(0)){
                System.out.print(name.toUpperCase().charAt(i));
            }else{
                System.out.print(name.charAt(i));
                
            }
        
        }
        System.out.println("\n***************************");
        System.out.println("***"+name+"***");
        System.out.println("***************************");  
        for (int i = 1; i <=name.length(); i++) {// i=1 porque luego en el sout tiene que partir desde -1 para que me empiece desde el final de la cadena.
            System.out.println(name.charAt(name.length()-i));
            
        }
        
        }
            
        }
        
    


