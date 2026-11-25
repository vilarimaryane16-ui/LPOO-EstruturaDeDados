/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiosistemaderecompensas;

/**
 *
 * @author Aluno
 */
public class CartaoFidelidade {
    private String nome;
    private String Cpf;
    private int saldoDePontos;
    
    
    public CartaoFidelidade ( String nomedoCliente, String CpfdoTitular) {
        nome=nomedoCliente;
        Cpf=CpfdoTitular;
        saldoDePontos=0;
        
    }
    
    public void setNome (String nomeCliente){
        nome=nomeCliente;
        
    }
    
    public String getCpf (){
        return Cpf;
        
    }
    
    public int getsaldoDePontos(){
        return saldoDePontos;
        
    }
    
    public String getnomeCliente(){
        return nome;
    }
    
    //Metodo de Negocio
    public void mostrarInformacoes (){
        System.out.println("==== SALDO DE PONTOS ACUMULADOS ====");
        System.out.println("Nome: "+getnomeCliente());
        System.out.println("CPF: "+getCpf());
        System.out.println("Saldo R$: "+getsaldoDePontos());
        
    }
    
    public void ganharPontos(double valorCompra ){
        if (valorCompra >=0){
            saldoDePontos+=(valorCompra*10/100);
        System.out.println("Voce ganhou "+valorCompra*10/100);
        System.out.println("Voce acumulou: " +saldoDePontos);
        
    }else {
            System.out.println("Voce não recebeu pontos Extras em sua compra :( ");
        }
        }
        
    public void resgatarPremio( String produto, int valorDoProduto ){
        if (saldoDePontos >=valorDoProduto){
            saldoDePontos-=valorDoProduto;
            System.out.println("Pontos resgatados !");
            System.out.println("==============================");
            System.out.println("Voce resgatou "+produto + "seu Saldo e "+saldoDePontos);
            System.out.println("==============================");
            
        }else{
            System.out.println("Voce nao tem pontos suficientes para resgatar :( ");
            System.out.println("==============================");
        }
        
    }
    
    public void transferirPontos(int valorTransferido,CartaoFidelidade cartaoDestino ){
        if (this.saldoDePontos >= valorTransferido){
            this.saldoDePontos-=valorTransferido;
            cartaoDestino.saldoDePontos+=valorTransferido;
            System.out.println("Seus pontos foram Transferidos com Sucesso !");
            System.out.println("==============================");
            this.mostrarInformacoes();
            System.out.println("==============================");
            cartaoDestino.mostrarInformacoes();
            System.out.println("==============================");
          
    }else {
            System.out.println("Transferencia Recusada por Pontos Insuficientes :( ");
    }
    }
}

