/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provalpoo;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {        
        
        SmartTV tcl = new SmartTV("Smart TV TCL 43", true, 80);
        
        LampadaInteligente midea = new LampadaInteligente("Lampada Midea", true, "Ciano");
        
        tcl.setLigado(true);
        tcl.conectarWifi("admin", "admin123", 15);
        tcl.atualizarFirmware("v3,14");
        
        midea.setLigado(true);
        midea.conectarWifi("admin", "admin123", 80);                
        midea.ativarModoEco();
        
        Dispositivo[] dispositivos ={tcl, midea};
               
        
        for (int i = 0; i < dispositivos.length; i++) {            
            dispositivos[i].executarFuncaoPrincipal();
        }
    }   
}