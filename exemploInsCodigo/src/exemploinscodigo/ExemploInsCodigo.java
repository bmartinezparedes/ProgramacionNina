/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinscodigo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExemploInsCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //Coche obxc1=new Coche(220, "verde",12000);
        System.out.println("Introduce velocidad");
        float velocidade= sc.nextFloat();
        System.out.println("Introduce color");
        String color= sc.next();
        System.out.println("Introduce precio");
        float prezo= sc.nextFloat();
        Coche2 obxc2=new Coche2(velocidade, color, prezo);
        System.out.println(obxc2.toString());
       // System.out.println(obxc1.amosar());
        //System.out.println(obxc1.toString());
       // System.out.println(obxc1);
        
        
    }
    
}
