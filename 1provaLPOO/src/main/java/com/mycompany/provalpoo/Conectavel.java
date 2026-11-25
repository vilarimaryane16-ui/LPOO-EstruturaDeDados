/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public interface Conectavel {
    String REDE_PADRAO="Casa5g", USUARIO_PADRAO="admin", SENHA_PADRAO="admin123";
    int SINAL_MINIMO=30;
    
     static boolean validarSinal(int intensidade){
       
        if(intensidade>=SINAL_MINIMO){
            return true;
        }else{
            return false;
        }
    }
     
     default void conectarWifi(String usuario, String senha, int intensidade ){
         System.out.println("CONECTANDO A REDE POR CONEXAO WI-FI!");
         if(validarSinal(intensidade)==true && usuario.contains(USUARIO_PADRAO) && senha.contains(SENHA_PADRAO)){
             System.out.println("Usuario "+usuario+" conectado com sucesso na rede "+REDE_PADRAO);
         }else{
             System.out.println("Falha na conexao: VERIFIQUE USUARIO E SENHA, VERIFIQUE TAMBEM A POSSIBILIDADE DO SINAL ESTAR FRACO. INTENSIDADE MEDIA "+intensidade);
         }
         
     }
     
     
}
