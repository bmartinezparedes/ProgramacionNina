/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author Usuario
 */
public class Circulo {
    //Atributos
    private double radio,Pi=Math.PI;
    //Constructores
    public Circulo(){}
    public Circulo(double r){
    radio=r;
    }
    //metodos
    public void setRadio(double r){
    radio=r;
    }
    public double getRadio(){
    return radio;
    }
    public void Area(){
    double area=Math.pow(radio,2);
        System.out.println("Area="+area);
    }
    public void calcularLonxitude(){
    double lonxitude=radio*2*Pi;
        System.out.println("A lonxitude da circunferencia es de "+lonxitude);
    }
}
