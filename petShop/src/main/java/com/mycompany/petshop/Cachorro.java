/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animal{
    private String carteirinha;
    private double adestramento;
    
    public Cachorro(String nomeA, String nomeD, double valor, String carteirinha, double adestramento) {
        super(nomeA, nomeD, valor);
        this.carteirinha=carteirinha;
        this.adestramento=adestramento;
    }
    
    @Override
    public double calcularPagamentoFinal(){
        return super.getValorDiaria()+this.adestramento;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Numero Carteirinha :"+this.carteirinha);
        System.out.println("Taxa Adestramento R$ "+this.adestramento);
        System.out.println("Valor Final a Pagar R$"+this.calcularPagamentoFinal());        
    }
    
    /**
     * @return the carteirinha
     */
    public String getCarteirinha() {
        return carteirinha;
    }

    /**
     * @param carteirinha the carteirinha to set
     */
    public void setCarteirinha(String carteirinha) {
        this.carteirinha = carteirinha;
    }

    /**
     * @return the adestramento
     */
    public double getAdestramento() {
        return adestramento;
    }

    /**
     * @param adestramento the adestramento to set
     */
    public void setAdestramento(double adestramento) {
        this.adestramento = adestramento;
    }
    
}
