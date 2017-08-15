package javaapplication28;

import java.util.ArrayList;
import java.math.*
import java.io.*;
import java.util.*;
import java.util.Scanner;
        
        
public class JavaApplication28 {

   
    
    public static void main(String[] args) {
       

    int resultado = 0;
    int entrada = 0;
    int salida = 0; 
   
    
    Scanner num = new Scanner(System.in);
    System.out.print("Ingrese un número "); 
    int numero = num.nextInt();
        
        if (numero >= 0) {
                 for ( int i = 0; i <= numero; i++) {
                    System.out.println(i);
                      }
                         } else {
            
            resultado = funcion(numero);
            for ( int i = 0; i <= resultado; i++) {
                    System.out.println(i);
                  }
            }
        
        
    }
    
     public static int funcion (int entrada){
         
          int salida = (-1) * entrada;
               return salida;
    
     }
}

