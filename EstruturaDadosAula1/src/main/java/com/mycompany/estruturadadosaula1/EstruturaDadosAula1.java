/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadadosaula1;

/**
 *
 * @author Aluno
 */
public class EstruturaDadosAula1 {

    public static void main(String[] args) {
        //CRIAR PRIMEIRO OBJETO ALUNO
        //REGRA PARA CRIA OBJETO: NOME DA CLASSE SEGUIDO
        //NOME DO OBJETO SEGUIDO DE " = new" SEGUIDO DE 
        //NOME DA CLASSE ();
        System.out.println("aluno1");
        Alunos aluno1 = new Alunos();
        
        aluno1.matricula=123;
        aluno1.media=8.5;
        aluno1.nome="Patrick de Paula";
        aluno1.online=false;
        
        aluno1.matricular();
        
        aluno1.consultarNotas();
        System.out.println("aluno2");
        Alunos aluno2 = new Alunos();
        
        aluno2.matricula=321;
        aluno2.media=6.8;
        aluno2.nome="Bruna Fernandez";
        aluno2.online=true;
        
        aluno2.matricular();
        
        aluno2.consultarNotas();
        System.out.println("aluno3");
        Alunos aluno3 = new Alunos();
        
        aluno3.matricula=574;
        aluno3.media=9.0;
        aluno3.nome="Ricardo Neves";
        aluno3.online=false;
        
        aluno3.matricular();
        
        aluno3.consultarNotas();
        
        aluno3.mostrarInformacoes();
        
       
 
    }
}
