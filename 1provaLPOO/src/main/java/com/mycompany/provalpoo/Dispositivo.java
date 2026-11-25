/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public abstract class Dispositivo {
    private String nome;
    private boolean ligado;

    public Dispositivo(String nomeDisp, boolean ligadoDisp){
        this.nome= nomeDisp;
        this.ligado=false;
    }
    
    public abstract void executarFuncaoPrincipal();
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ligado
     */
    public boolean Ligado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
