/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce radio del circulo");
        double radio=sc.nextDouble();
        Circulo c=new Circulo(radio);
        c.Area();
        c.calcularLonxitude();
        System.out.println("El radio selecionado es "+c.getRadio());
        
    }
    
    
}
