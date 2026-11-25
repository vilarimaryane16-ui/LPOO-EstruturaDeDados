/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade6soma;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade6Soma {

    public static void main(String[] args) {
        int []vetor = new int [4];
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==== INFORME 4 VALORES ====");
        for (int i=0;i<4;i++){
            vetor[i]=teclado.nextInt();
        }
        // Preencher Acumulador 
        int soma=0;
        for(int k=0;k<4;k++){
            soma=soma+vetor[k];
        }
        // Mostrar Valor Acumulado;
        System.out.println("VALOR ACUMULADO "+soma);
    }
}
