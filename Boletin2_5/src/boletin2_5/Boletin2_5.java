/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        float milla;
        System.out.println("Introduce millas");
        milla= sc.nextFloat();
        System.out.println(milla+" millas son "+milla*1852+" metros");
        
      
    }
    
}
