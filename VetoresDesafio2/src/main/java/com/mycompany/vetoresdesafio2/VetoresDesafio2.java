/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresdesafio2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresDesafio2 {

    public static void main(String[] args) {
       String []gabarito= {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
       String []prova= new String[10];
       int acertos=0;
       
       Scanner teclado= new Scanner(System.in);   
       System.out.println("====== INFORME SUA RESPOSTA(A,B,C,D,E) ======"); 
       for(int i=0;i<10;i++){
        System.out.println("PARA A QUESTAO "+(i+1));
        prova[i]=teclado.nextLine();
        // .equalsIgnoreCase é o Operador Logico pronto de String que Verifica se a resposta da prova foi igual do gabarito
        // .equalsIgnoreCase é o verificador de Igualdade para STRING, como o == para Int e Double 
        if (prova[i].equalsIgnoreCase(gabarito[i])){
            System.out.println("RESPOSTA CORRETA");
            acertos++;
        }else{
            System.out.println("SUA RESPOSTA: "+prova[i]+", RESPOSTA GABARITO: "+gabarito[i]);
            System.out.println("RESPOSTA ERRADA");
        }
        
           System.out.println("=== TOTAL DE ACERTOS: "+acertos+" ===");
    }
       
      
        
    }  
}
