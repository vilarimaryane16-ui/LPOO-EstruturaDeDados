/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiointerfacemedio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DesafioInterfaceMedio {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      // Criar Dois OBJETOS
      UsuarioComum usuario = new UsuarioComum();
      Administrador admin = new Administrador();
      
      // Criar Vetor de Objetos
      Autenticavel[] usuarios = {admin,admin};
      
      //Percorrer o Vetor de Objetos com o Length
      for(int i=0; i<usuarios.length; i++){
          System.out.println("==============================");
          System.out.println("====== SISTEMA DE AUTENTICACAO ======");
          System.out.println(" INFORME O USUARIO ");
          String user = teclado.nextLine();
          System.out.println(" INFORME A SENHA ");
          String senha = teclado.nextLine();
          // CHAMAR O VETOR DE OBJETOS NA POSICAO 0 E 1 
          usuarios[i].realizarLogin(user, senha);
      }
    }
}
