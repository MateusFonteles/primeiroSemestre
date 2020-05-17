
package ldp1n;

import javax.swing.JOptionPane;

public class for_soma_numeros_ate_n {
    public static void main(String[] args) {
        String var;
        int n, res;
        var=JOptionPane.showInputDialog("Digite um número:");
        n=Integer.parseInt(var);
        for(int i=0; i<=n; i++) {
            res=i+i;
            JOptionPane.showMessageDialog(null, res);
            System.out.println("i="+i);
            System.out.println(res);
            JOptionPane.showMessageDialog(null, res);
        }       
    }
    
}
