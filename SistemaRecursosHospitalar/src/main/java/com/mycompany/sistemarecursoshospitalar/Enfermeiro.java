/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemarecursoshospitalar;

/**
 *
 * @author Aluno
 */
public class Enfermeiro  extends Pessoa {
    private String COREN;
    private int extras;
    
    
    public Enfermeiro(String nomeCompleto, String Cpf, double salarioBase, String CorenEnfer, int extrasEnfer) {
        super(nomeCompleto, Cpf, salarioBase);
        COREN=CorenEnfer;
        extras=extrasEnfer;
    }

    @Override
    public double calcularSalarioFinal(){
        return super.getSalario()+getExtras()*50;
    }
    
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("COREN "+getCOREN());
        System.out.println("Horas Extras "+getExtras());
        System.out.println("Salario Final "+this.calcularSalarioFinal());
    }
    /**
     * @return the COREN
     */
    public String getCOREN() {
        return COREN;
    }

    /**
     * @param COREN the COREN to set
     */
    public void setCOREN(String COREN) {
        this.COREN = COREN;
    }

    /**
     * @return the extras
     */
    public int getExtras() {
        return extras;
    }

    /**
     * @param extras the extras to set
     */
    public void setExtras(int extras) {
        this.extras = extras;
    }
  
}
