package ldp1n;

import javax.swing.JOptionPane;

public class receba_10_n_e_mostre_media {

    public static void main(String[] args) {
        String var;
        float n, res=0;
        for (int i = 0; i <= 9; i++) {
            var = JOptionPane.showInputDialog("Digite um número:");
            n = Float.parseFloat(var);
            res=res+n/10;
            System.out.println("i="+i);
            System.out.println(res);
        }
        JOptionPane.showMessageDialog(null,res);
    }
}
