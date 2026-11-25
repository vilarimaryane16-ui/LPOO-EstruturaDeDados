/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaoestrutura3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoEstrutura3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double media=0;
        int par=0;
        int somaImpar=0;
        int somaPar=0;
        
        for(int i=1; i<=5;i++){
            System.out.println("INFORME O NUMERO: ");
            int num = teclado.nextInt();
                     
            if(num%2==0){// se o resto da divisão for zero número Par
                par++;
                somaPar+=num;
            }else{//senão é impar
                somaImpar+=num;
            }
        }        
        media=somaPar/par;
        System.out.println("MEDIA DOS NUMEROS PARES: "+media);
        System.out.println("SOMA DOS NUMEROS IMPARES: "+somaImpar);
    }
}
