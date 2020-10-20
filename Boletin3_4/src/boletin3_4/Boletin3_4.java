/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int dinero;
        System.out.println("Introduce la cantidad de dinero deseado");
        dinero= sc.nextInt();
        System.out.println("Recoge "+dinero/100+" billetes de 100€, "+dinero%
        100/20+" billetes de 20€, "+dinero%100%20/5+" billetes de 5€ y "+dinero%
        100%20%5+" monedas de 1€");
        //
    }
    
}
