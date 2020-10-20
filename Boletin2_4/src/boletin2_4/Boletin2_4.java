/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Introduce primer numero:");
        a = sc.nextFloat();
        System.out.println("Introduce segundo numero:");
        b= sc.nextFloat();
        System.out.println("Suma="+(a+b)+"\nResta="+(a-b)+"\nProducto="+a*b+"\nCociente="+a/b);
        //poner sumas y restas entre parentesis cuando hacer directamente en salida, sino error.
    }
    
}
