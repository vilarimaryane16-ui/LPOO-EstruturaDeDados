/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacachorro;

/**
 *
 * @author Aluno
 */
public class EstruturaCachorro {

    public static void main(String[] args) {
       Cachorro cachorro1 = new Cachorro();
       cachorro1.nome="Bolinha";
       cachorro1.cor="Caramelo";
       cachorro1.idade=8;
       cachorro1.sexo="Femea";
       cachorro1.raça="SRD";
       cachorro1.peso=10;
       cachorro1.porte="Pequeno";
       cachorro1.mostrarInformacoes();
       
       Cachorro cachorro2 = new Cachorro();
       cachorro2.nome="Pantera";
       cachorro2.cor="Preta";
       cachorro2.idade=2;
       cachorro2.sexo="Femea";
       cachorro2.raça="SRD";
       cachorro2.peso=16.5;
       cachorro2.porte="Medio";
       cachorro2.mostrarInformacoes();
       
    }
}
