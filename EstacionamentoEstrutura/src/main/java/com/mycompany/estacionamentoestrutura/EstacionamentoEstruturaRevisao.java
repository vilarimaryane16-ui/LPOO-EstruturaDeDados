/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estacionamentoestrutura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstacionamentoEstruturaRevisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        // COMPARAR INDICE DO FOR 
        String[] estacionamento = new String[4];
        int livre=0;
        
        for(int i=0;i<6;i++){
            System.out.println("==== ESTACIONAMENTO VAPT'VUPT ====");
            System.out.println("INFORME [1] PARA ESTACIONAR");
            System.out.println("INFORME [2] PARA RETIRAR CARRO");
            int opcao=teclado.nextInt();
            
            if (opcao==1){
                if(livre<4){
                    
                    System.out.println("INFORME A PLACA");
                    String placa=teclado.next();
                    estacionamento[livre]=placa;
                    System.out.println("CARRO ESTACIONADO "+estacionamento[livre]);
                    livre++;
                }else{
                    System.out.println("ESTACIONAMENTO CHEIO !!!");
                }
            }
            if(opcao==2){
                if(livre>0){
                    livre--;
                    System.out.println("RETIRANDO VEICULO "+estacionamento[livre]);
                }else{
                    System.out.println("ESTACIONAMENTO VAZIO ");
                }
            }
        }
        System.out.println("======================================");
    }    
}
