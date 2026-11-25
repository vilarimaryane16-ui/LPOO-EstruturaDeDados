/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiointerfacedificil;

/**
 *
 * @author Aluno
 */
public class Pedido implements Desconto, Entrega{
    double valorProdutos;

    // Encapsulamento
    public double getValorProdutos() {
        return valorProdutos;
    }
    
    // Metodo Abstract 
    @Override
    public double aplicarDesconto(double valorOriginal, String cupom) {
        // VALIDAR CUPOM NA INTERFACE DESCONTO
        if(Desconto.validarCupom(cupom)==true){
            System.out.println("======= CUPOM VALIDADO =======");
            System.out.println("VALOR ORIGINAL R$ "+valorOriginal);
            double desc = valorOriginal*0.1;
            System.out.println("VALOR COM DESCONTO R$ "+desc);
            // RETORNAR O VALOR COM DESCONTO
            return valorOriginal-desc;
        }else{
            System.out.println("===================================");
            System.out.println("======= CUPOM NAO VALIDADO =======");
            System.out.println("===================================");
            // RETORNAR O VALOR SEM DESCONTO
            return valorOriginal;
        }
    }

    // Metodo Abstract
    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm*0.3;
    }
    
}
