/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemcondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ExemCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // CondicionalSimple obx=new CondicionalSimple();
       // obx.maiorEdade(40);
        
        
        //CondicionalDobre obxDobre=new CondicionalDobre();
       // obxDobre.comparar(25);
       //obxDobre.comparar(12);
      // obxDobre.operadorInterrogante(2);
       
     /*  Metodos obxMetodos=new Metodos();
       int edade= obxMetodos.pedirInt();
      // obxDobre.comparar(edade);
       float peso=obxMetodos.pedirFloat();
       String nome=obxMetodos.pedirString();
       CondicionalAnidado obxAni=new CondicionalAnidado();
       obxAni.amosarDatos(nome, edade, peso);*/
     CondicionalMultiple obx=new CondicionalMultiple();
     int numero= Integer.parseInt(JOptionPane.showInputDialog("teclea numero dia :"));
     obx.amosarDiaSemana2(numero);
    }
    
}
