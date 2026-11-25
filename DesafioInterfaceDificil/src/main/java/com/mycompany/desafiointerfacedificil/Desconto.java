/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafiointerfacedificil;

/**
 *
 * @author Aluno
 */
public interface Desconto {
    // Metodo Abstrato, ponto e virgula no Final; e NÃO tem corpo.
    abstract double aplicarDesconto(double valorOriginal, String cupom);
    
    // Metodo Estatico
    static boolean validarCupom(String cupom){
        //Verificar se o cupom tem Texto de Desconto
        if(cupom.contains("desconto")){
            return true;
        }else{
            return false;
        }
    }
}
