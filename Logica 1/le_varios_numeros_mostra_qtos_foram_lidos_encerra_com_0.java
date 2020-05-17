
package ldp1n;

import javax.swing.JOptionPane;

public class le_varios_numeros_mostra_qtos_foram_lidos_encerra_com_0 {
    public static void main(String[] args) {
        String var;
        float n=1;
        int i=0;
        
        while(n!=0){
            var=JOptionPane.showInputDialog("Digite um número");
            n=Float.parseFloat(var);
            i++;
            
        }
        JOptionPane.showMessageDialog(null, i);
    }
}
