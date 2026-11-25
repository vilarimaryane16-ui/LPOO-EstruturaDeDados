/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiointerfacefacil;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DesafioInterfaceFacil {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner (System.in);
        
        // Dois Objetos das Classes Concretas
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoSms sms = new NotificacaoSms();
        
        // VETOR DE OBJETOS
        Notificador[] notificadores={email, sms};
        
        // LENGTH = .length Indica Quantos Elementos Existem Dentro do Vetor, ele percorre o Vetor (notificadores)
        for(int i=0; i<notificadores.length; i++){
            System.out.println("=== INFORME O DESTINATARIO ===");
            String destinatario = Teclado.nextLine();
            System.out.println("=== INFORME O TEXTO ===");
            String texto = Teclado.nextLine();
            notificadores[i].enviarMensagem(destinatario, texto);
        }
    }
}
