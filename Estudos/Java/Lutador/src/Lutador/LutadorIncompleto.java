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
public class LutadorIncompleto
        implements Jiujiteiro, Pugilista{

    @Override
    public String derrubar() {
        return "Lutador Derrubando";
    }

    @Override
    public String imobilizar() {
        return "Lutador Imobilizando";
    }

    @Override
    public String darSoco() {
        return "Lutador aplicando Soco";
    }
    
    public LutadorIncompleto(){
        System.out.printf("%s\n%s\n%s\n",
                derrubar(),
                imobilizar(),
                darSoco());
    }
}
