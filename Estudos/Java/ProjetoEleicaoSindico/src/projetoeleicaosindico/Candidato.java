package projetoeleicaosindico;

public class Candidato {
    
    private String nome;
    private int votos = 0;

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public Candidato(String nome) {
        this.nome = nome.trim();
    }
    
    public void registrarVoto(){
        this.votos += 1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
   
}
