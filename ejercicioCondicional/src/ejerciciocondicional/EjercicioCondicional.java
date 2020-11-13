/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocondicional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Comparador comp= new Comparador();
        System.out.println("Introduce el primer numero");
        int num1=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2=sc.nextInt();
        comp.Comparar(num1, num2);
    }
    
    
}
