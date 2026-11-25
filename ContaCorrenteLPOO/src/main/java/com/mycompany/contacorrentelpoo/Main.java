/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrentelpoo;

/**
 *
 * @author Aluno
 */
public class Main {
    
    public static void main(String[] args) {
        ContaCorrenteLPOO conta1 = new ContaCorrenteLPOO(1234567, "Augusto Canesso", "029.287.077-03", 12345);
        //CRIAR CONTA PRECISA DE NUMERO, TITULAR, SALDO,
        //CPF, SENHA
        //REGRA BANCO SÃO VICENTE
        //SALDO DE 100 REAIS 
        conta1.setTitular("Augusto Canesso Babiuk");
        conta1.setSenha(54321);
        
        conta1.depositar(100);
        conta1.sacar(50, 54321);
        conta1.mostrarInformacoes();
        
       ContaCorrenteLPOO conta2 = new ContaCorrenteLPOO(2145, "Katia", "520.789.1555", 857795);
       
       conta2.transferir(50, conta2);
       conta2.mostrarInformacoes();
       conta1.mostrarInformacoes();
    }
    
        
    
}
