/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animal;

/**
 *
 * @author Aluno
 */
public abstract class Animal {
    private String raca;
    private String porte;
    private double peso;
    private String cor;
    
    public Animal (String racaAnimal, String porteAnimal, double pesoAnimal, String corAnimal){
        this.raca=racaAnimal;
        this.porte=porteAnimal;
        this.peso=pesoAnimal;
        this.cor=corAnimal;
    }
    
    //Metodo abstrato que a classe filha deveria implementar
    public abstract void emitirSom();
    
    public void exibirInformacoes(){
        System.out.println("===========================");
        System.out.println("RACA: "+this.raca);
        System.out.println("PORTE: "+this.porte);
        System.out.println("PESO KG "+this.peso);
        System.out.println("COR: "+this.cor);
        System.out.println("=============================");
    }
    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the porte
     */
    public String getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}
