/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaodesafio;

import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoDesafio1 {

    public static void main(String[] args) {
        int maior=0;
        int menor=1000;
        
       Scanner teclado = new Scanner (System.in);
        System.out.println("==== INFORME 5 NUMEROS ===="); 
       
        for(int i=1;i<=5;i++){
            System.out.println("INFORME O NUMERO: ");  
            int num = teclado.nextInt();
            
            if(num > maior){
                maior = num;
                
            }else {
              menor = num;
                
            }
        }
        System.out.println("Este numero e maior: "+maior);
        System.out.println("Este numero e menor: "+ menor);
    }

    
}
