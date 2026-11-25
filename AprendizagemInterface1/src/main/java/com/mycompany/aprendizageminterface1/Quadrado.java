/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprendizageminterface1;

/**
 *
 * @author Aluno
 */
public class Quadrado implements Figura{
    double lado;
    
    public Quadrado(double ladoInformado){
        if(Figura.possuiDimensaoValida(ladoInformado)==true){
            this.lado=ladoInformado;
        }else{
            System.out.println(" NAO ACEITA VALORES NEGATIVOS ");
            this.lado=1.0;
        }
    }
            
    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public void mostrarDescricao() {
        Figura.super.mostrarDescricao(); 
        System.out.println(" Quadrado com lados medindo "+this.lado);
    }
    
}
