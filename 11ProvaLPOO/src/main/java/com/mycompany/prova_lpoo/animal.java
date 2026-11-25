/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_lpoo;

/**
 *
 * @author Augusto
 */
public class animal {
    private String nome;
    private String dono;
    private double valorDiaria;
    public animal (String nomeAnimal, String donoAnimal, double valorDiaria){
        nome=nomeAnimal;
        dono=donoAnimal;
        valorDiaria=valorDiaria;
    }
    public void exibirIformacoes(){
        System.out.println("==Informacoes==");
        System.out.println("Nome do pet: "+getNome());
        System.out.println("Nome do dono: "+getDono());
        System.out.println("Preco da diaria? "+ getValorDiaria());
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
