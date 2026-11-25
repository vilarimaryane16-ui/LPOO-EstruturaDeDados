/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturasgatos;

/**
 *
 * @author Aluno
 */
public class EstruturasGatos {

    public static void main(String[] args) {
        ClassGatos gato1 = new ClassGatos();
        gato1.nome="Bela";
        gato1.raça="Siâmes";
        gato1.cor="cinza";
        gato1.sexo="Femêa";
        gato1.idade=15;
        gato1.status="Viva";
        gato1.mostrarInformacoes();
        
        ClassGatos gato2 = new ClassGatos();
        gato2.nome="Chaninho";
        gato2.raça="SRD";
        gato2.cor="Branco";
        gato2.sexo="Macho";
        gato2.status="Morto";
        gato2.mostrarInformacoes();
       
                  
    }
}
