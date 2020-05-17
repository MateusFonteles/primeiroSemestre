/*
 * Escreva um programa que receba três inteiros mostra em ordem decrescente.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        //int maior, menor;
        String var;
        
        var = JOptionPane.showInputDialog("Digite o 1o valor:");
        n1 =  Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o 2o valor:");
        n2 =  Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o 3o valor:");
        n3 =  Integer.parseInt(var);
        
        if (n1>n2 && n1>n3){
            if(n2>n3){
                JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n1+"; "+n2+"; "+n3);
            }else{
                JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n1+"; "+n3+"; "+n2);
            }
        }else{
            if(n2>n1 && n2>n3){
                if(n1>n3){
                    JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n2+"; "+n1+"; "+n3);
                }else{
                    JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n2+"; "+n3+"; "+n1);
                }
            }else
                if(n1>n2){
                    JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n3+"; "+n1+"; "+n2);
                }else{
                    JOptionPane.showMessageDialog(null, "Ordem decrescente: "+n3+"; "+n2+"; "+n1);
                }
        }
    }
}
