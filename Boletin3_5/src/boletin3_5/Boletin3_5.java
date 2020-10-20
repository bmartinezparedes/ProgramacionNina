/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float sFijo, ventas, km, dias, sBruto;
        System.out.println("Introduce el sueldo fijo:");
        sFijo= sc.nextFloat();
        System.out.println("Introduce el valopr de ventas echas:");
        ventas= sc.nextFloat();
        System.out.println("Introduce los quilometros recorridos:");
        km= sc.nextFloat();
        System.out.println("Introduce los dias trabajados:");
        dias= sc.nextFloat();
        sBruto= sFijo+(ventas*0.05f)+(km*2)+(dias*30);
        System.out.println("Tu sueldo bruto es de "+sBruto+" y tu sueldo liquido es de "+(sBruto-sBruto*0.18-36));
    }
    
}
