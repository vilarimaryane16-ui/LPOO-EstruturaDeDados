/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author Aluno
 */
public class Leao extends Animais implements Selvagem,Mamiferos{
    
    public Leao(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" Esta rugindo! "+" ....AHrrrrrrrrrrrrrrrrrrrrrrrrrrr");  
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" Esta comedo! "); 
    }

    @Override
    public void bricarComHumanos() {
        System.out.println(super.getNome()+" ALERTA! "+" Leao é um Animal SELVAGEM, Cuidado!!!");
    }

    @Override
    public void cacar() {
        System.out.println(super.getNome()+" Esta "+ "espreitandoa a sua presa! ");
    }

    @Override
    public void amamentarFilhote() {
        System.out.println(super.getNome()+" Esta "+"amamentando seu filhote! ");
    }
        
    
}
