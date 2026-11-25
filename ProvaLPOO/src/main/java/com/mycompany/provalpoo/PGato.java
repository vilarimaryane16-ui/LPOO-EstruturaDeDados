/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public class PGato extends Animal{
    private String chip;
    private int diasExtras;
    public PGato (String nomeGato,String donoGato,double valorGato, String chip, int diasExtras, String chipGato, int diasExtrasGato){
        super(nomeGato,donoGato,valorGato);
        chip = chipGato;
        diasExtras = diasExtrasGato;
    }
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("Chip: "+getChip());
        System.out.println("Dias extras: "+getDiasExtras());
    }
    @Override
    public void valorFinalGato(){
        super.setValor(diasExtras);
        
        super.calcularPagamentoFinal();
        //valor+=diasExtras*40
        System.out.println(this.getValor() );
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
     * @return the diasExtras
     */
    public int getDiasExtras() {
        return diasExtras;
    }

    /**
     * @param diasExtras the diasExtras to set
     */
    public void setDiasExtras(int diasExtras) {
        this.diasExtras = diasExtras;
    }
}
