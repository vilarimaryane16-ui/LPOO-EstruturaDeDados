package com.mycompany.biblioteca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Livros {
    String isbn;
    String titulo;
    int ano_publicacao;
    Editoras editora;
    String categoria;
    
 public void mostrarInformacoes(){
     System.out.println("====DADOS DO LIVRO====");
     System.out.println("Isbn: "+isbn);
     System.out.println("Titulo: "+titulo);
     System.out.println("Ano de Publicacao: "+ano_publicacao);
     System.out.println("ID da editora: "+editora.nome);
     System.out.println("Categoria: "+categoria);
     
            
 }
    
    
}



      
 
    
    
  
           
