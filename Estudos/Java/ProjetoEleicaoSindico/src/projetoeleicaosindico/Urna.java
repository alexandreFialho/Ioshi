package projetoeleicaosindico;

import java.util.ArrayList;
import java.util.List;

public class Urna {
   private List<Candidato> candidatos = new ArrayList<>();
   private List<Candidato> vencedores = new ArrayList<>();
   private Candidato vencedor1;
   private int votosBranco = 0;
   private int votosNulo = 0;
   private int quantidadeEleitores = 0;
   private int votosComputados = 0;
   

   //construtor Urna
    public Urna(int quantidadeEleitores) {
        this.quantidadeEleitores = quantidadeEleitores;
    }
    
    public void registrarCandidato(String nome){
        Candidato novoCandidato = new Candidato(nome);
        this.candidatos.add(novoCandidato); //adiciona na lista o candidato
    }
    
    public void registrarVoto(int voto){
        // se nao pode mais votar, não registra nenhum voto
        if (!this.aindaPodeVotar()){
            return; // sai do método
        }
        
        this.votosComputados++; // contador de votos
        
        if (voto == 0){
            this.votosBranco++;
            return; // se votar em branco eu já saio do método
        }
        
        // se o voto for menor que zero ou for maior que o número de candidatos o voto é nulo e eu já saio do método
        if (voto < 0 || voto > candidatos.size()){
            this.votosNulo++;
            return; // sai do método
        }
        
        // o usuário vai votar a partir do 1
        voto = voto-1; 
        // recuperando o candidato da lista
        Candidato candidatoVotado = this.candidatos.get(voto);
        // registrando o voto no candidato
        candidatoVotado.registrarVoto();
        
    }
    
    public boolean aindaPodeVotar(){
        // vai retornar TRUE quando o quantidade de eleitores for maior
        // que os votos computados, se não ele retorna FALSE
        return this.quantidadeEleitores > this.votosComputados;
    }
    
    public String getResultado(){
        String resultado = "Resultado: \n";
       
        for (Candidato candidato : this.candidatos) {
            resultado += candidato.getNome()+": "
                    +candidato.getVotos()+"\n";
        }
        
        resultado += "Branco: "+this.votosBranco+"\n";
        resultado += "Nulo: "+this.votosNulo+"\n";
        getVencedor();
        if (vencedores.size() != 1){
            resultado += "Empate entre :"+vencedores.get(0).getNome();
            for (int i = 1; i < vencedores.size(); i++) {
                resultado += " e "+vencedores.get(i).getNome();
            }
        }else {
            resultado += "Vencedor: "+vencedores.get(0).getNome();
        }
        
       
        return resultado;
    }
    
    public void getVencedor(){
        Candidato vencedor = this.candidatos.get(0);
        int maior = 0;
        
        for (Candidato candidato : candidatos) {
            if (candidato.getVotos() != maior){
                if (candidato.getVotos() > maior){
                    vencedor = candidato;
                    maior = candidato.getVotos();
                    vencedores.clear();
                    vencedores.add(vencedor);
                }
            }else {
                vencedores.add(candidato);
            }
        }
        
        
    }
}
