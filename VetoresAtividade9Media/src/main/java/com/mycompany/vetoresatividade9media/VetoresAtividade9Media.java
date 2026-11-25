/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade9media;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade9Media {

    public static void main(String[] args) {
        int [] vetor= new int[5];
        int soma=0, media=0;
        Scanner teclado= new Scanner (System.in);
        
        // Preencher Vetor
        System.out.println("==== INFORME 5 VALORES ====");
        for(int i=0;i<5;i++){
            vetor[i]=teclado.nextInt();
            
        }
        // Acumular ou seja Somar
        for(int k=0;k<5;k++){
            soma=soma+vetor[k];
        }
        // Calcular Média 
        media=soma/5;
        System.out.println("MEDIA "+media);
        System.out.println(" VALORES DO VETOR ACIMA DA MEDIA ");
        for(int j=0;j<5;j++){
            if(media<vetor[j]){
                System.out.println(vetor[j]+" ESTA ACIMA DA MEDIA NA POSICAO "+j);
            }
        }
    }
}
