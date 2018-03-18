/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

/**
 *
 * @author fialho
 */
public class Conta {
    
    private String[] conta = {
        "nomeCliente",
        "agencia",
        "conta"
    };

    private double saldo;
    private String[] extrato = new String[100];
    private int cont = 0;
    
    public double getSaldo() {
        return saldo;
    }
    
    public String[] getConta() {
        return conta;
    }

    public String[] getExtrato() {
        return extrato;
    } 
    
    public Conta(String nome, String agencia,
            String conta, double valor){
        this.conta[0] = nome;
        this.conta[1] = agencia;
        this.conta[2] = conta;
        this.saldo = valor > 0 ? valor : valor*(-1);
        
        atualizarExtrato("Abertura", this.saldo);
    }
    
    private void atualizarExtrato(String desc, double valor){
        
        this.extrato[cont] = valor > 0 ? desc+" - "+valor+" (C)":
                desc+" - "+valor*(-1)+" (D)";
        this.cont += 1;
    }
    
    public void depositar(double valor){

        if (valor > 0){
            this.saldo += valor;
            atualizarExtrato("Depósito", valor);
        }
    }
    
    public void transferir(String desc, double valor){
        
        valor = valor > 0 ? valor : valor * (1);
        this.saldo -= valor;
        this.atualizarExtrato(desc, valor - (valor * 2));
    }
    
    public String recuperarExtrato(){
        
        String retorno = "== Extrato do cliente "+this.conta[0]+" ==\n";
        retorno += "Ag. "+this.conta[1]+" - Conta. "+this.conta[2]+"\n";
        
        for (int i = 0; i < this.cont; i++) {
            retorno += extrato[i]+"\n";
        }
        
        retorno += "\n"
                + "Saldo: R$ "+String.format("%1.2f", this.saldo);
        return retorno;
    }
}