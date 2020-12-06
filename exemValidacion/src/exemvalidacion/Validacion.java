/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemvalidacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Validacion {
    
    public float validarDato(){
    float dato;
    
    do{
    dato=Float.parseFloat(JOptionPane.showInputDialog("Introduce numero positivo"));
}while(dato<=0);
    return dato;
}  
    
    public float validaWhile(){
        
        float dato2;
        dato2=Float.parseFloat(JOptionPane.showInputDialog("Introduce numero positivo"));
        while(dato2<=0){
        dato2=Float.parseFloat(JOptionPane.showInputDialog("Introduce numero positivo")); 
        }
        return dato2;
    }
}
