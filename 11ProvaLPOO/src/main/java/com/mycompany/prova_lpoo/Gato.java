/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_lpoo;

/**
 *
 * @author Augusto
 */
public class Gato extends animal{
    private String chip;
    private int diasExtras;
    public Gato (String nomeGato,String donoGato,String valorGato, String chip, int diasExtras){
        super (nomeGato,donoGato,valorGato);
        chip=chipGato;
        diasExtras=diasExtrasGato;
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
