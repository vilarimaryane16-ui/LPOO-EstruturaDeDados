/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
       Cachorro filhote = new Cachorro("guapeca", "medio", 5, "caramelo");
       filhote.exibirInformacoes();
       filhote.adestramento();
       filhote.exibirInformacoes();
    }
}
