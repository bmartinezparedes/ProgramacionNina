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
public class Boletin8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Ejercicio6 producto1=new Ejercicio6();
        producto1.pedirProducto();
        producto1.pedirCantidad();
        producto1.comparar();
        
        Ejercicio6 producto2=new Ejercicio6();
        producto2.pedirProducto();
        producto2.pedirCantidad();
        producto2.comparar();
        
        Ejercicio6 producto3=new Ejercicio6();
        producto3.pedirProducto();
        producto3.pedirCantidad();
        producto3.comparar();
        
        Ejercicio6 producto4=new Ejercicio6();
        producto4.pedirProducto();
        producto4.pedirCantidad();
        producto4.comparar();*/
        
        Ejercicio7 ej7=new Ejercicio7();
        String resposta;
        do{
        resposta=JOptionPane.showInputDialog("Menu \nArea Triangulo \nArea Cadrado \nArea Circulo \nFIN (remata) \nTeclea opcion");

        switch(resposta){
            case"Area Triangulo": ej7.calcularTriangulo();
            break;
            case"Area Cadrado": ej7.calcularCadrado();
            break;
            case"Area Circulo": ej7.calcularCirculo();
            break;
            case"FIN": System.out.println("Fin Programa");
            break;
            default: System.out.println("Opcion incorrecta");
            
        }
        
        }while(resposta.equals("FIN")==false);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
