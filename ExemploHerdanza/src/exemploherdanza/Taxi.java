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
public class Taxi extends Vehiculo{
    
    private String numLicencia;

    //insertar codigo--> constructor y seleccionar lo que necesites
    // aqui seleccionas el por defecto sin String numLicencia
    public Taxi() {
        
    }

    // aqui seleccionas el parametrozado con String numLicencia
    public Taxi(String numLicencia, String matricula, String modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }
    //Dentro del toString concateno el toString de la superclase
    @Override
    public String toString() {
        return super.toString()+", numLicencia=" + numLicencia;
    }

    /* otra manera de amosar el contenido, en este caso el toString de esta
    clase no puede llevar el super.toString*/
    /*public void amosar(){
        System.out.println(super.toString()+this.toString());
    }*/
    
    
    
}
