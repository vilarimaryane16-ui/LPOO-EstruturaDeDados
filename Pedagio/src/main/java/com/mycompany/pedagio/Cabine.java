/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedagio;

/**
 *
 * @author Aluno
 */
public abstract class Cabine {
    private String placa;
    private int qtdEixos;
    private double valorTarifa;

    public Cabine(String placaVeiculo, int qtdEixosVeiculo){
        this.placa=placaVeiculo;
        this.qtdEixos=qtdEixosVeiculo;
        this.valorTarifa=qtdEixosVeiculo*6;
    }
        
    public abstract double calcularTarifa();
    public abstract void emitirComprovante();
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the qtdEixos
     */
    public int getQtdEixos() {
        return qtdEixos;
    }

    /**
     * @param qtdEixos the qtdEixos to set
     */
    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    /**
     * @return the valorTarifa
     */
    public double getValorTarifa() {
        return valorTarifa;
    }
    
    
}
