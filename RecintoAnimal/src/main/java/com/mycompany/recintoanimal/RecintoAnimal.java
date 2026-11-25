/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recintoanimal;

/**
 *
 * @author Aluno
 */
public class RecintoAnimal {
    private String codigo;
    private String especie;
    private String nome;
    private double quilos;
    private boolean limpo;
    
    public RecintoAnimal( String codigoJaula, String especies, String nomeZelador ){
       codigo = codigoJaula;
       especie = especies;
       nome = nomeZelador;
       quilos = 50.00;
       limpo = true;
    }  
    
    public  String getcodigo(){
           return this.codigo;           
       }
    
    public String getespecieAnimal(){
        return this.especie;
    }
    
    public String setnomeZelador(){
        return this.nome;
    }
    public double getquilosRacao(){
        return this.quilos;
    }
    public boolean getlimpo(){
        return this.limpo;
    }
    
    public void mostrarInformacoes(){
        System.out.println("==== INFORMACOES DO RECINTO ====");
        System.out.println(" CODIGO DA JAULA : " + getcodigo());
        System.out.println(" ESPECIE : " + getespecieAnimal());
        System.out.println(" NOME DO ZELADOR/TRATADOR : " + setnomeZelador());
        System.out.println(" QUILOS DA RACAO : " + getquilosRacao());
        System.out.println(" LIMPO OU SUJO : " + getlimpo());
        System.out.println("=========================================");
    }  
        
    public void mudarJaula(String newCodigo){
      if ( limpo == true ){
      this.codigo= newCodigo;
          System.out.println("Voce pode trocar de Jaula ! :)  " + newCodigo);
          
      } else {
          System.out.println("Nao foi possivel a troca de Jaula :( ");
      }
    }
    public void limparRecinto (){
        this.limpo = true;
        System.out.println("O recinto esta Limpo ! :) ");
        
    }
    public void alimentarAnimal ( double newQuilos){
        quilos = quilos - newQuilos;
        limpo=false;
        System.out.println(" A quantidade de racao agora e de " + quilos );
    }
            
            
    
}
