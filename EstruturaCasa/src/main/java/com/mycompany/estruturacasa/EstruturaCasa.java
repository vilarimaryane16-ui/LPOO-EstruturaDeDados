/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturacasa;

/**
 *
 * @author Aluno
 */
public class EstruturaCasa {

    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.cor="Branco";
        casa1.rua="Marechal Deodoro";
        casa1.numero=219;
        casa1.construcacao="Madeira";
        casa1.comodos=4;
        casa1.regiao="Cidade";
        casa1.mostrarInformacoes();
        
        Casa casa2 = new Casa();
        casa2.cor="Branco";
        casa2.rua="Taquaruçu";
        casa2.numero=16;
        casa2.construcacao="Alvenaria";
        casa2.comodos=4;
        casa2.regiao="Sitio";
        casa2.mostrarInformacoes();
        
    }
}
