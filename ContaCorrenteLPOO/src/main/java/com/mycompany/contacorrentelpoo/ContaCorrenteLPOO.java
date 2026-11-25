/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrentelpoo;

/**
 *
 * @author Aluno
 */
public class ContaCorrenteLPOO {

    private int numero;
    private String titular;
    private double saldo;
    private String cpf;
    private int senha;
    
    //Metodo construtor
    //Mesmo nome da classe 
    
  public ContaCorrenteLPOO(int numeroConta, String titularNome, String cpfInformado, int senhaInformada){
      numero=numeroConta;
      titular=titularNome;
      saldo=100.00;
      cpf=cpfInformado;
      senha=senhaInformada;
      
  }
  
  public void setTitular(String nomeTitular){
      titular=nomeTitular;
  }
  
  public void setSenha(int senhaTitular){//Metodo SEM Retorno "VOID"
      senha=senhaTitular;
  }
  
  public int getNumero(){//Metodo com Retorno "INT"
      return numero;
  }
  
  public String getTitular(){
      return titular;
  }
  
  public double getSaldo(){
      return saldo;
  }
  
  public String getCpf(){
      return cpf;
  }
  
  public int getSenha(){
      return senha;
  }
  
  //METODOS DE NEGOCIO
  public void mostrarInformacoes(){
      System.out.println("====EXTRATO BANCARIO====");
      System.out.println("Conta: "+getNumero());
      System.out.println("Titular: "+getTitular());
      System.out.println("Saldo R$: "+getSaldo());
      System.out.println("CPF: "+getCpf());    
  }
  
  public void sacar(double valorSaque, int senhaDigitada ){
      if ((valorSaque<=getSaldo())&& (senhaDigitada==getSenha())){
          saldo-=valorSaque;
      System.out.println("Saque realizado com sucesso!");
    }else if (senhaDigitada!=getSenha()){
            System.out.println("Senha incorreta!"); 
    }else{
            System.out.println("Saldo insuficiente");
    }
}
  
  public void depositar(double valorDeposito){
      saldo+=valorDeposito;
      System.out.println("Deposito realizado com sucesso!");
  }
  public void transferir(double valorTransferencia,ContaCorrenteLPOO contaDestino){
      if(this.getSaldo()>=valorTransferencia){
          this.saldo=saldo-valorTransferencia;
          contaDestino.saldo+=valorTransferencia;
          System.out.println("Transferencia realizada com sucesso!");  
          
      }else{
          System.out.println("Saldo insuficiente");
      }
  }
}
