/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinscodigo;

/**
 *
 * @author Usuario
 */
public class Coche {
    private float velocidade;
    private String cor;
    private float prezo;

    public Coche() {
    }

    public Coche(float velocidade, String cor, float prezo) {
        this.velocidade = velocidade;
        this.cor = cor;
        this.prezo = prezo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public String getCor() {
        return cor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public String amosar(){
    String resposta= "velocidade= "+velocidade+" cor= "+cor+" prezo"+prezo;
    return resposta;
    //TAMEN
    /*
     *return "velocidade= "+velocidade+" cor= "+cor+" prezo"+prezo
     */
    
    }
    //debuelve caracteristicas del objeto
    
    @Override //sobrescribir
    public String toString() {
        return "velocidade= " + velocidade + ", cor= " + cor + ", prezo= " + prezo;
    }
    
    
    
    
    
}
