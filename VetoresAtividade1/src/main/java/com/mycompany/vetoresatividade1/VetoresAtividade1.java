/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoresatividade1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VetoresAtividade1 {

    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        int n1, n2, n3;
       
        System.out.println("=== Digite 3 numeros ===");
        n1=teclado.nextInt();
        n2=teclado.nextInt();
        n3=teclado.nextInt();
       
        System.out.println("Este sao os numeros anterior em ordem Inversa " +n3+ " " +n2+ " " +n1);
    }
}
