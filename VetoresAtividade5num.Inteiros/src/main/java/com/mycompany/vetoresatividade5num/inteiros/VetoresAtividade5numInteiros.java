/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade5num.inteiros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade5numInteiros {

    public static void main(String[] args) {
        int [] vetor = new int [7];
        int valor;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("==== INFORME 7 VALORES ====");
        for (int i=0;i<7;i++){
            valor=teclado.nextInt();
            if(valor>0){
                vetor[i]=valor;
            }else{
                vetor[i]=0;
            }
        }
        for (int k=0;k<7;k++){
            System.out.print(vetor[k]+", ");
        }
    }
}
