/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author Aluno
 */
public class Caminhao extends Cabine {
    private String nomeTransportadora; 
    
    public Caminhao(String placaVeiculo, int qtdEixosVeiculo, String nomeTransp) {
        super(placaVeiculo, qtdEixosVeiculo);
        this.nomeTransportadora=nomeTransp;
    }

    @Override
    public double calcularTarifa() {
       return super.getValorTarifa()*0.90;
    }
    
    @Override
    public void emitirComprovante() {
        System.out.println("==== ECOVIAS PEDAGIO ====");
        System.out.println("PLACA "+super.getPlaca());
        System.out.println("QUANTIDADE DE EIXOS "+super.getQtdEixos());
        System.out.println("VALOR BASE R$ "+super.getValorTarifa());
        System.out.println("NOME DA EMPRESA "+this.getNomeTransportadora());
        System.out.println("VALOR COM 10% DE DESCONTO R$ "+this.calcularTarifa());
        
    }

    /**
     * @return the nomeTransportadora
     */
    public String getNomeTransportadora() {
        return nomeTransportadora;
    }

    /**
     * @param nomeTransportadora the nomeTransportadora to set
     */
    public void setNomeTransportadora(String nomeTransportadora) {
        this.nomeTransportadora = nomeTransportadora;
    }
    
}
