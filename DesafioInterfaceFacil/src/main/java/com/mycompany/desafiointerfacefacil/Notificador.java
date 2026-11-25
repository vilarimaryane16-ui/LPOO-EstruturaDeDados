/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.desafiointerfacefacil;

/**
 *
 * @author Aluno
 */
public interface Notificador {
    // Metodo abstrato,  Somente Void...! não escreve Public em uma Interface só em Classes... que fica Public Void...
    void enviarMensagem(String destinatario, String texto);
}
