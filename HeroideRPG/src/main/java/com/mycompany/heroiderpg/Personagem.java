/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heroiderpg;

/**
 *
 * @author Aluno
 */
public class Personagem {
   String nome;
   String tipo;
   int pontosDeVida;
   
   public void receberDano(int dano){
       pontosDeVida = pontosDeVida - dano;
       System.out.println("O personagem "+ nome + "recebeu dano de" + dano + "pontos de vida atual "+ pontosDeVida );
               
       if ( pontosDeVida == 0 )  {
           System.out.println("O personagem "+ nome + "Virou saudade" );
      
       } else  if ( pontosDeVida > 0 ) {
          System.out.println("O personagem "+ nome + "Morreu mais passa Bem" );
            
   } 
      
    public void cura (int Cura){
      pontosDeVida = pontosDeVida < 0 + Cura;
        System.out.println("");
      
    }

    
    
    
    
    
    
    
}
}