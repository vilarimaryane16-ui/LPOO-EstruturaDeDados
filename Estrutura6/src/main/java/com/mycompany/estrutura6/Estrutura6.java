/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura6 {

    public static void main(String[] args) {
        double altura;
        String sexo;
        double peso;
        
        Scanner teclado = new Scanner (System.in);
        
       
        System.out.println("Informe a Altura ");
        altura=teclado.nextDouble();
        
        teclado.nextLine();
        
        System.out.println("Informe o Sexo ");
        sexo=teclado.nextLine();
        
        if (sexo.equalsIgnoreCase("h")){
           peso=(72.7*altura)-58;                  
        }else{
            peso=(62.1*altura)-44.7;
        }
        
        System.out.println("Peso ideal "+peso); 
        
    }
}
