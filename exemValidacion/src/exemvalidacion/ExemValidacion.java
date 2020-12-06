/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemvalidacion;

/**
 *
 * @author Usuario
 */
public class ExemValidacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Validacion validar=new Validacion();
        float res=validar.validaWhile();
        System.out.println("Dato valido: "+res);
        
        
        
    }
    
    
}
