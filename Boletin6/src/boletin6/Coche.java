/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author Usuario
 */
public class Coche {
    //Atributos 
    private int velocidade, incremento, decremento;
    
    //Constructor
    public Coche(){
    velocidade=0;
    }
    public int getVelocidade(){
    System.out.println("Velocidad actual es de "+velocidade);
    return velocidade;
    }
    
    public void acelerar(int valor){
        velocidade=velocidade+valor;
        System.out.println("Incrementa en "+velocidade);
    }
    public void frenar (int menos){
    velocidade=velocidade-menos;
        System.out.println("decrementa en "+velocidade);
    }
    
}