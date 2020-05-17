/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateus
 */

import java.io.PrintStream;
//import java.util.Scanner;
public class teste {
        
    public static void main(String[] args) {
        
        String[] cartasD = {"Foso", "Capilla", "Sótano", "Aldea", "Leñadores",
"Canciller", "Taller", "Burócrata", "Ladrón", "Banquete", "Prestamista",
"Milicia", "Herrería", "Espía", "Salón del trono", "Remodelar",
"Biblioteca", "Bruja", "Festival", "Laboratorio", "Mercado", "Mina",
"Sala del consejo", "Aventurero", "Jardines"};
        
    int selecao = (int)(Math.random()*25);  
    System.out.println(cartasD[selecao]);
        
    }
}
