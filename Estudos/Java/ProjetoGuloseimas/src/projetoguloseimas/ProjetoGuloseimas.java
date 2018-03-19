/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoguloseimas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fialho
 */
public class ProjetoGuloseimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereBiscoito
        
        
        
        List<Lanche> lanche = new ArrayList<>();
        lanche.add(new Lanche("Salgado", "Coxinha", 0.300, 0.250, 4.50));
        lanche.add(new Lanche("Esfirra", "Frango", 0.350, 0.300, 4.75));
        lanche.add(new Lanche("Biscoito","Chocolate", 0.120, 0.60, 2.79));
        lanche.add(new Lanche("Biscoito","Morango", 0.100, 0.45, 2.25));
        
        for (Lanche i : lanche) {
            System.out.printf("%s\n%s\n%sg\n%s Kcal\nR$ %s\n",
                    i.getTipo(),
                    i.getSabor(),
                    String.format("%1.2f", i.getPeso()),
                    String.format("%1.2f", i.getCaloriasPorUnidade()),
                    String.format("%1.2f", i.getPreco()));
            System.out.println("");
        }
        
        GrupoDeLanches grupo = new GrupoDeLanches();
        
        String[] lancheCalorico = grupo.lancheMaisCalorico(
                lanche.get(0), lanche.get(1)).split("/");
        
        String[] biscoitoCalorico = grupo.lancheMaisCalorico(
                lanche.get(2), lanche.get(3)).split("/");
        
        
        System.out.printf("O lanche mais calorico é: \n"
                + "%s de %s \n",
                lancheCalorico[0],
                lancheCalorico[1]);
        
        System.out.println("");
        
        System.out.printf("O biscoito mais calorico é: \n"
                + "%s de %s \n",
                biscoitoCalorico[0],
                biscoitoCalorico[1]);
    }
}
