/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lerdatos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LerDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//EN este punto le damos a la bombilla y añadimos Scanner
        float base, altura;
        System.out.println("teclea a base:");//Pedimos base
        base= sc.nextFloat();//Y aqui mete el numero introducido
        System.out.println("teclea a altura:");
        altura= sc.nextFloat();
        System.out.println("Area="+base*altura);
    }
    
}
