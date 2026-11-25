/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public class SmartTV extends Dispositivo implements Conectavel, Atualizavel{
    int canalAtual;
    
    public SmartTV(String nomeDisp, boolean ligadoDisp, int canalAtual) {
        super(nomeDisp, ligadoDisp);
        this.canalAtual=canalAtual;
    }

    @Override
    public void executarFuncaoPrincipal() {
        if (super.Ligado()==true) {
            System.out.println("SmartTV "+super.getNome()+" reproduzindo canal "+this.canalAtual);                    
        }else{
            System.out.println("A SmartTV esta desligada");
        }
    }

    @Override
    public void atualizarFirmware(String novaVersao) {
        System.out.println("Atualizando sistema da TV "+super.getNome()+" para a versao "+novaVersao);
    }
    
}
