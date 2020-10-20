/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float c;
        System.out.println("Introduce temperatura en ºC");
        c= sc.nextFloat();
        System.out.println(c+"ºC son "+(c+273)+"ºK y "+(1.8*c+32)+"ºF");
    }
    
}
