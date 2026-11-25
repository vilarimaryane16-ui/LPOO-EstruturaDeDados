/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public class Animal {
    private String nome;
    private String dono;
    private double valor;
    public Animal (String nomeAnimal, String donoAnimal, double valorDiaria){
        nome = nomeAnimal;
        dono = donoAnimal;
        valor = valorDiaria;
    }
    public void exibirFicha(){
        System.out.println("==== INFORMACOES =====");
        System.out.println("NOME: "+ getNome());
        System.out.println("DONO: "+ getDono());
        System.out.println("VALOR R$: "+ getValor());   
    }
    public double calcularPagamentoFinal(){
        return getValor();                
    }
    
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
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
