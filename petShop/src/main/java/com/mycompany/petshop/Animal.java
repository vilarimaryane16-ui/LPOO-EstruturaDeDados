/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Aluno
 */
public class Animal {
    private String nomeAnimal;
    private String nomeDono;
    private double valorDiaria;
    
    public Animal(String nomeA, String nomeD, double valor ){
       this.nomeAnimal=nomeA;
       this.nomeDono=nomeD;
       this.valorDiaria=valor;
    }
    
    public void exibirInformacoes(){
        System.out.println("==== DADOS DO ANIMAL ===="); 
        System.out.println("Nome Animal :"+this.nomeAnimal);
        System.out.println("Nome do Dono :"+this.nomeDono);
        System.out.println("Valor base R$ "+this.valorDiaria);
        System.out.println("=================================");
    }
    
    public double calcularPagamentoFinal(){
        return valorDiaria;
    }
     
    /**
     * @return the nomeAnimal
     */
    public String getNomeAnimal() {
        return nomeAnimal;
    }

    /**
     * @param nomeAnimal the nomeAnimal to set
     */
    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * @return the nomeDono
     */
    public String getNomeDono() {
        return nomeDono;
    }

    /**
     * @param nomeDono the nomeDono to set
     */
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    /**
     * @return the valorDiaria
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * @param valorDiaria the valorDiaria to set
     */
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}