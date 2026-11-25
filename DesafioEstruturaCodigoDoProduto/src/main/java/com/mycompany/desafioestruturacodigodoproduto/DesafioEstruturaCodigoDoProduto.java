/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafioestruturacodigodoproduto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DesafioEstruturaCodigoDoProduto {

    public static void main(String[] args) {
         int codigo;
        System.out.println("==== DIGITE UM NUMERO DE 1 A 15 ====");
        Scanner teclado = new Scanner (System.in);
        codigo = teclado.nextInt();
        
        switch (codigo) {
            case 1:{
                System.out.println(" - Alimento nao-perecivel - ");
                break;
            } 
            case 2:
            case 3:
            case 4:{
                System.out.println(" - Alimento perecivel - ");
                break;
            } 
            case 5:
            case 6:{
                System.out.println(" - Vestuario - ");
                break;
            }    
            case 7:{
                System.out.println(" - Higiene pessoal - ");
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                System.out.println(" - Limpeza e Utensilios Domesticos - ");
                break;
            }
            default :{
                System.out.println(" Codigo Invalido :( ");
            }
        }
   }      
}
