/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadadosaula1;

/**
 *
 * @author Aluno
 */
public class Alunos {
    int matricula;
String nome;
double media;
boolean online;

public void matricular(){
    System.out.println("Aluno Matriculado"); 
        
}
public void cancelarMatricula(){
    System.out.println("Matricula cancelada");
}

public void consultarNotas(){
    System.out.println("-----NOTAS BIMESTRAIS-----");
    System.out.println("-----BANCO DE DADOS: 9.5-----");
    System.out.println("-----DESENV. MOBILE: 8.3-----");
    System.out.println("-----REDES DE COMPUTADORES: 7.8-----");
    System.out.println("-----LINGUAGEM DE PROG: 8.1-----");
    
}

 public void mostrarInformacoes(){
    System.out.println("=====DADOS DO ALUNO=====");
    System.out.println("matricula: "+matricula );
    System.out.println("nome: "+nome );
    System.out.println("media: "+media );
    System.out.println("online: " +online );
}



}