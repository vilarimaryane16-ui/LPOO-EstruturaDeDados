/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiointerfacedificil;

/**
 *
 * @author Aluno
 */
public class PedidoInternacional extends Pedido {
    
    // Metodo Abstrato Reescrevemos 
    @Override
    public double calcularFrete(double distanciaKm) {
        return distanciaKm*0.1; 
    }

    // Metodo Default NÃO reescreve só ACRESCENTA;
    @Override
    public double taxaFixa() {
        return super.taxaFixa()*3; 
    }
    
}
