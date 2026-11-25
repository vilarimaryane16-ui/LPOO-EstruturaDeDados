/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaepolimorfismo;

/**
 *
 * @author Aluno
 */
public class MotosHerancaePolimorfismo extends Veiculos {   
   private int cilindradas;
    
    //metodo construtor
    public MotosHerancaePolimorfismo (String marcaMoto, String modeloMoto, double precoMoto, int cilindradasMoto){
        super(marcaMoto,modeloMoto,precoMoto);
        cilindradas=cilindradasMoto;
    }
    
   @Override
    public void exibirFicha(){
        super.exibirFicha();
        System.out.println("Cilindradas: "+getCilindradas());
    }
    
   @Override
    public void acelerar(){
        super.setVelocidadeAtual(super.getVelocidadeAtual()+20);
        System.out.println(super.getModelo()+ "Acelerou! Velocidade: "+super.getVelocidadeAtual()+"km/h" );
    }
    
   @Override
    public void frear(){
        
        if(super.getVelocidadeAtual()>0){
        super.setVelocidadeAtual(super.getVelocidadeAtual()-10);
        System.out.println(super.getModelo()+"Freou! Velocidade: "+super.getVelocidadeAtual()+"km/h" );
        System.out.println("-------- ATENCAO PILOTO: Freio traseiro e dianteiro acionados simultaneamente com seguranca!!! ------------");
        }else{
            System.out.println(super.getModelo()+ "Sua Moto esta parada !!!!");
        }
          
    }
    
    public int getCilindradas() {
        return cilindradas;
    }

    /**
     * @param cilindradas the cilindradas to set
     */
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
