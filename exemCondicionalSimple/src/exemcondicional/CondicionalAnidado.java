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
public class CondicionalAnidado {
  /*
    Coñeciodo o nome, idade e peso dunha persoa escribir os seus datos se he maior de idade e pesa mais de 70Kg.
    */  
    
    public void amosarDatos(String nome, int edade, float peso){
    
        if(edade>=18){
            if(peso>70)
                System.out.println("Nome:"+nome+"\nEdade:"+edade+"\nPeso:"+peso);
        }
        System.out.println("rematamos condicional");
    }
    
    
}
