/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafiscalgoritmo;

/**
 *
 * @author fialho
 */
public class NotaFiscal {
    private String nomeCliente;
    private String[] itens = new String[100];
    private int cont = 0;
    private double total = 0;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void registrarCompra(String produto, double valor, int qtd){
        this.itens[cont] = produto+" - R$"+String.format("%1.2f", valor)+
                " - "+qtd+" - R$"+String.format("%1.2f", valor*qtd);
        this.total += valor*qtd;
        this.cont += 1;
    }
    
    public String visualizarNota(){
        String retorno = "== Nota fiscal do cliente "+this.nomeCliente+" ==\n";
        retorno += "Item - Valor unitário - Quantidade - Sub total\n";
        
        for (int i = 0; i < cont; i++) {
            retorno += (i+1)+". "+this.itens[i]+"\n";
        }
        
        retorno += "Total de itens: "+this.cont+"\n";
        retorno += "Valor total da compra: R$"+
                String.format("%1.2f", this.total)+"\n";
        
        return retorno;
    }
}
