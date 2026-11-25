/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vendasestacionamentorevisao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VendasEstacionamentoRevisao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double[]vendas = new double[7];
        int caiu=0;
        
        for(int i=0;i<7;i++){
            System.out.println("==== BRIQUE-BRAQUE ====");
            System.out.println("DIA "+(i+1)+", INFORME O VALOR R$");
            vendas[i]=teclado.nextDouble();
        }
        for(int i=1;i<7;i++){
            if(vendas[i]<vendas[i-1]){
                caiu++;
            }
        }
        System.out.println("VENDAS CAIRAM "+ caiu +" VEZES ESTA SEMANA");
    }
}
