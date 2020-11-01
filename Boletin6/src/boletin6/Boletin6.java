/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        Coche car=new Coche();
        System.out.println("Introduce incremento velocidad");
        int incremento=sc.nextInt();
        car.acelerar(incremento);
        System.out.println("Introduce decremento velocidad");
        int frenar=sc.nextInt();
        car.frenar(frenar);
        car.getVelocidade();
        
        
        
        
        
    }
    
}
