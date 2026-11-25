/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author Aluno
 */
public class Veiculos {
    private String marca;
    private String modelo;
    private double preco;
    private int velocidadeAtual;
    
    public Veiculos (String marcaVeiculo, String modeloVeiculo, double precoVeiculo){
        marca=marcaVeiculo;
        modelo=modeloVeiculo;
        preco=precoVeiculo;
        velocidadeAtual=0;
    }

    public void exibirFicha(){
        System.out.println("==== DADOS DO VEICULO =====");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Preco R$: "+getPreco());
        System.out.println("===============================");
        
    }
    
    public void acelerar(){
        this.velocidadeAtual +=10;
        System.out.println(this.modelo + "Acelerou! Velocidade: "+ this.velocidadeAtual + "km/h ");
    }
   
    public void frear(){
        
          if (this.velocidadeAtual >=0 ){
              this.velocidadeAtual =-10;
              System.out.println(this.modelo + "Freou! Velcidade: " + this.velocidadeAtual + "km/h");
              System.out.println(" Seu veiculo esta se locomovendo!!! :) ");  
          }else{
              System.out.println(" Seu veiculo esta totalmente parado!!! :(  "); 
          }                               
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
