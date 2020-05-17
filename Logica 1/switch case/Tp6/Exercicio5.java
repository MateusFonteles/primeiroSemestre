/*
 * Escreva um programa que recebe três retas de uma figura e dia se estas
retas formam um triangulo. Em caso positivo diga se o triângulo é equilátero,
isoceles ou escaleno.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String var;
        float r1, r2, r3;
        
        var=JOptionPane.showInputDialog("Digite a 1a reta:");
        r1=Float.parseFloat(var);
        var=JOptionPane.showInputDialog("Digite a 2a reta:");
        r2=Float.parseFloat(var);
        var=JOptionPane.showInputDialog("Digite a 3a reta:");
        r3=Float.parseFloat(var);
        
        if((r1+r2)>r3 && (r2+r3)>r1 && (r3+r1)>r2){
            if(r1==r2 && r1==r3){
                JOptionPane.showMessageDialog(null, "É triangulo equilatero");
            } else{
                if(r1!=r2 && r1!=r3 && r2!=r3){
                    JOptionPane.showMessageDialog(null, "É triangulo escaleno");
                } else{
                    JOptionPane.showMessageDialog(null, "É triangulo isoceles");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "não é triangulo");
        }
        
    }
}
