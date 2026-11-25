/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaoestrutura5;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoEstrutura5 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
        System.out.println("=====TABUADA=====");
        System.out.println("Informe o numero");
        int num = teclado.nextInt();
        System.out.println("INFORME O INICIO DA TABUADA");
        int inicio = teclado.nextInt();
        System.out.println("INFORME O FIM DA TABUADA");
        int fim = teclado.nextInt();
        
        //o i é uma costante que sempre muda, o X é a multiplicação e o = é o resultado
        for(int i=inicio; i<=fim; i++){
            System.out.println(num+" x "+i+ "="+num*i);
        }
    }
}
