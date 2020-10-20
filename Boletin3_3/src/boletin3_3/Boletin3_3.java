/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int b100,b20,b5,m1;
        System.out.println("Cantidad billetes 100€");
        b100= sc.nextInt();
        System.out.println("Cantidad billetes 20€");
        b20= sc.nextInt();
        System.out.println("Cantidad billetes 5€");
        b5= sc.nextInt();
        System.out.println("Cantidad billetes 1€");
        m1= sc.nextInt();
        System.out.println("Total="+(100*b100+20*b20+5*b5+m1));
        //pongo el parentesis para que no me lo coloque Total=100.020.05.0.1.0
    }
    
}
