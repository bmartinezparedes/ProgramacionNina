/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        float tarifa, pagado;
        System.out.println("Introduce tarifa:");
        tarifa= sc.nextFloat();
        System.out.println("Introduce pagado:");
        pagado= sc.nextFloat();
        System.out.println("Descuento="+(tarifa-pagado)*100/tarifa+"%");
    }
    
}