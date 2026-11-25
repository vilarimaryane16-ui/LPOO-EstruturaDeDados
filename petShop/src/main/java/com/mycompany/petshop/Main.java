/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petshop;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
       
    Cachorro Bolinha = new Cachorro("Bolinha", "Aryane", 150, "htdf254", 60.00);
            
    Gato Chaninho = new Gato("Chaninho", "Maria Rita", 100.00, "wgsr587", 4);
    
    Scanner teclado = new Scanner(System.in);
        System.out.println("==== PETSHOP ANIMAL ====");
        System.out.println("Escolha o Animal");
        System.out.println("[GATO] | [CACHORRO]");
        String opcao =teclado.nextLine();
        
        switch(opcao.toLowerCase()){
            case "gato" : {
                Chaninho.exibirInformacoes();
                break;
        }
            case "cachorro" : {
               Bolinha.exibirInformacoes(); 
               break;
        }
            default : {
                System.out.println("HORA DE DAR TCHAU... BJJS VOLTE SEMPRE !!!");
                break;
            }
                
      }            
                       
                           
    } 
}