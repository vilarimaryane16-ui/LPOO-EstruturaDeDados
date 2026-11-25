package com.mycompany.sistemarecursoshospitalar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String nome;
    private String CPF;
    private double salario;
 
    public Pessoa( String nomeCompleto, String Cpf, double salarioBase){
       nome=nomeCompleto;
       CPF=Cpf;
       salario=salarioBase;
    }
    
    public void exibirFicha(){
        System.out.println("==== DADOS DO PROFISSIONAL ====");
        System.out.println("Nome : "+getNome());
        System.out.println("CPF : "+getCPF());
        System.out.println("Salario : "+getSalario());
        System.out.println("================================");
}
    public double calcularSalarioFinal(){
        return salario;
        
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

