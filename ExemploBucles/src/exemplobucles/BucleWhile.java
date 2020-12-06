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
public class BucleWhile {
   /*Leer y visualizar sucesivamente numeros enteros desde o teclado. 
   O proceso remata cando se lea un 0*/
    
    public void verNumeroWhile(){
        int numero;
        
        numero= lerEntero();
        while(numero!=0){
            System.out.println(numero);
            numero=lerEntero();
        }
        
        System.out.println("Saimos do bucle");
        
    }
    
    public int lerEntero(){
        
        return Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero entero"));
        
    }
    
}
