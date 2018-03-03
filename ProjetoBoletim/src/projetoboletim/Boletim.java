/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoboletim;

/**
 *
 * @author afaraujo
 */
public class Boletim {
    private String nomeAluno, resultado;

    public Boletim (String nome){
        this.nomeAluno = nome;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    private double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
    
    public void calcularResultado(double nota1, double nota2){
        this.resultado = calcularMedia(nota1, nota2) < 5 ? "Respovado" : "Aprovado";
    }
}
