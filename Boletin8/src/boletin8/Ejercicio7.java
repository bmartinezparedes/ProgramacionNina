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
public class Ejercicio7 {
   
    public void calcularTriangulo(){
        float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce base"));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce altura"));
        System.out.println("Area= "+ base*altura/2);
    }
    public void calcularCadrado(){
        float lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce lado"));
        System.out.println("Area= "+ Math.pow(lado, 2));
    }
    public void calcularCirculo(){
        float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduce radio"));
        System.out.println("Area= "+ Math.PI*Math.pow(radio, 2));
    }
    
    
    
    
}
