/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemcondicional;

/**
 *
 * @author Usuario
 */
public class CondicionalSimple {
    private int edade;

    public CondicionalSimple() {
    }

    public CondicionalSimple(int edade) {
        this.edade = edade;
    }
    
    public void maiorEdade(int edade){
        /* if con solo una salida no necesita {}, pero si son 2
        o mas si necesitaria englovarlo en {}*/
        if(edade>=18)
            System.out.println(" e mair de edade");
        
        
        System.out.println(" --remata o condicional-- ");
    
    }
    
    
}
