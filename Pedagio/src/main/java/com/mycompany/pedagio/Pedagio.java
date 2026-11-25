/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedagio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Pedagio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("===== PEDAGIOS CAMINHOS DO SUL =====");
        System.out.println("INFORME O TIPO DE VEICULO");
        System.out.println("[CAMINHAO] | [CARRO]");
        String tipo =teclado.nextLine();
        
        switch(tipo.toLowerCase()){
            case "caminhao":{
                System.out.println("===== CADASTRO DO CAMINHAO =====");
                System.out.println("INFORME A PLACA");
                String placa =teclado.nextLine();
                System.out.println("INFORME A QUANTIDADE DE EIXOS");
                int eixos =teclado.nextInt();
                teclado.nextLine();
                System.out.println("INFORME O NOME DA TRANSPORTADORA");
                String transportadora = teclado.nextLine();
                
                Caminhao mercedez = new Caminhao(placa, eixos, transportadora);
                mercedez.emitirComprovante();
                
                }
        }
        switch(tipo.toLowerCase()){
            case "carro":{
                System.out.println("===== CADASTRO DO CARRO =====");
                System.out.println("INFORME A PLACA");
                String placa =teclado.nextLine();
                System.out.println("INFORME A QUANTIDADE DE EIXOS");
                int eixos =teclado.nextInt();
                teclado.nextLine();
                System.out.println("INFORME O TIPO DO SELO ECOLOGICO");
                String selo =teclado.nextLine();
                
                CarroEletrico dodge = new CarroEletrico(placa, eixos, selo);
                dodge.emitirComprovante();
            }
        }
    }
}
