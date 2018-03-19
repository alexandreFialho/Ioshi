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
public class Biscoito {
    private String sabor;
    private double peso, caloriasPorUnidade, preco;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }

    public void setCaloriasPorUnidade(double caloriasPorUnidade) {
        this.caloriasPorUnidade = caloriasPorUnidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Biscoito(String sabor, double peso, 
            double calorias, double preco){
        this.sabor = sabor;
        this.peso = peso;
        this.caloriasPorUnidade = calorias;
        this.preco = preco;
    }
}
