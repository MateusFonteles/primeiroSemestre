
package ldp1n;

import javax.swing.JOptionPane;

public class le_inteiros_finaliza_quando_0 {
    public static void main(String[] args) {
        
        String var;
        int n=1;
        
        while(n!=0){
            var=JOptionPane.showInputDialog("Digite um número:");
            n=Integer.parseInt(var);
        }
        JOptionPane.showMessageDialog(null, "YOU LOOSE!");
    }
    
}
