/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veiculos;

/**
 *
 * @author Aluno
 */
public abstract class Veiculos {
    private String marca;
    private String modelo;
    private double preco;
    private int velocidadeAtual;
    
    public Veiculos(String marcaVeic, String modeloVeic, double precoVeic){
        this.marca=marcaVeic;
        this.modelo=modeloVeic;
        this.preco=precoVeic;
        this.velocidadeAtual=0;
    }
    
    public abstract void acelerar();   
    public abstract void frear();
    
    public void exibirInformacoes(){
        System.out.println("=========================");
        System.out.println("MARCA "+this.marca);
        System.out.println("MODELO "+this.modelo);
        System.out.println("PRECO "+this.preco);
        System.out.println("VELOCIDADE ATUAL "+this.velocidadeAtual);
        
    }
        
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the velocidadeAtual
     */
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    /**
     * @param velocidadeAtual the velocidadeAtual to set
     */
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
  
}
