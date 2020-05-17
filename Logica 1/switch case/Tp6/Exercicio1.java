/*
 * Escreva um programa que receba três inteiros e diga qual deles
é o maior e qual o menor.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        int n1, n2, n3;
        int maior, menor;
        String var;
        
        var = JOptionPane.showInputDialog("Digite o 1o valor:");
        n1 =  Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o 2o valor:");
        n2 =  Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o 3o valor:");
        n3 =  Integer.parseInt(var);
        
        if(n1>n2){
            maior=n1;
            menor=n2;
        }else{
            maior=n2;
            menor=n1;
        }
        if(n3>maior){
            maior=n3;
        }else{
            if(n3<menor){
                menor=n3;
            }
        }
        JOptionPane.showMessageDialog(null, "maior="+maior+"\nmenor="+menor);
    }
}
