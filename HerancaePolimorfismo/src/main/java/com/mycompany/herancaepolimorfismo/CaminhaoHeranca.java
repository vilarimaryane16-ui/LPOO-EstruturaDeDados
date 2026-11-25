/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author Aluno
 */
public class CaminhaoHeranca extends Veiculos {
    private int quantidadeDeEixos;
    
    //metodo construtor 
    public CaminhaoHeranca(String marcaCaminhao, String modeloCaminhao, double precoCaminhao, int quantidadeDeEixosCaminhao) {
        super(marcaCaminhao, modeloCaminhao, precoCaminhao);
        quantidadeDeEixos = quantidadeDeEixosCaminhao;
    }
    @Override
    public void acelerar(){
        super.setVelocidadeAtual(super.getVelocidadeAtual()+30);
        System.out.println(super.getModelo()+ "Acelerou! velocidade: "+ super.getVelocidadeAtual()+ "km/h");
        
    }
    
    @Override
    public void frear(){
       if (super.getVelocidadeAtual()>0){
       super.setVelocidadeAtual(super.getVelocidadeAtual()-5);
       System.out.println(super.getModelo()+"Freou! Velocidade: "+super.getVelocidadeAtual()+"km/h" );
       }else{
            System.out.println(" Seu veiculo esta totalmente parado!!! :(  "); 
          }        
    }
    /**
     * @return the quantidadeDeEixos
     */
    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    /**
     * @param quantidadeDeEixos the quantidadeDeEixos to set
     */
    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

  

}
