/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int[] numeros = new int[10];       
        
        // Preenher Vetor
        System.out.println("=== Digite 10 numeros ===");
        for(int i=0;i<9;i++){
        System.out.println("== Digite o Numero ==");
        numeros[i]= teclado.nextInt(); 
        
        // Verificar se é Par
        if(numeros[i]%2==0){
        System.out.println(numeros[i]+" e Par "); 
        
        }else{
            System.out.println(numeros[i]+" e Impar ");  
        }          
    }
}

}
