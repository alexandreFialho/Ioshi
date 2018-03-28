/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capivarabeijocas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fialho
 */
public class CapivaraBeijocas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<CapivaraBeijos> capivaras = new ArrayList<>();
        
        capivaras.add(new CapivaraBeijos("A", 19));
        capivaras.add(new CapivaraBeijos("B", 18));
        capivaras.add(new CapivaraBeijos("C", 16));
        capivaras.add(new CapivaraBeijos("D", 15));
        capivaras.add(new CapivaraBeijos("E", 14));
        capivaras.add(new CapivaraBeijos("F", 13));
        capivaras.add(new CapivaraBeijos("G", 12));
        capivaras.add(new CapivaraBeijos("H", 11));
        capivaras.add(new CapivaraBeijos("I", 10));
        
        for (CapivaraBeijos capivara : capivaras) {
            if (capivara.idade < 18){
                if (capivara.idade > 15){
                    capivara.registrarVariosBeijos(3);
                }else {
                    capivara.beijar();
                }
            }else {
                capivara.registrarVariosBeijos(6);
            }
        }
        
        for (CapivaraBeijos capivara : capivaras) {
            System.out.println(capivara.puxarCapivara() + "\n");
        }
    }
    
}
