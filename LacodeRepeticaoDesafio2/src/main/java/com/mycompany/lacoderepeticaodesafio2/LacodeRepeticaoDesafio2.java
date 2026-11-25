/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaodesafio2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoDesafio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("==== INFORME 1 NUMERO ====");
        int n1 = teclado.nextInt();
        System.out.println("==== INFORME MAIS 1 NUMERO ====");
        int n2 = teclado.nextInt();
        int soma=0;
       
       for(int i=n1;i>=1;i--){
           soma+=n2;
       }
        System.out.println("O resultado e igual a: "+soma);
    }       
}

