/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    
    public void multiplicarNumeros(){
        int i;
        double resultado=1;
        
        for(i=10;i<=90;i++){
            resultado=resultado*i;
        }
        System.out.println(resultado);
    }
    public void sumarNumeros(){
        int i;
        double resultado=0;
        for(i=10;i<=90;i++){
            resultado=resultado+i;
        }
        System.out.println(resultado);
    }
}
