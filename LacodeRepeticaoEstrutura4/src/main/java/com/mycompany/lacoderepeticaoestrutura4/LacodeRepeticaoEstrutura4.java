/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lacoderepeticaoestrutura4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class LacodeRepeticaoEstrutura4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int soma=0;
        
        for(int i=1;i<=6;i++){
            System.out.println("INFORME NUMERO ");
            int num =teclado.nextInt();
            soma+=num;
            System.out.println("Esta e a soma dos numeros indicados: "+soma);
        }
    }
}
