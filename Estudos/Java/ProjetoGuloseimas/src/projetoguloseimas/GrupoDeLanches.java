/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoguloseimas;

import com.sun.xml.internal.ws.util.StringUtils;
import sun.invoke.empty.Empty;

/**
 *
 * @author fialho
 */
public class GrupoDeLanches {
    
    
    public String lancheMaisCalorico(Lanche l1, Lanche l2){
        
        if (l1 != null && l2 != null){
            if (l1.getCaloriasPorUnidade() > l2.getCaloriasPorUnidade()){
                
                return l1.getTipo() != null ? 
                        l1.getTipo()+"/"+l1.getSabor() :
                        "Lanche1/"+l1.getSabor();
            }
            return l2.getTipo() != null ?
                    l2.getTipo()+"/"+l2.getSabor() :
                    "Lanche2/"+l2.getSabor();
        }else {
            if (l1 != null){
                return l1.getTipo() != null ? 
                        l1.getTipo()+"/"+l1.getSabor() :
                        "Lanche1/"+l1.getSabor();
            }
            
            return l2.getTipo() != null ? 
                    l2.getTipo()+"/"+l2.getSabor() :
                    "Lanche2/"+l2.getSabor();
        }
    }
}
