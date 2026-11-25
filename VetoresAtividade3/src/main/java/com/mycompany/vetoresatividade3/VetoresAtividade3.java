/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[] numeros = new int [5];
        int [] resultados = new int [5];
        
        System.out.println("=== DIGITE 5 NUMEROS ===");
        for(int i=0;i<5;i++){
            System.out.println("DIGITE O NUMERO "); 
            numeros[i]=teclado.nextInt();
       }
        
        System.out.println("=== DIGITE O NUMERO MULTIPLICADOR ===");
        int multiplicador=teclado.nextInt();
        // Preencher Vetor Resultados com Valor Mult. * Vetor de posicao(numeros) [a];
        for(int a=0;a<5;a++){
            resultados[a]=multiplicador*numeros[a];            
        }
        // Mostrar Vetor Resultados;
        System.out.println("=== RESULTADO ===");
        for(int f=0;f<5;f++){
            System.out.print(resultados[f]+", ");
        }
    }
}
