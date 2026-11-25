/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plataformadestreaming;

/**
 *
 * @author Aluno
 */
public class PlanoPremium extends ContasStreaming {
    private String codigoDeConvite;
            
    public PlanoPremium(String nomeTitular, String emailCadastro, String CodigoDeConvite) {
        super(nomeTitular, emailCadastro);
        this.codigoDeConvite=CodigoDeConvite;
    }

    @Override
    public void configurarPlano() {
        super.setLimiteDeTelas(4);
    }

    @Override
    public double calcularMensalidade() {
        return super.getValorMensalidade()*1.20;
    }

    @Override
    public void exibirFichaConta() {
        System.out.println("===== PERFIL STREAMPLAY PREMIUM =====");
        System.out.println("NOME DO TITULAR "+super.getNome());
        System.out.println("EMAIL "+super.getEmail());
        System.out.println("TELAS ATIVAS "+super.getLimiteDeTelas());
        System.out.println("CODIGO DE CONVITE DE AMIGO: "+this.codigoDeConvite);
        System.out.println("QUALIDADE DE RECURSOS : ULTRA 4K PREMIUM ");
        System.out.println("VALOR MENSALIODADE R$ "+ this.calcularMensalidade());
    }
        
    /**
     * @return the codigoDeConvite
     */
    public String getCodigoDeConvite() {
        return codigoDeConvite;
    }

    /**
     * @param codigoDeConvite the codigoDeConvite to set
     */
    public void setCodigoDeConvite(String codigoDeConvite) {
        this.codigoDeConvite = codigoDeConvite;
    }
    
}
