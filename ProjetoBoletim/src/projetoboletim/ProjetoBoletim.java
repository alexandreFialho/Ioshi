/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoboletim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author afaraujo
 */
public class ProjetoBoletim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Boletim> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            
            System.out.printf("Digite o nome do %sº Aluno \n"
                    + "Nome: ",i+1);
            alunos.add(new Boletim(sc.nextLine().trim()));
            System.out.println("");
            
            System.out.printf("Digite suas duas notas %s \n"
                    + "Separando por espaços \n"
                    + "Notas: ",alunos.get(i).getNomeAluno());
            String[] notas = sc.nextLine().trim().split(" ");
            
            alunos.get(i).calcularResultado(
                    Double.parseDouble(notas[0].replace(',' , '.')), 
                    Double.parseDouble(notas[1].replace(',' , '.')));
            
            System.out.println("");
        }
        
        for (Boletim aluno : alunos){
            System.out.println("");
            if("Aprovado".equals(aluno.getResultado())){
                System.out.printf("O resultado do aluno(a) %s foi \n"
                        + "Aprovado! Parabéns \n", aluno.getNomeAluno());
            }else {
                System.out.printf("O resultado do aluno(a) %s foi \n"
                    + "Reprovado! Estude mais na próxima \n", aluno.getNomeAluno());
            }
        }
    }
}
