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
public class CondicionalDobre {
    
    public void comparar(int edade){
    
        if(edade>=18){
            System.out.println(" e maior de edade");
        }
        else{
            System.out.println(" e menor de idade");
        }
            
        System.out.println("Remata o condicional");
    }
    public void operadorInterrogante(int edade){
       String mensaxe=(edade>=18)? " e maior de edade":" e menor de idade";
        System.out.println(mensaxe);
    }
    
    
}
