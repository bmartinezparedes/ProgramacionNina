/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author Usuario
 */
public class Consumo {
    //atributos
    private float km, litros, vMed, pGas;
    // Constructores
    public Consumo(){
    
    }  
    public Consumo(float k,float l, float vM, float pG){
    km=k;
    litros=l;
    vMed=vM;
    pGas=pG;
    }
    //Metodos
    
    public float getTempo(){
    return km/vMed;
    }
    public float getConsumoMedio(){
    return (100*litros)/km;
    }
    public float getConsumoEuros(){
    return ((100*litros)/km)*pGas;
    }
    public void setKms(float k){
    km=k;
    }
    public void setLitros(float l){
    litros=l;
    }
    public void setvMed(float vM){
    vMed=vM;
    }
    public void setpGas(float pG){
    pGas=pG;
    }
    public void amosar(){
        System.out.println("\nKilometros recorridos="+km+"km"+
        "\nLitros combustible consumidos="+litros+"L"+"\nVelocidad media="+vMed
        +"km/h"+"\nPrezo gasolina="+pGas+"€/L");
    }
   
}
