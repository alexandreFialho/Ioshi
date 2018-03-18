/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UrnaMitica;

/**
 *
 * @author fialho
 */
public class Urna {
    private int votosCandidato1, votosCandidato2, votosBranco, votosNulo,
            totalVotos;
    
    private String nomeCandidato1, nomeCandidato2;
    
    public Urna(String nomeCandidato1, String nomeCandidato2){
        this.nomeCandidato1 = nomeCandidato1;
        this.nomeCandidato2 = nomeCandidato2;
    }
    
    public void votar(int voto){
        if (voto != 0){
            if (voto != 1){
                if (voto != 2){
                    this.votosNulo += 1;
                }else {
                    this.votosCandidato2 +=1;
                }
            }else {
                this.votosCandidato1 += 1;
            }
        }else {
            this.votosBranco += 1;
        }
        
        this.totalVotos += 1;
    }
    
    private String vencedorEleicao(){
        
        if (votosCandidato1 != votosCandidato2){
            return votosCandidato1 < votosCandidato2 ?
                "Candidato "+nomeCandidato2+
                " venceu a eleição" :
                "Candidato "+nomeCandidato1+" venceu a eleição" ;
        }
        
        return "Haverá 2º turno";
    }
    
    public String resultado(){
        String resultado;
        
        resultado = "== Resultado das eleições míticas == \n";
        resultado += "Total de votos: "+this.totalVotos+"\n";
        resultado += "Votos em branco: "+this.votosBranco+"\n";
        resultado += "Votos nulos: "+this.votosNulo+"\n";
        resultado += "Votos no "+this.nomeCandidato1+": "+this.votosCandidato1+"\n";
        resultado += "Votos no "+this.nomeCandidato2+": "+this.votosCandidato2+"\n";
        resultado += "Resultado da eleição: "+this.vencedorEleicao();
        
        return resultado;
    }
}
