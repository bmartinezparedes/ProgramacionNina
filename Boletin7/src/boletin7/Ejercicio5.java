/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
    public void comparacion(double numero1, double numero2, double numero3){
    
        if(numero1>numero2 && numero1>numero3){
                System.out.println("El mayor es "+numero1);
            }
        else if(numero2>numero1 && numero2>numero3){
            System.out.println("El mayor es "+numero2);
            
        }
        else System.out.println("El mayor es "+numero3);
    }
   
    }  
