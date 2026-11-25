/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aprendizageminterface1;

/**
 *
 * @author Aluno
 */
public class Circulo implements Figura{
    //  Essa é a Classe que Busca os Metodos da CLASSE INTERFACE;
    double raio;
    
    // Criado um Metodo Construtor(METODO QUE CRIA REGRA) invocando o metodo Static SÓ ESTAMOS USANDO O METODO , NÃO PODE ESCREVER;
    public Circulo(double raioInformado){
        if(Figura.possuiDimensaoValida(raioInformado)==true){
            this.raio=raioInformado;
        }else{
            System.out.println(" O RAIO NAO PODE SE NEGATIVO ");
            this.raio=1.0;
        }
    }
    
    @Override
    public double calcularArea() {
      return pi*(raio*raio);
    }

    @Override
    public void mostrarDescricao() {
        Figura.super.mostrarDescricao();
        System.out.println(" Perfeitamente redonda com raio "+this.raio);
    }
}
