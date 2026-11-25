/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedeaprendizagemswitch;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadedeAprendizagemSWITCH {

    public static void main(String[] args) {
      int opcao;
      double n1;
      double n2;
      double resultado;
      
      Scanner teclado = new Scanner (System.in);
        System.out.println("==== ESCOLHA UM DOS NUMEROS ABAIXO ! ====");
        System.out.println(" 1 - Media entre os 2 numeros digitados - ");
        System.out.println(" 2 - Diferenca entre os 2 numeros digitados - ");
        System.out.println(" 3 - Produtos entre os 2 numeros digitados - ");
        System.out.println(" 4 - Divisao feita do primeiro numero pelo segundo - ");
        
        opcao = teclado.nextInt();
        
        System.out.println("==== ESCOLHA O PRIMEIRO NUMERO ====");
        n1 = teclado.nextDouble();
        System.out.println("==== ESCOLHA O SEGUNDO NUMERO ====");
        n2 = teclado.nextDouble();
        
        
      switch(opcao){
          case 1: {
              resultado = (n1+n2)/2;
              System.out.println(" Sua media dos 2 numeros digitados e de " + resultado );
              break;
          }
          case 2: {
              resultado = n1 - n2 ;
              System.out.println(" A diferenca entre os 2 numeros digitados e de " + resultado );      
              break;
          }
          case 3: { 
              resultado = n1 * n2 ;
              System.out.println(" A multiplicacao entre os 2 numeros digitados e de " + resultado );
              break;
          }
          case 4: {
              resultado = n1 / n2 ;
              System.out.println(" A divisao feita do primeiro numero pelo segundo e de " + resultado );
              break;            
          }
          default:{
              System.out.println("  Foi isso ! :) ");
          }
          
      }
    
    }
}
