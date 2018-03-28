/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroempercurso;

/**
 *
 * @author fialho
 */
public class Carro {
    private double capacidadeTanque = 0, consumoKmLitro = 0,
            combustivelTanque = 0, kmPercorridos = 0;
    private boolean tanqueCheio = false;
    private boolean tanqueVazio = false;
    
    public Carro (double tanque, double litro){
        this.capacidadeTanque = tanque;
        this.consumoKmLitro = litro;
    }
    
    public String getStatus(){
            return "Quantidade de combustível no tanque: "
                +combustivelTanque+" listros \n"
                + "Quantidade de km rodados: "+String.format("%1.2f", kmPercorridos)+" Km \n"
                + "Autonomia atual: "+String.format("%1.2f",
                        combustivelTanque*consumoKmLitro)+" Km \n";
    }
    
    public void abastecer(double litros){
        
        tanqueCheio = combustivelTanque == capacidadeTanque;
        
        if (!tanqueCheio){
            if ((combustivelTanque + litros) > capacidadeTanque){
                
                combustivelTanque += capacidadeTanque - combustivelTanque;
                tanqueCheio = true;
            }else {
                
                combustivelTanque += litros;
                tanqueCheio = combustivelTanque == capacidadeTanque;
            }
        }
    }
    
    public void andar (double distancia){
        
        if (!tanqueVazio){
            if (combustivelTanque - (distancia / consumoKmLitro) < 0){
                
                kmPercorridos += (combustivelTanque / consumoKmLitro);
                combustivelTanque -=  combustivelTanque;
                
                
                tanqueVazio = true;
                
                System.out.println("Seu carro não pode concluir essa distância!\n"
                        + "Pois seu combustivel acabou. \n");
            }else {
                
                combustivelTanque -= distancia/consumoKmLitro;
                kmPercorridos += distancia;
                tanqueVazio = combustivelTanque == 0;
            }
        }
    }


    public boolean isTanqueCheio() {
        return tanqueCheio;
    }

    public boolean isTanqueVazio() {
        return tanqueVazio;
    }
}


