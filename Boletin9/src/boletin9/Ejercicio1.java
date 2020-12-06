/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    private float numero;
    private int j=0,k=0,t=0; //J es el contador de positivos, k el de negativos y t los ceros
    public void ContarNumeros(){//aqui pido los numeros y los comparo para saber cuales osn positivos y cuales negativos
        
        for(int i=0;i<10;i++){
           numero=Float.parseFloat(JOptionPane.showInputDialog("Introduce un muero"));
            System.out.println("Numeros introducidos "+numero);
           if(numero>0){
        j++;
        }else if(numero==0){
         t++;
        }else{
         k++;  
        } 
        }
          
    }
    
    public void amosar(){
        
       System.out.println("Numeros positivos "+j+"\nNumeros negativos "+k+"\nCantidad de ceros"+t);
    }
    
}