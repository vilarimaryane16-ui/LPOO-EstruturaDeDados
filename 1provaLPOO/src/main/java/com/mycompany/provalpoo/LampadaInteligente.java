/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public class LampadaInteligente extends Dispositivo implements Conectavel, EconomiaEnergia{
    private String cor;          

    public LampadaInteligente(String nomeDisp, boolean ligadoDisp, String corLamp) {        
        super(nomeDisp, ligadoDisp);
        cor=corLamp;
    }

    @Override
    public void executarFuncaoPrincipal() {
        if (super.Ligado()==true) {
            System.out.println("Lampada "+super.getNome()+" iluminando o ambiente na cor "+this.cor);
        }else{
            System.out.println("A SmartTV esta desligada");
        }

    }

    @Override
    public void ativarModoEco() {
        EconomiaEnergia.super.ativarModoEco();
        System.out.println("Brilho da lampada reduzido para 40%");
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
