/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lpooatividade1;

/**
 *
 * @author Aluno
 */
public class LPOOfaculdade {

    public static void main(String[] args) {
       Cursos cursoTi = new Cursos();
       cursoTi.id_curso=1;
       cursoTi.nome="TDAS";
       cursoTi.departamento="informatica";
       
       Alunos aluno1 = new Alunos();
       aluno1.matricula=321;
       aluno1.nome="Roberto Capivariano";
       aluno1.cpf="3547892";
       aluno1.email="capivariano@gmail.com";
       aluno1.curso=cursoTi;
       aluno1.mostrarInformacoes();
       
       Professores professor1 = new Professores();
       professor1.cpf= "57496789";
       professor1.nome= "Roberto Carlos ";
       professor1.titulacao="Graduado";
       
       
       Disciplinas disciplina1 = new Disciplinas();
       disciplina1.id_disciplina=6;
       disciplina1.nome="Qualidade e usabilidade...";
       disciplina1.curso=cursoTi;
       disciplina1.professor=professor1;
       disciplina1.carga_horaria=9878;
       disciplina1.periodo=123;
       disciplina1.mostrarInformacoes();
       
       
               
    }
}
