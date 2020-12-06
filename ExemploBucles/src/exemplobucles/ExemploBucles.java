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
public class ExemploBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*BucleWhile obxWhile=new BucleWhile();
        obxWhile.verNumeroWhile();*/
        
        /*BucleDoWhile obxDoWhile=new BucleDoWhile();
        obxDoWhile.verNumeroDoWhile();*/
        BucleFor obxFor=new BucleFor();
        //obxFor.verCastelao();
        int elementos= Integer.parseInt(JOptionPane.showInputDialog("Cantas voltas"));
        float res= obxFor.notaMedia();
        
        for(int i=0;1<elementos;i++){
            
            System.out.println("nota media"+obxFor.notaMedia());
        }
        
    }
    
}
