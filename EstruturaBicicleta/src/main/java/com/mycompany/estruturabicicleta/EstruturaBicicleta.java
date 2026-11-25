package com.mycompany.estruturabicicleta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Aluno
 */
public class EstruturaBicicleta {

    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.marca="Caloi";
        bicicleta1.modelonum=29;
        bicicleta1.cor="Azul";
        bicicleta1.freio="Disco";
        bicicleta1.marcha=18;
        bicicleta1.aro=26;
        bicicleta1.mostrarInformacoes();
        
        Bicicleta bicicleta2 = new Bicicleta();
        bicicleta2.marca="Oggi";
        bicicleta2.modelo="Mountain Bike";
        bicicleta2.cor="Preto";
        bicicleta2.freio="V-Brake";
        bicicleta2.marcha=24;
        bicicleta2.aro=29;
        bicicleta2.mostrarInformacoes();
        
    }
}
