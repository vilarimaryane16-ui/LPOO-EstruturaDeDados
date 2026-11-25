/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animais {

    public Cachorro(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" Latiu! Au Au ");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" Esta comendo! ");
    }

    @Override
    public void bricarComHumanos() {
        System.out.println(super.getNome()+" Pega a bolinha! ");
    }
    
}
