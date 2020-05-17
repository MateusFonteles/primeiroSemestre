/*
 * Escreva um programa que recebe o sexo de um aluno e escreve Masculino
para 'M', Feminino para 'F' e "Opção inválida" para qualquer outro
valor digitado.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        String op;
        
        op=JOptionPane.showInputDialog("Digite o sexo do aluno:(mas / fem)");
        
        switch(op){
            case "mas":
                JOptionPane.showMessageDialog(null, "Masculino");
                break;
            case "fem":
                JOptionPane.showMessageDialog(null, "Feminino");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
