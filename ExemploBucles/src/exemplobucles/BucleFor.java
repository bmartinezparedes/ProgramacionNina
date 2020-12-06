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
public class BucleFor {
    
    public void verCastelao(){
        int elementos= Integer.parseInt(JOptionPane.showInputDialog("Cantas voltas"));
        for(int i=0, j=1;i<elementos;i++,j++){
            System.out.println(j+"Castelao");
        }
    }
    
    public float notaMedia(){
      int not1= lerEntero("Primerira nota");
      int not2= lerEntero("Segunda nota");
      int not3= lerEntero("Tercera nota");
      float media= (float)(not1+not2+not3)/3;
      return media;
    }
    
    public int lerEntero(String mensaxe){
        
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        
    }
}
