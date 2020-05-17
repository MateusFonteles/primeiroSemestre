package ldp1n;

import javax.swing.JOptionPane;

public class cartas_crescente_ou_decrescente {

    public static void main(String[] args) {
        //Entrada
//A entrada consiste de uma única linha que contém as cinco cartas da sequência. Os valores das cartas são representados por inteiros entre 1 e 13. As cinco cartas têm valores distintos.
//Saída
//Seu programa deve produzir uma única linha, contendo um único caractere maiúsculo: "C" caso a sequência dada esteja ordenada crescentemente, "D" se estiver ordenada decrescentemente, ou "N" caso contrário.
//Restrições
//o valor de cada carta é um inteiro entre 1 e 13.//

        String var;
        int c1, c2, c3, c4, c5;

        var = JOptionPane.showInputDialog("Digite o valor da primeira carta");
        c1 = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o valor da segunda carta");
        c2 = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o valor da terceira carta");
        c3 = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o valor da quarta carta");
        c4 = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o valor da quinta carta");
        c5 = Integer.parseInt(var);
        if (c1 < c2 && c2 < c3 && c3 < c4 && c4 < c5) {
            JOptionPane.showMessageDialog(null, "C");
        } else {
            if (c5 < c4 && c4 < c3 && c3 < c2 && c2 < c1) {
                JOptionPane.showMessageDialog(null, "D");
            } else {
                if (c1 < 1 || c1 > 13 || c2 < 1 || c2 > 13 || c3 < 1 || c3 > 13 || c4 < 1 || c4 > 13 || c5 < 1 || c5 > 13) {
                    JOptionPane.showMessageDialog(null, "Cartas inválidas");
                } else {
                    JOptionPane.showMessageDialog(null, "N");
                }
            }
        }
    }
}
