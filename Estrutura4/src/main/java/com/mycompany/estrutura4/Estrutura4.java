package com.mycompany.estrutura4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura4 {

    public static void main(String[] args) {
        double n1;
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor");
        n1=teclado.nextDouble();
        if (n1%5==0) {
        System.out.println("E divisivel por 5");
    }else{
            System.out.println("Nao e divisivel por 5");
        }
        
    }
}
