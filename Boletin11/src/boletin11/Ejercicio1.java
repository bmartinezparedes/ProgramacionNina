/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {
    
    
    public void juego(){
        
     int numero2,numero1=Integer.parseInt(JOptionPane.showInputDialog("Jugador 1 introduce numero"));
        do{
      numero2=Integer.parseInt(JOptionPane.showInputDialog("Jugador 2 adivine el numero"));
      if(numero2<numero1){
          System.out.println("Es mas grande");
      }else if(numero2>numero1){
          System.out.println("Es mas pequeño");
      }
        }while(numero1!=numero2);
        System.out.println("Acertaste el numero!!!! \nFelicidades");
    }
}
