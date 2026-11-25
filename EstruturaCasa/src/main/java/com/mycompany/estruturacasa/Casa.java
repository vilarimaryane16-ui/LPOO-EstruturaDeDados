package com.mycompany.estruturacasa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Casa {
    String cor;
    String rua;
    int numero;
    String construcacao;
    int comodos;
    String regiao;
    
    public void mostrarInformacoes(){
        System.out.println("====DADOS DA CASA====");
        System.out.println("Cor: "+cor);
        System.out.println("Rua: "+rua);
        System.out.println("Numero: "+numero);
        System.out.println("Construcacao: "+construcacao);
        System.out.println("Comodos: "+comodos);
        System.out.println("Regiao: "+regiao);
        
    }
}
