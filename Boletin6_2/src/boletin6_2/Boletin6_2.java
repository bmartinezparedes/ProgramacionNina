/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce cordenadas"+"\nMeridiano");
        double meridiano=sc.nextDouble();
        System.out.println("Paralelo");
        double paralelo=sc.nextDouble();
        System.out.println("distancia Tierra");
        double distanciaTerra=sc.nextDouble();
        Satelite s=new Satelite(meridiano, paralelo, distanciaTerra);
        s.verPosicion();
        
    }
    
}
