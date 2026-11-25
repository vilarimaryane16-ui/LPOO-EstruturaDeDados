/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_lpoo;

/**
 *
 * @author Augusto
 */
public class Cachorro extends animal {
    private String carteirinhaVacinacao;
    private double valorTaxa;
    public Cachorro (String nomeCachorro, String donoCachorro, double valorDiariaCachorro, String carteirinhaVacinacaoCachorro, double valorTaxaCachorro){
        super(nomeCachorro,donoCachorro,valorDiariaCachorro);
        carteirinhaVacinacao=carteirinhaVacinacaoCachorro;
        valorTaxa=valorTaxaCachorro;

    }
}
    

    /**
     * @return the carteirinhaVacinacao
     */
    public String getCarteirinhaVacinacao() {
        return carteirinhaVacinacao;
    }

    /**
     * @param carteirinhaVacinacao the carteirinhaVacinacao to set
     */
    public void setCarteirinhaVacinacao(String carteirinhaVacinacao) {
        this.carteirinhaVacinacao = carteirinhaVacinacao;
    }

    /**
     * @return the valorTaxa
     */
    public double getValorTaxa() {
        return valorTaxa;
    }

    /**
     * @param valorTaxa the valorTaxa to set
     */
    public void setValorTaxa(double valorTaxa) {
        this.valorTaxa = valorTaxa;
    }
}
