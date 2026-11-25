/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaodesafio3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoDesafio3 {

    public static void main(String[] args) {
        Scanner teclado = new  Scanner (System.in);
        double media=0;
        int par=0;
        int somaPar=0;
        int impar=0;
        int somaImpar=0;
        
        for(int i=1;i<=6;i++){
          
            System.out.println("==== INFORME UM NUMERO ====");
            int num =teclado.nextInt();
            
            if(num%2==0){
                par++;
                somaPar=num;
                System.out.println("Este numero e par");
            }else{
                somaImpar+=num;
                System.out.println("Este numero e impar");
            }
        }
        media=somaPar/par;
        System.out.println("Esta e a media dos numeros Pares: "+media);
        System.out.println("Esta e a media dos numeros Impares: "+somaImpar);
    }
}
