/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recintoanimal;

/**
 *
 * @author Aluno
 */
public class ControleDeAnimais {

    public static void main(String[] args) {
        RecintoAnimal animal1 = new RecintoAnimal ("2438", "Ave", " Terezinha" );
        RecintoAnimal animal2 = new RecintoAnimal ("05896", "Mamifero", " Joao" );
        animal1.mostrarInformacoes();
        animal2.mostrarInformacoes();
        
        animal2.alimentarAnimal(30);
        animal2.limparRecinto();
        animal2.mudarJaula("76439");
        animal2.mostrarInformacoes();
    }
}
