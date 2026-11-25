/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceanimais;

/**
 *
 * @author Aluno
 */
public class Cavalo extends Animais implements Montaria{

    public Cavalo(String nomeAnimal, int idadeAnimal) {
        super(nomeAnimal, idadeAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome()+" Esta relichando! ");
    }

    @Override
    public void comer() {
        System.out.println(super.getNome()+" Esta"+ "comendo alfafa! ");
    }

    @Override
    public void bricarComHumanos() {
        System.out.println(super.getNome()+" Recebeu "+"um cafune! ");
    }
        
    @Override
    //  PARA GALOPAR O CAVALO DEVE TER 3 ANOS 
    public void galopar() {
        if(super.getIdade()<idadeParaMontar){  
        System.out.println(super.getNome()+" É muito jovem para galopar! "+"idade minima "+idadeParaMontar+" anos");
        }else{
            System.out.println(super.getNome()+" Esta galopando pelos campos! "+" CUIDADO!!! para nao ultrapassar "+"velocidade maxima "+velocidadeLimiteGalope+" km/h");
        }
    }
}
