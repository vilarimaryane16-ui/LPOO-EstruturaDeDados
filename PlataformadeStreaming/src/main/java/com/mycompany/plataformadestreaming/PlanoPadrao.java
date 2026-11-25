/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.plataformadestreaming;

/**
 *
 * @author Aluno
 */
public class PlanoPadrao extends ContasStreaming {
    private boolean resolucaoHD;
    private int numDeUsuarios;

    public PlanoPadrao(String nomeTitular, String emailCadastro, int NumerodeUsuarios) {
        super(nomeTitular, emailCadastro);
        this.resolucaoHD=true;
        this.numDeUsuarios=NumerodeUsuarios;
    }

    @Override
    public void configurarPlano() {
      super.setLimiteDeTelas(2);
      this.resolucaoHD=false;
    }

    @Override
    public double calcularMensalidade() {
        return super.getValorMensalidade()+(this.numDeUsuarios*10);
    }

    @Override
    public void exibirFichaConta() {
        System.out.println("===== PERFIL STREAMPLAY PADRAO =====");
        System.out.println("NOME DO TITULAR "+super.getNome());
        System.out.println("EMAIL "+super.getEmail());        
        System.out.println("TELAS ATIVAS "+super.getLimiteDeTelas());        
        System.out.println("SUPORTE HD "+this.resolucaoHD);
        System.out.println("VALOR MENSALIDADE R$ "+this.calcularMensalidade());
    }

    /**
     * @return the resolucaoHD
     */
    public boolean isResolucaoHD() {
        return resolucaoHD;
    }

    /**
     * @param resolucaoHD the resolucaoHD to set
     */
    public void setResolucaoHD(boolean resolucaoHD) {
        this.resolucaoHD = resolucaoHD;
    }

    /**
     * @return the numDeUsuarios
     */
    public int getNumDeUsuarios() {
        return numDeUsuarios;
    }

    /**
     * @param numDeUsuarios the numDeUsuarios to set
     */
    public void setNumDeUsuarios(int numDeUsuarios) {
        this.numDeUsuarios = numDeUsuarios;
    }
}
