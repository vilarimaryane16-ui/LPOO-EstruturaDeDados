/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura7;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura7 {

    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        
       Scanner teclado = new Scanner(System.in);
       System.out.println("====Informe o primeiro numero====");
       n1=teclado.nextInt();
       
       System.out.println("====Informe o segundo numero====");
       n2=teclado.nextInt();
       
       System.out.println("====Iforme o teceiro numero====");
       n3=teclado.nextInt();
       
       if (n1 >= n2 && n1>= n3){
           System.out.println("Numero maior "+n1);
           
       } else if ( n2 >= n1 && n2 >= n3){
           System.out.println("Numero maior "+n2);
           
       } else {
           System.out.println("Numero maior "+n3);
       }
     
        
         
        
        
    }
}
