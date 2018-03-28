package projetoeleicaosindico;

import java.util.Scanner;

public class ProjetoEleicaoSindico {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos eleitores?");
        int numero = sc.nextInt();
        Urna urna = new Urna(numero);
        
        for(int i = numero; i > 0; i--){
            Scanner scLeitor = new Scanner(System.in);
            System.out.println("Nome do candidato (vazio /p sair)");
            String nome = scLeitor.nextLine();
            
            if (nome.equals("")) {
                break; // sai do while
            }
            urna.registrarCandidato(nome);        

        }
        
        System.out.println("");
        
        while (urna.aindaPodeVotar()){
            System.out.println("Vote: ");
            urna.registrarVoto(sc.nextInt());
        }
        
        System.out.println(urna.getResultado());
    }
}