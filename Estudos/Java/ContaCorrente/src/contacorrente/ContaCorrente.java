/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fialho
 */
public class ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Conta> conta = new ArrayList<Conta>();
        
        conta.add(new Conta("Alexandre","0001-A","01",500.00));
        conta.add(new Conta("Jackson","0002-A","02",500.00));
        
        for (int i = 0; i < 2; i++) {
            switch (i){
                case 0:
                    conta.get(0).depositar(125.25);
                    conta.get(0).transferir("Conta de luz", 150.00);
                    conta.get(0).depositar(125.25);
                    conta.get(0).transferir("Subway", 30.00);
                    
                    break;
                case 1:
                    conta.get(1).depositar(35.50);
                    conta.get(1).transferir("Conta de água", 35.70);
                    conta.get(1).depositar(35.50);
                    conta.get(1).transferir("BK", 35.70);
                    break;
            }
        }
        
        for (int i = 0; i < 2; i++) {
            
            System.out.println(conta.get(i).recuperarExtrato()+"\n");
        }
    }
}
