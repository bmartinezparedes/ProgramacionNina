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
public class CondicionalMultiple {
    
    public void amosarDiaSemana(int dia){
        
        if(dia>=1&&dia<=7){
            switch(dia){
                case 1: System.out.println("Luns");
                        break;
                case 2: System.out.println("Martes");
                        break;
                case 3: System.out.println("Meercore");
                        break;
                case 4: System.out.println("Xoves");
                        break;
                case 5: System.out.println("Venres");
                        break;
                case 6: System.out.println("Sabado");
                        break;
                case 7: System.out.println("Domingo");
            }
                
        }
        else 
            System.out.println("Erro, el numero tiene que estar entre 1 y 7");
        
    }
    
    public void amosarDiaSemana2(int dia){
        
        switch(dia){
                case 1: System.out.println("Luns");
                        break;
                case 2: System.out.println("Martes");
                        break;
                case 3: System.out.println("Meercore");
                        break;
                case 4: System.out.println("Xoves");
                        break;
                case 5: System.out.println("Venres");
                        break;
                case 6: System.out.println("Sabado");
                        break;
                case 7: System.out.println("Domingo");
                        break;
                default: System.out.println("Erro, el numero tiene que estar entre 1 y 7");
            }
        
    }
}
