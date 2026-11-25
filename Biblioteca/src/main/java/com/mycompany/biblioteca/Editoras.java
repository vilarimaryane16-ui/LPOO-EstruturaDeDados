package com.mycompany.biblioteca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Editoras {
    int id_editora;
    String nome;
    String cidade;
    String telefone;
    
    public void mostrarIformacoes(){
        System.out.println("====DADOS DA EDITORA====");
        System.out.println("ID da editora: "+id_editora);
        System.out.println("Nome: "+nome);
        System.out.println("Cidade: "+cidade);
        System.out.println("Telefone: "+telefone);
        
    }
    
}
