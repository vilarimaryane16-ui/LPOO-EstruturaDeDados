/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Aluno
 */
public class Cachorro extends Animal{
  private boolean adestramento;

    public Cachorro(String racaAnimal, String porteAnimal, double pesoAnimal, String corAnimal) {
        super(racaAnimal, porteAnimal, pesoAnimal, corAnimal);
        this.adestramento=false;
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU AU AU");
    }
    
  @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Adestratamento "+this.adestramento);
        this.emitirSom();
    }
    
    public void adestramento(){
        setAdestramento(true);
    }

    /**
     * @return the adestramento
     */
    public boolean isAdestramento() {
        return adestramento;
    }

    /**
     * @param adestramento the adestramento to set
     */
    public void setAdestramento(boolean adestramento) {
        this.adestramento = adestramento;
    }

   
  
}
