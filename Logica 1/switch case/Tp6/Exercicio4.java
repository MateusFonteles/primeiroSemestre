/*
 * Escreva um programa em Java que leia o lado de um quadrado e a
opção de calculo: A-área ou P-perímetro. Mostre o resultado solicitado na opção.
 */
package Tp6;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        int lado, res;
        String var;
        char op;
        
        var=JOptionPane.showInputDialog("Digite o lado do quadrado:");
        lado=Integer.parseInt(var);
        var=JOptionPane.showInputDialog("Digite a opção de calculo: A-área ou P-perímetro:");
        op=var.charAt(0);
        
        switch(op){
            case 'A':
                res=lado*lado;
                JOptionPane.showMessageDialog(null, "A área é: "+res);
                break;
            case 'P':
                res=lado*4;
                JOptionPane.showMessageDialog(null, "O perimetro é: "+res);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção de calculo e inválida");
        }
        
        if(op=='A'){
            res=lado*lado;
            JOptionPane.showMessageDialog(null, "IF A área é: "+res);
        }else{
            if(op=='P'){
                res=lado*4;
                JOptionPane.showMessageDialog(null, "IF O perimetro é: "+res);
            }else{
                JOptionPane.showMessageDialog(null, "IF Opção de calculo e inválida");
            }
        }
    }
}
