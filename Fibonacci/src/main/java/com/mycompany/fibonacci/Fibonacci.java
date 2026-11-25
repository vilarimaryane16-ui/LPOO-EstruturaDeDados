/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author Aluno
 */
public class Fibonacci {

    public static void main(String[] args) {
        int anterior=1;
        int proximo=1;
        int fibonacci=0;
                
        System.out.println("===== SEQUENCIA DE FIBONACCI =====");
        System.out.print("F1 "+anterior+", ");
        System.out.print("F2 "+proximo+", ");
        
        for(int i=3;i<=15;i++){
            fibonacci=anterior+proximo;
            System.out.print("F"+i+" "+fibonacci+", ");
            anterior=proximo;
            proximo=fibonacci;
            
        }
    }
}
