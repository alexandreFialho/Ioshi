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
public class NotaFiscalGoritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NotaFiscal nota = new NotaFiscal();
            
        nota.setNomeCliente("Alexandre");
        nota.registrarCompra("Leite", 3.50, 2);
        nota.registrarCompra("Mamão", 2.00, 5);
        nota.registrarCompra("Ovo", 0.50, 10);
        
        System.out.println(nota.visualizarNota());
    }
    
}
