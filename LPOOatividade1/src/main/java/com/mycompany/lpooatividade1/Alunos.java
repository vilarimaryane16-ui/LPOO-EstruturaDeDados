/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpooatividade1;

/**
 *
 * @author Aluno
 */
public class Alunos {
    int matricula;
    String nome;
    String cpf;
    String email;
    Cursos curso;
   
    
    public void mostrarInformacoes(){
        System.out.println("===DADOS DO ALUNO===");
        System.out.println("Matricula: "+matricula);
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("E-mail: "+email);
        System.out.println("Nome do curso: "+curso.nome);
        System.out.println("Departamento: "+curso.departamento);
        
     
        
    }
    
}
