/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturapassaro;

/**
 *
 * @author Aluno
 */
public class Passaro {
    String nome;
    String especie;
    String cor;
    String tamanho;
    int idade;
    String sexo;
    
    public void mostrarInformacoes(){
        System.out.println("====DADOS DO PASSARO====");
        System.out.println("Nome: "+nome);
        System.out.println("Especie: "+especie);
        System.out.println("Cor: "+cor);
        System.out.println("Tamanho:"+tamanho);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
    
}
