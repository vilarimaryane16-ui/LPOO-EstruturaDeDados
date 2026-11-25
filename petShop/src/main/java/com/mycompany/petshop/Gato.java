/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop;

/**
 *
 * @author Aluno
 */
public class Gato extends Animal {
    private String chip;
    private int diasGatil;
    
    public Gato(String nomeA, String nomeD, double valor, String chip, int diasGatil) {
        super(nomeA, nomeD, valor);
        this.chip=chip;
        this.diasGatil=diasGatil;
    }
    
    @Override
    public double calcularPagamentoFinal(){
      return super.getValorDiaria()+this.diasGatil*40;
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Numero do Chip de Identificacao :"+this.chip);
        System.out.println("Dias Extras no Gatil R$ "+this.diasGatil);
        System.out.println("Valor Final a Pagar R$ "+this.calcularPagamentoFinal());
    }
    
    /**
     * @return the chip
     */
    public String getChip() {
        return chip;
    }

    /**
     * @param chip the chip to set
     */
    public void setChip(String chip) {
        this.chip = chip;
    }

    /**
     * @return the diasGatil
     */
    public int getDiasGatil() {
        return diasGatil;
    }

    /**
     * @param diasGatil the diasGatil to set
     */
    public void setDiasGatil(int diasGatil) {
        this.diasGatil = diasGatil;
    }
    
}
