
package ldp1n;

import javax.swing.JOptionPane;

public class comandowhile {
    public static void main(String[] args) {
        String var;
        int i=0;
        while(i<=10){
            var=JOptionPane.showInputDialog("Digite um valor");
            i=Integer.parseInt(var);
        }
        JOptionPane.showMessageDialog(null, "Tchau!");
    }
    
}
