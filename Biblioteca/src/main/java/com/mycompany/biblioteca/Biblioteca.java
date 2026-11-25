/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author Aluno
 */
public class Biblioteca {

    public static void main(String[] args) {
        
        Editoras editoras = new Editoras();
        editoras.id_editora=760;
        editoras.nome="Vida Bela";
        editoras.cidade="São Paulo";
        editoras.telefone="11998047637";
       // editoras.mostrarIformacoes();
        
        Livros livros = new Livros();
        livros.isbn="5366373";
        livros.titulo="Fazendo meu Filme";
        livros.ano_publicacao=2015;
        livros.editora=editoras;
        livros.categoria="Romance";
        livros.mostrarInformacoes();
        
        Autores autores = new Autores();
        autores.id_autor=543;
        autores.nome="Paula Pimenta";
        autores.nacionalidade="Brasileira";
        autores.email="paulapimenta@gmail.com";
        //autores.mostrarInformacoes();
        
        Autoria autoria = new Autoria();
        autoria.id_autoria=879;
        autoria.autor=autores;
        autoria.livro=livros;
        autoria.mostrarInformacoes();
        
                
    }
}
