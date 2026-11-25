/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemarecursoshospitalar;

/**
 *
 * @author Aluno
 */
public class Medico extends Pessoa {
    private String CRM;
    private double bonificacao;
    
    
    public Medico(String nomeCompleto, String Cpf, double salarioBase, String CRMmedico, double bonificacaoPlantao) {
        super(nomeCompleto, Cpf, salarioBase);
        CRM=CRMmedico;
        bonificacao=bonificacaoPlantao;
        
    }
    
    @Override
    public double calcularSalarioFinal(){
        return super.getSalario()+getBonificacao();
    }

    @Override
    public void exibirFicha (){
        super.exibirFicha();
        System.out.println("CRM "+getCRM());
        System.out.println("Bonificacao do Plantao "+getBonificacao());
        System.out.println("Salario Final "+this.calcularSalarioFinal());
    }
    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the bonificacao
     */
    public double getBonificacao() {
        return bonificacao;
    }

    /**
     * @param bonificacao the bonificacao to set
     */
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
