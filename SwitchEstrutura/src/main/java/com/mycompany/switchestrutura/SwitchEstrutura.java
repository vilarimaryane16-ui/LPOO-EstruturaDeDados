/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchestrutura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SwitchEstrutura {

    public static void main(String[] args) {
       int opcao;
       
        Scanner teclado = new Scanner (System.in);
        
            System.out.println("====ESCOLHA UMA OPCAO====");
            System.out.println("--- 1 PARA CADASTRAR ALUNO ---");
            System.out.println("--- 2 PARA LISTAR ALUNO ---");
            System.out.println("--- 3 PARA PESQUISAR ALUNO ---");
            System.out.println("---QUALQUER OUTRO VALOR PARA SAIR ---");
            opcao = teclado.nextInt();
            
            switch(opcao){
                case 1 :{
                    System.out.println("CADASTRO REALIZADO COM SUCESSO!");
                    break;
                }
                case 2 : {
                    System.out.println("LISTANDO ALUNOS ...!");
                    break;
                }
                case 3 :{
                    System.out.println("PESQUISANDO ALUNOS ...!");
                    break;
                }
                default: {
                    System.out.println("ATÉ A PROXIMA!");
                }
            }
    }
}
