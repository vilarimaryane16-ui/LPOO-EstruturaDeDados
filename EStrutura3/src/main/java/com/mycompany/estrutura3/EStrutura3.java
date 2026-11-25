/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura3;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EStrutura3 {

    public static void main(String[] args) {
        float a;
        float b;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor de A");
        a=teclado.nextFloat();
        System.out.println("Informe o valor de B");
        b=teclado.nextFloat();
        if (a%b==0 || b%a==0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }
    }
}
