
package ldp1n;

import javax.swing.JOptionPane;

public class recebe_10_numeros_mostra_soma {
    public static void main(String[] args) {
        String var;
        float n, res=0;
        for(int i = 0; i<=9; i++){
            var=JOptionPane.showInputDialog("Digite um número:");
            n=Float.parseFloat(var);
            res=res+n;
            System.out.println("i="+i);
            System.out.println(res);
        }
    }
}
