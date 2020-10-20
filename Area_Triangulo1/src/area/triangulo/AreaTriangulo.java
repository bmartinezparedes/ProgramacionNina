/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.triangulo;

/**
 *
 * @author Usuario
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base = 4.5f;//poño f para indicar que es float para que no lo tomo como double
        float altura = (float) 2.5;//fago un cast a float por que por defecto es un double
        float area;
        area = base*altura;
        System.out.println("Aera="+area);
    }
    
}
