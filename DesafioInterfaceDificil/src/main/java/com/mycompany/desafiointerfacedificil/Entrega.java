/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafiointerfacedificil;

/**
 *
 * @author Aluno
 */
public interface Entrega {
    // Metodo Abstrato, logo vai ; no final e NÃO tem corpo
    abstract double calcularFrete(double distanciaKm);
    
    // Metodo Default, TEM corpo
    default double taxaFixa(){
        return 5.0;
    }
}
