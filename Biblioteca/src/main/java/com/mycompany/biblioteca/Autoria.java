package com.mycompany.biblioteca;


import com.mycompany.biblioteca.Livros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Autoria {
    int id_autoria;
    Livros livro;
    Autores autor;
    
    public void mostrarInformacoes(){
        System.out.println("====DADOS DA AUTORIA====");
        System.out.println("ID de autoria: "+id_autoria);
        System.out.println("Titulo: "+livro.titulo);
        System.out.println("Nome do autor: "+autor.nome);
        
        
    }
}
