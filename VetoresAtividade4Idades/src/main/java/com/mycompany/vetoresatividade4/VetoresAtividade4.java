/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade4 {

    public static void main(String[] args) {
        // Vetor Idade de 10 posicoes 
        int []idades = new int [10];
        Scanner teclado = new Scanner (System.in);
        
        // Preencher Vetor
        System.out.println("=== INFORME 10 VALORES ===");
        for (int i=0;i<10;i++){
            idades[i]=teclado.nextInt();
        }
        for (int k=9;k>=0;k--){
        System.out.print(idades[k]+", ");
        }
           
    }
}
