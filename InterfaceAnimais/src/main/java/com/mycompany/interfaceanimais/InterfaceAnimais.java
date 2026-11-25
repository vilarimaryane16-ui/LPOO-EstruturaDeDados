/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaceanimais;

/**
 *
 * @author Aluno
 */
public class InterfaceAnimais {

    public static void main(String[] args) {
        Cachorro diluvio = new Cachorro("Diluvio", 3);
        System.out.println("=== Cachorro Diluvio ===");
        diluvio.emitirSom();
        diluvio.comer();
        diluvio.bricarComHumanos();
        diluvio.envelhecer();
        System.out.println("============================");
        
        System.out.println("=== Cavalo Pé de Pano ===");
        Cavalo peDePano = new Cavalo("PedePano", 2);
        // Metodos herdados da classe Abstrata;
        peDePano.emitirSom();
        peDePano.comer();
        peDePano.bricarComHumanos();
        // Metodos herdados da Interface;
        // Metodo Static da Interface;
        Montaria.InspecionarEquipamentos(true, true);
        // Metodo Abstrato;
        peDePano.envelhecer();
        peDePano.galopar();
        // Metodo Default da Interface;
        System.out.println("Peso meximo suportado para carga "+peDePano.calcularCargaMaxSuportada(512));
    }
}
