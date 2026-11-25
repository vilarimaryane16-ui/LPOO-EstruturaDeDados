/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprendizageminterface1;

/**
 *
 * @author Aluno
 */
public class Trapezio implements Figura{
    double baseMaior;
    double baseMenor;
    double altura;
    
    public Trapezio(double baseMaiorInfo, double baseMenorInfo, double alturaInfo){
        if(Figura.possuiDimensaoValida(baseMaiorInfo)==true){
            this.baseMaior=baseMaiorInfo;
        }else{
            System.out.println(" NAO ACEITA VALORES NEGATIVOS ");
            this.baseMaior=1.0;
        }
        if(Figura.possuiDimensaoValida(baseMenorInfo)==true){
            this.baseMenor=baseMenorInfo;
        }else{
            System.out.println(" NAO ACEITA VALORES NEGATIVOS ");
            this.baseMaior=1.0;
        }
        if(Figura.possuiDimensaoValida(alturaInfo)==true){
            this.altura=alturaInfo;
        }else{
            System.out.println(" NAO ACEITA VALORES NEGATIVOS ");
            this.baseMaior=1.0;
        }
    }
    
    @Override
    public double calcularArea() {
        return ((baseMaior+baseMenor)*altura)/2;
    }

    @Override
    public void mostrarDescricao() {
        Figura.super.mostrarDescricao();
        System.out.println("Trapezio com Base Maior "+this.baseMaior+" a Base Menor com "+ this.baseMenor+ " e Altura "+this.altura);
    }
    
}
