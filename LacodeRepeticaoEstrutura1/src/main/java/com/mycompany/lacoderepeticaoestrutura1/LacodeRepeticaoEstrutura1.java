/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaoestrutura1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoEstrutura1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int par=0;
        int impar=0;
        
        for(int i=1;i<=3;i++){
            System.out.println("INFORME UM NUMERO: ");
            int num = teclado.nextInt();
            
            if(num%2==0){
                par++;
                System.out.println("ESTE NUMERO E PAR");
            }else{
                impar+=num;
                System.out.println("ESTE NUMERO E IMPAR ");
            }
        }
    }
}
