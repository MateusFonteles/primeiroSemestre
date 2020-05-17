package ldp1n;

import javax.swing.JOptionPane;

public class exercicio7 {

    public static void main(String[] arg) {

        /* Leia dois número e a operação a ser realizada (a-adição, s-subtração, m-multiplicação e d-divisão)
        e mostre o resultado da operação indicada */
        String var;
        char op;
        float n1, n2, res;

        var = JOptionPane.showInputDialog("Digite o primeiro número:");
        n1 = Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite o segundo número:");
        n2 = Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite a inicial da operação a ser realizada:");
        op = var.charAt(0);

        if (op == 'a') {
            res = n1 + n2;
            JOptionPane.showMessageDialog(null, res);
        } else {
            if (op == 's') {
                res = n1 - n2;
                JOptionPane.showMessageDialog(null, res);
            } else {
                if (op == 'm') {
                    res = n1 * n2;
                    JOptionPane.showMessageDialog(null, res);
                } else {
                    if (op == 'd') {
                        res = n1 / n2;
                        JOptionPane.showMessageDialog(null, res);
                    } else {
                        if (op == 'p') {
                            res = (float) Math.pow(n1, n2);
                            JOptionPane.showMessageDialog(null, res);
                        }
                    }
                }
            }
        }
    }
}
