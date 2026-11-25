/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plataformadestreaming;

/**
 *
 * @author Aluno
 */
public abstract class ContasStreaming {
    private String nome;
    private String email;
    private int limiteDeTelas=0;
    private double valorMensalidade=43.00;
    
    public ContasStreaming(String nomeTitular, String emailCadastro){
       this.nome=nomeTitular;
       this.email=emailCadastro;
       this.limiteDeTelas=0;
       
    }
    
    public abstract void configurarPlano();
    public abstract double calcularMensalidade();
    public abstract void exibirFichaConta();
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the limiteDeTelas
     */
    public int getLimiteDeTelas() {
        return limiteDeTelas;
    }

    /**
     * @param limiteDeTelas the limiteDeTelas to set
     */
    public void setLimiteDeTelas(int limiteDeTelas) {
        this.limiteDeTelas = limiteDeTelas;
    }

    /**
     * @return the valorMensalidade
     */
    public double getValorMensalidade() {
        return valorMensalidade;
    }

    /**
     * @param valorMensalidade the valorMensalidade to set
     */
    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}
