/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploobxectos;

/**
 *
 * @author Braiskiskos
 */
public class ExemploObxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instancio un obxecto tipo Rectangulo
        Rectangulo obxRec1 = new Rectangulo();
        // para pedir atributo de la clase Rectangulo
        float altura =obxRec1.altura;
        System.out.println("altura ---"+altura);//miramos la altura por ser publica
        //acceder metodo amosar 
        obxRec1.amosar();
        
        /*
        System.out.println("altura ---"+obxRec1.altura);
        equivaldria a estas sentencias:
            float altura =obxRec1.altura;
            System.out.println("altura ---"+altura);
        */
                
    }
    
}
