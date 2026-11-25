/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aprendizageminterface1;

/**
 *
 * @author Aluno
 */
public interface Figura {
    // Definir uma Constante na Classe Interface; 
    public static final double pi=3.14159;
    
    // Metodo Abstrato significa que a Classe Contreta deve Escrever Ele;
    double calcularArea();
    
    // Metodo Default ele é Void , esse Metodo pode ser Alterado ou Não;
    // Classes Concretas utilizam esse metodo, terminam de escrever ele;
    default void mostrarDescricao(){
        System.out.print(" Esta e uma Figura Geometrica ");
    }
    
    // Metodo Static, A CLASSE CONCRETA NÂO ESCREVE ESSE METODO, apenas Usa Não se Altera;
    // Todo Metodo SEM VOID  Recebe RETURN;
    static boolean possuiDimensaoValida(double valor){
        if (valor>0){
            return true;
        }else{
            return false;
        }
    }
}
