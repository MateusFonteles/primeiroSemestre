
package ldp1n;

import javax.swing.JOptionPane;

public class exercicios {
    public static void main(String[]args) {
        
        /*Leia dois números e mostre o maior*/
        
        int n1, n2;
        String var;
        
        var = JOptionPane.showInputDialog("Digite o primeiro número.");
        n1 = Integer.parseInt(var);
        var = JOptionPane.showInputDialog("Digite o segundo número.");
        n2 = Integer.parseInt(var);
                
        if (n1>n2) {
            JOptionPane.showMessageDialog(null,"O maior é "+n1);}
        else{
            JOptionPane.showMessageDialog(null, "O maior é "+n2);
        }
        
    }
    
}
