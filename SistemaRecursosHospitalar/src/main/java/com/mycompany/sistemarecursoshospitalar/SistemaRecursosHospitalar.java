/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemarecursoshospitalar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SistemaRecursosHospitalar {

    public static void main(String[] args) {
       Medico medico1 = new Medico ("Rodrigo Santoro", "4457658-55",20000.00, "485446/PR", 4000.00);
       
       Enfermeiro enfermeiro1 = new Enfermeiro ("Anabetty Silva", "5599763-55", 3500.00, "COREN-PR415875", 9);
       
       String opcao;
       
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Escolha uma das opcoes: ");
        System.out.println("Medico");
        System.out.println("Enfermeiro");
        System.out.println("Fechar");
        opcao=teclado.nextLine();
        
        switch (opcao){
            case "medico":{
                medico1.exibirFicha();
                break;
            }
            case "enfermeiro":{
                enfermeiro1.exibirFicha();
                break;
            }
            default:{
                System.out.println("Finalizamos !!!");
            }
        }
        
    }
    
    
}
