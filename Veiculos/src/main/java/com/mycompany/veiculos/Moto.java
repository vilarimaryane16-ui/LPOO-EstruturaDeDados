/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Aluno
 */
public class Moto extends Veiculos {
    private int cilindradas;
    
    public Moto(String marcaVeic, String modeloVeic, double precoVeic, int cilindradasMoto) {
        super(marcaVeic, modeloVeic, precoVeic);
        this.cilindradas=cilindradasMoto;
    }

    @Override
    public void acelerar() {
       int novaVelocidade = super.getVelocidadeAtual()+20;
       
       if(novaVelocidade<=300){
           super.setVelocidadeAtual(novaVelocidade);
           System.out.println("Aceleeeera km/h "+novaVelocidade);
       }else{
           System.out.println("VELOCIDADE MAXIMA ATINGIDA KM/H "+super.getVelocidadeAtual());
       }
    }

    @Override
    public void frear() {
        int novaVelocidade = super.getVelocidadeAtual()-20;
        
        if(novaVelocidade>0){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("FRREAAAARR KM/H "+novaVelocidade);            
        }else{
            super.setVelocidadeAtual(0);
            System.out.println("Moto Parada...");
        }
    }
        
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Cilindradas "+this.cilindradas);
    }

    /**
     * @return the cilindradas
     */
    public int getCilindradas(){
        return cilindradas;
    }

    /**
     * @param cilindradas the cilindradas to set
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
