/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaodesafio4fatorial;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoDesafio4Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("==== FATORIAL ====");
        System.out.println("INFORME O NUMERO: ");
        int num = teclado.nextInt();
        
        int fatorial = num;
        int anterior = num-1;       
                
        for(int i=num;i>1;i--){
            fatorial=fatorial*anterior;
            anterior=anterior-1;//está diminuido 1, funciona escrito assim tbm : anterior--;
        }
        System.out.println(num+"! = "+fatorial);
    }
}
