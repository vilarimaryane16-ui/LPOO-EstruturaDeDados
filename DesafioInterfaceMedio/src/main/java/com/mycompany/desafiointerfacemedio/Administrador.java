/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiointerfacemedio;

/**
 *
 * @author Aluno
 */
public class Administrador implements Autenticavel{

    @Override
    public boolean realizarLogin(String usuario, String senha) {
        if (Autenticavel.super.realizarLogin(usuario, senha)==true){
            System.out.println("ATENCAO!!!  Acesso Administrativo Registrado nos LOGS!"); 
            System.out.println("==============================");
            return true;
        }else{
            System.out.println("ACESSO BLOQUEADO!!!  Tentativa de Login Administrativo com Senha FRACA!");
            System.out.println("==============================");
            return false;
        }
    }
    
}
