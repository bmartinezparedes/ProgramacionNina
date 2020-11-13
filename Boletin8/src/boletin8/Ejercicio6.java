/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {
    private String producto;
    private int cantidad;
    public void pedirProducto(){
    producto= JOptionPane.showInputDialog("Introduce nombre producto");
    }
    public void pedirCantidad(){
    cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad producto"));
    }
    public void comparar(){
        
        if(cantidad<=100){
            System.out.println(producto+" es de consumo "+"Baixo");
            
        }
        else if(cantidad>1000){
            System.out.println(producto+" es de consumo "+"Primera necesidade");
        }
        else if(100<cantidad&&cantidad<=500){
            System.out.println(producto+" es de consumo "+"Medio");
            
        }
        else System.out.println(producto+" es de consumo "+"Alto");
        
    }
    
}
