/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura5 {

    public static void main(String[] args) {
        double n1;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe um numero ");
        n1=teclado.nextDouble();
        if (n1%2==0){
            System.out.println("E Par");
        }else {
            System.out.println("E impar");
        }
              
        if (n1>=0){
            System.out.println("E Positivo");
        }else {
            System.out.println("E Negativo");
        }
        
    }
    
}
        
 

