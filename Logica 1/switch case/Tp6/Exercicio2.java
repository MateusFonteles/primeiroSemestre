/*
 * Escreva um programa que recebe três notas de um aluno, calcula a média 
e checa se passou direto, ficou de recuperação ou foi reprovado na matéria. 
Conforme a seguinte regra: Nota 7 ou mais: passou direto - Entre 5 e 7: 
tem direito de fazer uma prova de recuperação - Abaixo de 5: reprovado direto.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        float n1, n2, n3;
        float media;
        String var;
        
        var = JOptionPane.showInputDialog("Digite a 1a nota:");
        n1=Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite a 2a nota:");
        n2=Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite a 3a nota:");
        n3=Float.parseFloat(var);
        
        media=(n1+n2+n3)/3;
        
        if (media>=7){
            JOptionPane.showMessageDialog(null, "Aprovado "+media);
        } else{
            if(media<5){
                JOptionPane.showMessageDialog(null, "Reprovado "+media);
            }else{
                JOptionPane.showMessageDialog(null, "Recuperação "+media);
            }
        }
    }
}
