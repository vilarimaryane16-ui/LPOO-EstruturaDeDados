package com.mycompany.estruturabicicleta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Bicicleta {
    String marca;
    int modelonum;
    String modelo;
    String cor;
    String freio;
    int marcha;
    int aro;
    
    public void mostrarInformacoes(){
        System.out.println("====DADOS DA BICICLETA====");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelonum);
        System.out.println("Cor: "+cor);
        System.out.println("Freio: "+freio);
        System.out.println("Marcha: "+marcha);
        System.out.println("Aro:"+aro);
        
        
    }
}
