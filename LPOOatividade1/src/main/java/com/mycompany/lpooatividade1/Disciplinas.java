/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lpooatividade1;

/**
 *
 * @author Aluno
 */
public class Disciplinas {
    int id_disciplina;
    Cursos curso;
    Professores professor;
    String nome;
    int carga_horaria;
    int periodo;
     
    public void mostrarInformacoes(){
        System.out.println("====DADOS DA DISCIPLINA====");
        System.out.println("Nome do curso: "+curso.nome);
        System.out.println("Nome  do professor: "+professor.nome);
        System.out.println("Nome: "+nome);
        System.out.println("Carga horaria: "+carga_horaria);
        System.out.println("Periodo: "+periodo);
    }
}
