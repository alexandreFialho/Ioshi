/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutaepica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fialho
 */
public class LutaEpica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        List<Lutador> lutador = new ArrayList<>();
        
        lutador.add(new Lutador("Alexandre", 23.8));
        lutador.add(new Lutador("Jackson", 23.8));
        
        do {
            for (int i = 0; i < lutador.size(); i++) {
            System.out.println("Lutador : "+ lutador.get(0).getNome() +"\n"
                    + lutador.get(0).getBarraVida() +"\n"
                    + "Lutador : "+ lutador.get(1).getNome() +"\n"
                    + lutador.get(1).getBarraVida() +"\n");
            
                if (i == 0){
                    if (lutador.get(i).isVivo()){
                        if (!lutador.get(i+1).isVivo()){
                            break;
                        }
                        lutador.get(i+1).receberGolpe(lutador.get(i).aplicarGolpe());
                    }
                }else {
                    if (lutador.get(i).isVivo()){
                        if (!lutador.get(i-1).isVivo()){
                            break;
                        }
                        lutador.get(i-1).receberGolpe(lutador.get(i).aplicarGolpe());
                    }
                }
            }
        }while (lutador.get(0).isVivo() && lutador.get(1).isVivo());
            
            String vencedor = lutador.get(0).isVivo() ? lutador.get(0).getNome():
                lutador.get(1).getNome();
            
            System.out.println("Lutador : "+ vencedor +" venceu!");
    }
        
}