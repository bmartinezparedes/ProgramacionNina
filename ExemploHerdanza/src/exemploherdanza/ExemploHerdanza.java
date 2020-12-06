/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

/**
 *
 * @author Usuario
 */
public class ExemploHerdanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Taxi taxi=new Taxi("aaaa","1234","audi",120);
        
        Autobus autobus=new Autobus();
        
        System.out.println("Taxi: "+taxi.toString());
        
        System.out.println("Autobus: "+ autobus.toString());
        
        autobus.setNumPlazzas(150);
        autobus.setMatricula("bbbb");
        autobus.setModelo("vitrasa");
        autobus.setPotencia(200);
        
        System.out.println(autobus.toString());
    }   
}
  