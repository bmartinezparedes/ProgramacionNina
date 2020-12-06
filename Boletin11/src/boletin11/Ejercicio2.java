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
public class Ejercicio2 {
    
   
    public void juego(){
        int numero,dis,aleatorio=(int)(Math.random()*50+1);
        //System.out.println(aleatorio); //Para probar los resultados
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Acierta el numero comprendido entre 1 y 50"));
            dis=Math.abs(aleatorio-numero);
            if(dis>20){
                System.out.println("Moi lonxe");
            }else if(dis<=20&&dis>=10){
                System.out.println("Lonxe");
            }else if(dis<10&&dis>5){
                System.out.println("Preto");
            }else
                System.out.println("Moi preto");
        }while(aleatorio!=numero);
        System.out.println("Acertaste el numero!!!! \nFelicidades");
    }
}
