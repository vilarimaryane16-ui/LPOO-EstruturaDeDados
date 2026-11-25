/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturalanchonete;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstruturaLanchonete {

    public static void main(String[] args) {
        int opcao;
        int quantidade;
        double valorPago;
        
            Scanner teclado = new Scanner (System.in);
            
                System.out.println("==== CARDAPIO DA LANCHONETE ====");
                System.out.println("--- 100 -CACHORRO QUENTE- R$ 1,70");
                System.out.println("--- 101 -BAURU SIMPLES- R$ 2,30");
                System.out.println("--- 102 -BAURU COM OVO- R$ 2,60");
                System.out.println("--- 103 -HAMBURGUER- R$ 2,40");
                System.out.println("--- 104 -CHEESEBURGUER- R$ 2,50");
                System.out.println("--- 105 -REFRIGERANTE- R$ 1,00");
                opcao = teclado.nextInt();
                
                System.out.println("quantas Unidades?");
                quantidade = teclado.nextInt();
                
                switch(opcao){
                    case 100 :{
                        valorPago= quantidade*1.70;
                        System.out.println("Quantas Unidades? " +quantidade +" valorTotal "+ valorPago);
                        break;
                    } 
                    case 101 :{
                        valorPago= quantidade*2.30;
                        System.out.println("Quantas Unidades? " +quantidade + " valorTotal "+ valorPago); 
                        break;
                    }       
                    case 102 :{
                        valorPago= quantidade*2.60;
                        System.out.println("Quantas Unidades? " +quantidade + " valorTotal "+ valorPago);
                        break;
                    }
                    case 103 :{
                        valorPago= quantidade*2.40;
                        System.out.println("Quantas Unidades? " +quantidade + " valorTotal "+ valorPago);
                        break;
                                         
                    }
                    case 104 :{
                        valorPago= quantidade*2.50;
                        System.out.println("Quantas Unidades? " +quantidade + " valorTotal "+ valorPago); 
                        break;
                    }
                    case 105 :{
                        valorPago= quantidade*1.00;
                        System.out.println("Quantas Unidades? " +quantidade + " valorTotal "+ valorPago);
                        break;
                    }
                    default :{
                        System.out.println("Volte Sempre !!!");
                    }
                }
    }
}
