/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UrnaMitica;

import java.util.Scanner;

/**
 *
 * @author fialho
 */
public class Exe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        Urna eleicao = new Urna("Alexandre", "Jackson");
        
        for (int i = 0; i < 7; i++) {
            System.out.printf("%sº Voto: ",i+1);
            eleicao.votar(sc.nextInt());
        }
        
        System.out.println("");
        
        System.out.println(eleicao.resultado());
    }
}
