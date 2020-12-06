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
public class BucleFor1 {
    
    public void verCastelao(){
        int elementos= Integer.parseInt(JOptionPane.showInputDialog("Cantas voltas"));
        for(int i=0, j=1;i<elementos;i++,j++){
            System.out.println(j+"Castelao");
        }
    }
    
    public float notaMedia(){
      return((float)(lerEntero("Primerira nota")+lerEntero("Segunda nota")+lerEntero("Tercera nota"))/3);
     
    }
    
    public int lerEntero(String mensaxe){
        
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        
    }
}
