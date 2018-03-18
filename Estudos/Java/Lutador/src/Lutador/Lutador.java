/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lutador;

/**
 *
 * @author fialho
 */
public class Lutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LutadorCompleto lutadorCompleto;
        LutadorIncompleto lutadorIncompleto;
        
        System.out.println("== Lutador completo ==");
        lutadorCompleto = new LutadorCompleto();
        
        System.out.println("");
        
        System.out.println("== Lutador incompleto ==");
        lutadorIncompleto = new LutadorIncompleto();
        
    }
}

