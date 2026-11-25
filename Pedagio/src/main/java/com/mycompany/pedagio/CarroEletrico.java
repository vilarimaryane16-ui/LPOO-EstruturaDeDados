/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author Aluno
 */
public class CarroEletrico extends Cabine {
    private String seloEcologico;
    
    public CarroEletrico(String placaVeiculo, int qtdEixosVeiculo, String seloVerde) {
        super(placaVeiculo, qtdEixosVeiculo);
        this.seloEcologico=seloVerde;
    }

    @Override
    public double calcularTarifa() {
      return super.getValorTarifa()*0.50;
      
    }

    @Override
    public void emitirComprovante() {
        System.out.println("===== COMPROVANTE PEDAGIO ECOLOGICO =====");
        System.out.println("PLACA "+super.getPlaca());
        System.out.println("QUANTIDADE DE EIXOS "+super.getQtdEixos());
        System.out.println("VALOR BASE R$ "+super.getValorTarifa());
        System.out.println("SELO ECOLOGICO "+this.seloEcologico);
        System.out.println("VALOR COM 50% DE DESCONTO R$ "+this.calcularTarifa());
     
    }

    /**
     * @return the selo
     */
    public String getSelo() {
        return seloEcologico;
    }

    /**
     * @param selo the selo to set
     */
    public void setSelo(String selo) {
        this.seloEcologico = selo;
    }
    
}
