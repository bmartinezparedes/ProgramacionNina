/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class BucleDoWhile {
  
    public void verNumeroDoWhile(){
        
        int numero;
        do{ //facer
            numero=lerEntero("Introduce un numero entero"); //Bloque repetitivo
            if(numero!=0) //Para no visualizar el 0
                System.out.println(numero);// visualizar numero
        }while(numero!=0); //Condicion
        System.out.println("Saimos do do while");//Para indicarme que sali del bucle
        
        
    }
    
    
    
    public int lerEntero(String mensaxe){
        
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        
    }
    
    
    
}
