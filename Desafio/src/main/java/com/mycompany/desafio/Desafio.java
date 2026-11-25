/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio {

    public static void main(String[] args) {
        //Inicializando o leitor do teclado
        Scanner teclado = new Scanner (System.in);
        
        //Define o saldo inicial fixo do cliente
        double saldo = 100.00 ;
        double deposito;
        double saque;
        
        
        //Exibe o menu na tela com as opçoes 
        System.out.println("====BANCO DA ESCOLA====");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Realizar Deposito");
        System.out.println("3 - Realizar Saldo");
        System.out.println("Escolha a operacao desejada: ");
        int opcao =teclado.nextInt();
 
        
        //Estrutura de decisao encadeada com if / else if / else 
        if (opcao == 1 ){
            //Opçao 1: Apenas mostra o saldo
            System.out.println("Seu saldo atual e: R$ " + saldo);
            
        }else if ( opcao == 2 ){
            //Opçao 2: Pede o valor do deposito e atualiza o saldo
            System.out.println("Digite o valor que deseja depositar: R$ ");
            deposito =teclado.nextDouble();
            saldo= saldo + deposito;
            System.out.println("Saldo atual: "+ saldo);
            
            System.out.println(" Digite o valor que deseja depositar: " + saldo);
        } else if ( opcao == 3) {
            //Opçao 3: Pede o valor do saque e valida as condiçoes
            System.out.println("Digite o valor que deseja sacar: R$ ");
            saque=teclado.nextDouble();
            
           
            //Nova checagem interna para nao deixar o saldo ficar negativo
            if ( saque <= saldo) { 
              saldo= saldo - saque; 
              System.out.println("Saque realizado com sucesso! Retire seu dinheiro.");
              System.out.println("Saldo restante: R$ " + saldo);
         
        } else { 
            System.out.println("Operaçao cancelada: Saldo insuficiente!");
        } 
            
        } else {
        //Opçao invalida: Se digitar qualquer numero que nao seja 1, 2 ou 3 
            System.out.println("Erro: Opçao invalida! Escolha 1, 2 ou 3.");
    }
    
    //Fecha o teclado
    teclado.close();
}

}


  





