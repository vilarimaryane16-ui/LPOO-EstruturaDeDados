/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturacachorro;

/**
 *
 * @author Aluno
 */
public class Cachorro {
    String nome;
    String cor;
    int idade;
    String sexo;
    String raça;
    double peso;
    String porte;
     
    public void mostrarInformacoes(){
        System.out.println("====DADOS DO CACHORRO====");
        System.out.println("Nome: "+nome);
        System.out.println("Cor: "+cor);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Raca: "+raça);
        System.out.println("Peso: "+peso);
        System.out.println("Porte: "+porte);
        
    }
}
