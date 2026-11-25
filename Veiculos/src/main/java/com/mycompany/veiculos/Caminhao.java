/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculos;

/**
 *
 * @author Aluno
 */
public class Caminhao extends Veiculos{
    private int eixos;

   
    public Caminhao(String marcaVeic, String modeloVeic, double precoVeic, int eixosCaminhao) {
        super(marcaVeic, modeloVeic, precoVeic);
        this.eixos=eixosCaminhao;
    }
    @Override
    public void acelerar() {
        int novaVelocidade = super.getVelocidadeAtual()+5;
        
        if(novaVelocidade<=110){
           super.setVelocidadeAtual(novaVelocidade);
            System.out.println("Aceleeeera km/h "+novaVelocidade);
        }else{
            System.out.println("VELOCIDADE MAXIMA ATINGIDA KM/H "+super.getVelocidadeAtual());
        }
    }    

    @Override
    public void frear() {
        int novaVelocidade = super.getVelocidadeAtual()-5;
        
        if(novaVelocidade>0){
            super.setVelocidadeAtual(novaVelocidade);
            System.out.println("FREEEEARRR KM/H "+novaVelocidade);
        }else{
            super.setVelocidadeAtual(0);
            System.out.println("Caminhao parado...");
            
        }
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Eixos "+this.eixos);
    }

    /**
     * @return the eixos
     */
    public int getEixos() {
        return eixos;
    }

    /**
     * @param eixos the eixos to set
     */
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}
