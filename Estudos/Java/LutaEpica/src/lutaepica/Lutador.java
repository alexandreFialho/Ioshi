/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutaepica;

/**
 *
 * @author fialho
 */
public class Lutador {
    private String nome;
    private double vida = 100;
    double forcaGolpe;
    
    public Lutador(String nome, double forcaGolpe){
        this.nome = nome;
        this.forcaGolpe = forcaGolpe < 1 || forcaGolpe > 99 ? 0 : forcaGolpe;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean isVivo(){
        return vida > 0;
    }
    
    public String getBarraVida(){
        String retorno = "";
        
        for (int i = 0; i < vida; i++) {
            retorno += "#";
        }
        
        return retorno;
    }
    
    public void receberGolpe(double forca){
        vida -= forca > 0 ? forca : 0;
    }
    
    public double aplicarGolpe(){
        return this.forcaGolpe;
    }
    
    public void reset(){
        vida = 100;
    }
}
