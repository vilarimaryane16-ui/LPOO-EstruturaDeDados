/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade2 {

    public static void main(String[] args) {
       double n1;
       double n2;
       double n3;
       double media;
       
       Scanner teclado1 = new Scanner(System.in);
       Scanner teclado2 = new Scanner(System.in);
       Scanner teclado3 = new Scanner(System.in);
       System.out.println("====INFORME NOTA 1====");
       n1=teclado1.nextDouble();
       System.out.println("====INFORME NOTA 2====");
       n2=teclado2.nextDouble();
       System.out.println("====INFORME NOTA 3====");
       n3=teclado3.nextDouble();
       
       media=(n1+n2+n3)/3;
       System.out.println("====MEDIA DO ALUNO===="+media);
       if (media>=6.0){
           System.out.println("Aprovado");
       }else if (media>=5 && media <=5.9){
           System.out.println("Exame");
       }else {
           System.out.println("Reprovado");
       }
    }
}
