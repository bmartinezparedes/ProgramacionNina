/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemcondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Metodos {
    public int pedirInt(){
    String resposta= JOptionPane.showInputDialog("teclea edade:");
   int valor=Integer.parseInt(resposta);
   return valor;
    }
    
    public int pedirInt2(){
    int valor= Integer.parseInt(JOptionPane.showInputDialog("Edade:"));
    return valor;
    /*
    return  Integer.parseInt(JOptionPane.showInputDialog("Edade:"));
    */
    
    }
    public Float pedirFloat(){
    return Float.parseFloat(JOptionPane.showInputDialog("teclea peso:"));
    
    }
    public String pedirString(){
    
    return JOptionPane.showInputDialog("teclea nome:");
    }
    
    
}
