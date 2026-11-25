/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade8 {

    public static void main(String[] args) {
        int[] vetor = {10,20,30,40,10,60};
        boolean encontrei;
        int valor;
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("==== INFORME 6 VALORES ====");
        for (int i=0;i<6;i++){
            encontrei=false;
            System.out.println("=== INFORME O VALOR ===");
            valor=teclado.nextInt();
            
            // PERCORRER O VETOR PARA VERIFICAR SE ELA ESTA LÁ;
            for(int j=0;j<6;j++){
                if(valor==vetor[j]){
                    System.out.println(" VALOR ENCONTRADO ");
                    System.out.println(valor+" na posicao "+j);
                    encontrei=true;
                }
            }
            // ! É IGUAL A FALSE , PARA DEIXAR O CODIGO BONITO;
            // OUTRA FORMA DE ESCREVER A MESMA COISA: if(encontrei==false){ 
            if(!encontrei){
                System.out.println(" VALOR NAO ENCONTRADO ");
            }
        }
    }
}
