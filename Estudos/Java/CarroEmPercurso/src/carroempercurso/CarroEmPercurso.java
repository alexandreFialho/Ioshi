/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carroempercurso;

import java.util.Scanner;

/**listros
 *
 * @author fialho
 */
public class CarroEmPercurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a capacidade do tanque "
                + "e consumo de Km/litro do carro: ");
        Carro carro = new Carro(sc.nextDouble(),sc.nextDouble());
        
        while(true){
            if (carro.isTanqueCheio() != true){
                
                System.out.print("Quantos litros deseja abastecer ?\n"
                    + "digite 0 para sair\n"
                    + "Litros: ");
                double litros = sc.nextDouble();
                
                if (litros != 0 ){
                    carro.abastecer(litros);
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        
        while (true){
            if (carro.isTanqueVazio() != true){
                
                System.out.println("Digite quantos km o carro percorreu ?\n"
                    + "digite 0 para sair\n"
                    + "Km percorrido: ");
                
                double km = sc.nextDouble();
                
                if (km != 0){
                    carro.andar(km);
                }else {
                    break;
                }
                
                System.out.println(carro.getStatus());
            }else {
                break;
            }
        }
    }
}
