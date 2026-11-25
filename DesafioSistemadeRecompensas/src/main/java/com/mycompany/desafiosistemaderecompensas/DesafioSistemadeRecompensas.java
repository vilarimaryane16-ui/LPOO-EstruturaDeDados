/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiosistemaderecompensas;

/**
 *
 * @author Aluno
 */
public class DesafioSistemadeRecompensas {

    public static void main(String[] args) {
        CartaoFidelidade cartao1 = new CartaoFidelidade ("Jose", "458.555.258-69" );
        CartaoFidelidade cartao2 = new CartaoFidelidade ("Maria", "254.569.777-54");
        
        cartao1.ganharPontos(500);
        cartao1.resgatarPremio("Secador", 58);
        cartao1.transferirPontos(25, cartao2);
        cartao1.mostrarInformacoes();
    }
}
