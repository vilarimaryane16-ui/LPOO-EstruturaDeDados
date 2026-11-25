/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author Aluno
 */
public class HerancaePolimorfismo {

    public static void main(String[] args) {
      CarrosHerancaePolimorfismo onix = new CarrosHerancaePolimorfismo("Chevrolet", "Onix ", 85.000, 5);
   
      MotosHerancaePolimorfismo hondaCG = new MotosHerancaePolimorfismo("Honda", "Titan 125 ", 16.000, 160);
      
      CaminhaoHeranca volvo = new CaminhaoHeranca("Volvo", "FH 540", 600.000, 6);
      
    hondaCG.acelerar();
    hondaCG.acelerar(); 
    hondaCG.acelerar();
    hondaCG.frear();
    hondaCG.frear();
    hondaCG.frear();
    hondaCG.frear();
    hondaCG.frear();
    hondaCG.exibirFicha();
    
    
    onix.acelerar();
    onix.acelerar();
    onix.acelerar();
    onix.acelerar();
    onix.frear();
    onix.frear();
    onix.frear();
    onix.frear();
    onix.frear();
    onix.frear();
    onix.exibirFicha();
    
    
    volvo.acelerar();
    volvo.acelerar();
    volvo.acelerar();
    volvo.acelerar();
    volvo.acelerar();
    volvo.frear();
    volvo.frear();
    volvo.frear();
    volvo.frear();
    volvo.exibirFicha();
    }
      
}
