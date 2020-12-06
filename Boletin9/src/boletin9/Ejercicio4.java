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
public class Ejercicio4 {
    
    public void tablaMultiplicar(){
    int numero;
    do{
    numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la tabla que deseas"));
    if(numero!=0){
        if(numero>=1){
        System.out.println("1*"+numero+"="+numero+"\n2*"+numero+"="+2*numero+
                "\n3*"+numero+"="+3*numero+"\n4*"+numero+"="+4*numero+
                "\n5*"+numero+"="+5*numero+"\n6*"+numero+"="+6*numero+
                "\n7*"+numero+"="+7*numero+"\n8*"+numero+"="+8*numero+
                "\n9*"+numero+"="+9*numero+"\n10*"+numero+"="+10*numero);
                }else 
            System.out.println("No valido, tiene que ser positivo");
            
    }else 
            System.out.println("Fin programa");
}while(numero!=0);
        System.out.println("Fin Bucle");
    }   
}
