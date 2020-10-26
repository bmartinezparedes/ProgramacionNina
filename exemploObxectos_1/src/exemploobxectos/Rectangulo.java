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
public class Rectangulo {
    //atributos
    private float base;
    private float altura; //No se deve poner publica
    
    //constructores
    public Rectangulo(){
        
    }
    public Rectangulo(float b, float al){
    base=b;
    altura=al;
    }
    
    
    
    //metodos de acceso getters y setters
    public void setBase(float b){
    base=b;
    }
    public float getBase(){
    return base;
    }
    public void setAltura(float al){
    altura=al;
    }
    public float getAltura(){
    return altura;
    }
    
    //metodo para calcular el area del rectangulo y que devuelva el resultado
    public float Area(float base, float altura){
        float area;
        area= base*altura;
        return area;        
        
    }
    
    
    //metodos
    public void amosar(){
        System.out.println("base="+base+" altuta="+altura);
    }
}