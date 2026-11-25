/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura8 {

    public static void main(String[] args) {
       int idade;
       boolean formacao;
       int nota;
       
       Scanner teclado = new Scanner (System.in);
       System.out.println("====Informe sua idade====");
       idade=teclado.nextInt();
       
       System.out.println("====Informe sua formacao====");
       formacao=teclado.nextBoolean();
       
       System.out.println("====Iforme sua nota====");
       nota=teclado.nextInt();
       
       if ( idade >= 18 && formacao == true && nota >= 70 ){
           System.out.println("Aprovado");
           
       }else {
           System.out.println("Reprovado19");
       }
       
    }
}
