/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoguloseimas;

/**
 *
 * @author fialho
 */
public class Lanche extends Biscoito{
    private String tipo;

    public Lanche(
            String tipo,
            String sabor,
            double peso,
            double calorias,
            double preco) {
        
        super(sabor, peso, calorias, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
