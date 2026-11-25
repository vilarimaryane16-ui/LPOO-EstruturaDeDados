/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiointerfacefacil;

/**
 *
 * @author Aluno
 */
public class NotificacaoEmail implements Notificador{
    // Essa é uma Classe Concreta
    @Override
    public void enviarMensagem(String destinatario, String texto) {
        System.out.println("=============================");
        System.out.println(" Enviando E-mail para [Destinatario]: "+destinatario+" [Texto]: "+texto);
        System.out.println("=============================");
    }

    
}
