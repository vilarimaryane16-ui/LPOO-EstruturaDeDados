/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafiointerfacemedio;

/**
 *
 * @author Aluno
 */
public interface Autenticavel {
    // Constante , o Final indica que ela é uma Constante...
    public static final int TAMANHO_MINIMO_SENHA=8;
    
    // Metodo Static
    static boolean validarForcaSenha(String senha){
       if (senha.length()>=TAMANHO_MINIMO_SENHA){
           return true;
        }else{
          return false; 
       }
    }
    
    // Metodo Default
    default boolean realizarLogin(String usuario, String senha){
        if(validarForcaSenha(senha)==true){
            System.out.println("=====================");
            System.out.println("Usuario "+usuario+", Logado com Sucesso!!! :) ");
            System.out.println("=====================");
            return true;
        }else{
           System.out.println("=====================");
            System.out.println("Senha muito Fraca...! :(  Tente Novamente usando 8 Caracteres...");
            System.out.println("====================="); 
            return false;
        }
    }
    
}
