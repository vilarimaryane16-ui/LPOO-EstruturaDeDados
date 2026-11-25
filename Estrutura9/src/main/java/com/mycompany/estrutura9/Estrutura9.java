/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura9;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estrutura9 {

    public static void main(String[] args) {
        double compra;
        boolean clienteVip;
        double desconto;
        double valorFinal;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Valor da compra");
        compra=teclado.nextDouble();
        
        System.out.println("clienteVip");
        clienteVip=teclado.nextBoolean();
        
        if ( compra >= 200 || clienteVip == true ){
            System.out.println("Desconto concedido");
          desconto=compra*50/100;
            System.out.println("Desconto"+desconto);
            valorFinal=compra-desconto;
            System.out.println("Valor final"+valorFinal);
        } else {
            System.out.println("Desconto recusado");
        } 
        }
        
        
     }


 