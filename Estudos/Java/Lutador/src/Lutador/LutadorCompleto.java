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
class LutadorCompleto 
        implements Pugilista, Jiujiteiro, Capoeirista, KickBoxer {

    @Override
    public String darSoco() {
        return "Lutador aplicando Soco";
    }

    @Override
    public String derrubar() {
        return "Lutador Derrubando";
    }

    @Override
    public String imobilizar() {
        return "Lutador Imobilizando";
    }

    @Override
    public String darChuteGiratorio() {
        return "Lutador aplicando Chute Giratorio";
    }

    @Override
    public String darJoelhada() {
        return "Lutador aplicando Joelhada";
    }
    
    public LutadorCompleto(){
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",
                darSoco(),
                derrubar(),
                imobilizar(),
                darChuteGiratorio(),
                darJoelhada());
    }
}