/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadesdeaprendizagem;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atividade1 {

    public static void main(String[] args) {
        double n1=2;
        double n2=4;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("====INFORME A INFORMACAO====");
        System.out.println("====PARA SOMAR INFORME + ====");
        System.out.println("====PARA SUBTRAIR INFORME - ====");      
        System.out.println("====PARA DIVIDIR INFORME / ====");         
        System.out.println("====PARA MULTIPLICAR INFORME * ====");
        String operacao=teclado.nextLine();
                
        if(operacao.equals("+")){
            resultado=n1+n2;
            System.out.println("soma dos valores: "+resultado);
        }else if (operacao.equals("-")){
            resultado=n1-n2;
            System.out.println("subtracao dos valores: "+resultado);
        }else if (operacao.equals("/")){
            resultado=n1/n2;
            System.out.println("divisao dos valores: "+resultado);
        }else{
            resultado=n1*n2;
            System.out.println("multiplicacao dos resultados"+resultado);
        }
        
    }
}
