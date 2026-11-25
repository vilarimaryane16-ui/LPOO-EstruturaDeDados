/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresdesafio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresDesafio1 {

    public static void main(String[] args) {
        // Criar Vetores
        int []vetor= new int [6];
        int []par= new int [6];
        int []impar= new int [6];
        int pares=0, impares=0; // Armazenador dos numeros Impares e Pares 
        
        Scanner teclado = new Scanner(System.in);
        // Preencher Vetor
        System.out.println("==== INFORME 6 VALORES ====");
        for(int i=0;i<6;i++){
            vetor[i]=teclado.nextInt();           
        }
        
        // Preencher/Verificar nos Vetores de Impar e Par os numeros Informados
        for(int a=0;a<6;a++){
            if(vetor[a]%2==0){
                par[pares]=vetor[a];
                pares++;
            }else{
                impar[impares]=vetor[a];
                impares++;
            }  
        }
        
         System.out.println("==== VETOR PARES ====");  
            for(int i=0; i<pares; i++){
            System.out.print(par[i]+", "); 
        }
            
           System.out.println(""); 
           
           System.out.println("==== VETOR IMPARES ====");
            for(int i=0; i<impares; i++){
            System.out.print(impar[i]+", "); 
        }  
    }
}
