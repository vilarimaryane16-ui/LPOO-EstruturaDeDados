/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=====TABUADA=====");
        System.out.println("Informe o numero");
        int num = teclado.nextInt();
        
        //o i é uma costante que sempre muda, o X é a multiplicação e o = é o resultado
        for(int i=0; i<=10; i++){
            System.out.println(num+" x "+i+ "="+num*i);
        }
            
        
    }
}
