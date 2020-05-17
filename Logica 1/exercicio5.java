package ldp1n;

import javax.swing.JOptionPane;

public class exercicio5 {

    public static void main(String[] arg) {

        /*leia qq número e diga se é positivo, negativo ou zero junto com se é par ou impar*/
        String var;
        Float n1;

        var = JOptionPane.showInputDialog("Digite um número.");
        n1 = Float.parseFloat(var);
        if (n1 == 0) {
            JOptionPane.showMessageDialog(null, "ZERO");
        } else {
            if (n1 > 0) {
                if (n1 % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O número é positivo e par.");
                } else {
                    JOptionPane.showMessageDialog(null, "O número é positivo e impar.");
                }
            } else {
                if (n1 % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "O número é negativo e par");
                } else {
                    JOptionPane.showMessageDialog(null, "O número é negativo e impar.");
                }
            }
        }
    }
}
