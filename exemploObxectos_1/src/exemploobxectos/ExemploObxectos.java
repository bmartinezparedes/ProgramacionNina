/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploobxectos;

import java.util.Scanner;

/**
 *
 * @author Braiskiskos
 */
public class ExemploObxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // instancio un obxecto tipo Rectangulo
        Rectangulo obxRec1 = new Rectangulo();
        //acceder metodo amosar 
      //  obxRec1.amosar();
        Rectangulo obxRec2=new Rectangulo(3f, 5f);
      //  obxRec2.amosar();
        //para visualizar la altuta con get
        float r=obxRec2.getAltura();
     //   System.out.println("altura="+r);
        //dar valor a obxRec1 base=10 y altura=11
       // obxRec1.setBase(10f);
       // obxRec1.setAltura(11f);
       // obxRec1.amosar();
       System.out.println("base:");
       float ba=sc.nextFloat();
       System.out.println("altura:");
       float alt=sc.nextFloat();
       Rectangulo obxR=new Rectangulo();
        float res=obxR.Area(ba, alt );
        System.out.println("area:"+res);
    }
    
}
