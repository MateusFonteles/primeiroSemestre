/*
 * Escreva um programa que recebe um número e mostra o dia da semana
correspondente: 1-Domingo; 2-Segunda-feira; 3-Terça-feira; 4-Quarta-feira;
5-Quinta-feira; 6-Sexta-feira; 7-Sábado.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        String var;
        int dia;
        
        var=JOptionPane.showInputDialog("Digite o numero do dia da semana:");
        dia=Integer.parseInt(var);
        
        switch(dia){
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Férias");
        }
    }
}
