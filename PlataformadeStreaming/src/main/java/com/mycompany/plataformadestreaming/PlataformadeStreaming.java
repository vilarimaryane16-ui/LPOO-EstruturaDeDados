/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.plataformadestreaming;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PlataformadeStreaming {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("===== STREAMPLAY =====");
        System.out.println("INFORME O TIPO DE CONTA");
        System.out.println("[PADRAO] | [PREMIUM]");
        String tipo =teclado.nextLine();
        
      switch(tipo.toLowerCase()){
          case "padrao":{
                System.out.println("===== CADASTRO DA CONTA PADRAO =====");
                System.out.println("INFORME SEU NOME ");
                String nome =teclado.nextLine();
                System.out.println("INFORME SEU EMAIL");
                String email =teclado.nextLine();
                System.out.println("INFORME A QUANTIDADE DE TELAS QUE VAI ATIVAR");
                int telas = teclado.nextInt();
                                         
                PlanoPadrao streaming = new PlanoPadrao(nome, email, telas);
                streaming.configurarPlano();
                streaming.exibirFichaConta();
               
                break;
            }    
          default:{
              System.out.println("TENTE NOVAMENTE...!!!");
              break;
            }
        }
      switch(tipo.toLowerCase()){
          case "premium":{
              System.out.println("===== CADASTRO DA CONTA PREMIUM =====");
              System.out.println("INFORME SEU NOME ");
              String nome =teclado.nextLine();
              System.out.println("INFORME SEU EMAIL");
              String email = teclado.nextLine();
              System.out.println("INFORME A QUANTIDADADE DE TELAS QUE VAI ATIVAR");
              int telas =teclado.nextInt();
              
              
              PlanoPremium streaming = new PlanoPremium(nome, email, email);
              streaming.configurarPlano();
              streaming.exibirFichaConta();
            }
        }
    }
}

