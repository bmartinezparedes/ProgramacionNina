/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//activo libreria Scanner
        float euros, cambio;
        System.out.println("Euros a pasar");//Pido valor
        euros= sc.nextFloat();//introduce valor pedido
        System.out.println("Cambio actual");//poner coma el introducir dato, no punto, sino da error
        cambio= sc.nextFloat();
        System.out.println(euros+"€ son "+euros*cambio+"$");//calcula y muestra
        
    }
    
}
