/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
    Consumo Consume=new Consumo();
    System.out.println("Dar valor litros consumidos(Consume)");
    float litr=sc.nextFloat();
    Consume.setLitros(litr);
    System.out.println("Dar valor a precio gasolina en €/L (Consume)");
    float gas=sc.nextFloat();
    Consume.setpGas(gas);
    Consume.amosar();
            System.out.println("\nDar valor a Km");
    float km=sc.nextFloat();
        System.out.println("Dar valor a Litros");
    float lit=sc.nextFloat();
        System.out.println("Dar valor a velocidad media");
    float vMed=sc.nextFloat();
        System.out.println("Dar valor a precio gasolina");
    float pGas=sc.nextFloat();
    Consumo consumo=new Consumo(km,lit,vMed,pGas);
    consumo.amosar();
        System.out.println("\nTempo da viaxe="+consumo.getTempo()+"horas"+
                "\nConsumo medio coche="+consumo.getConsumoMedio()+"L"+
                "\nConsumo mdedio gasolina="+consumo.getConsumoEuros()+"€");
    
    
    }
    
}
