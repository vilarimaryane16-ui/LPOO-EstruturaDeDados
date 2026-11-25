/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author Aluno
 */
public class CarrosHerancaePolimorfismo extends Veiculos {
    
    private int num_Portas;
    
    //metodo construtor
    public CarrosHerancaePolimorfismo (String marcaCarro, String modeloCarro, double precoCarro, int numPortas ){
       super(marcaCarro, modeloCarro, precoCarro);
        num_Portas=numPortas;
        
    }
    
    @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("Numero de Portas: "+getNum_Portas());
    /**
     * @return the marca
     */
    }
    @Override
    public void acelerar(){
        super.setVelocidadeAtual(super.getVelocidadeAtual()+30);
        System.out.println(super.getModelo()+ "Acelerou! velocidade: "+ super.getVelocidadeAtual()+ "km/h");
    }
    
    @Override
    public void frear(){
        if (super.getVelocidadeAtual()>0){
            super.setVelocidadeAtual(super.getVelocidadeAtual()-30);
            System.out.println(super.getModelo()+"Freou! Velocidade: "+super.getVelocidadeAtual()+"km/h" );
            
          }else{
              System.out.println(" Seu veiculo esta totalmente parado!!! :(  "); 
          }                               
    }
       
        
 
    
    public int getNum_Portas() {
        return num_Portas;
    }

    /**
     * @param num_Portas the num_Portas to set
     */
    public void setNum_Portas(int num_Portas) {
        this.num_Portas = num_Portas;
    }
}
