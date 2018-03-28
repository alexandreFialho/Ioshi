/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capivarabeijocas;

/**
 *
 * @author fialho
 */
public class CapivaraBeijos {

    String nome;
    int beijos, idade;

    public CapivaraBeijos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void beijar() {
        this.beijos += 1;
    }

    public void registrarVariosBeijos(int quantidade) {
        this.beijos += quantidade;
    }

    public String puxarCapivara() {
        String retorno = this.nome + " ";

        if (idade < 18) {
            if (idade >= 15) {
                if (this.beijos != 0) {
                    if (this.beijos > 1 && this.beijos <= 5) {
                        retorno += "é uma pessoa difícil \n";
                    } else {
                        retorno += "tem beijado bem.. cuidado com nenêm! \n";
                    }
                } else {
                    retorno += "ainda é BV. Preocupante para idade! \n";
                }
            } else if (this.beijos != 0) {
                if (this.beijos > 0 && this.beijos <= 5) {
                    retorno += "ainda é uma pessoa pura. \n";
                } else {
                    retorno += "já beijou muito para a idade! \n";
                }
            } else {
                retorno += "ainda é BV. Mas ok para a idade! \n";
            }
        } else if (this.beijos != 0) {
            if (this.beijos > 1 && this.beijos <= 5) {
                retorno += "é uma pessoa que não curte muito beijar. \n";
            } else {
                retorno += "beija muiiito! \n";
            }
        } else {
            retorno += "ainda é BV. Devemos convocar uma força tarefa! \n";
        }
        
        return retorno;
    }
}
