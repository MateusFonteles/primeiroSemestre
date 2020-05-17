
package ldp1n;

import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[]arg){
        
        /*Leia 3 valores e mostre a soma somente se algum for =< 0 */
        
        String var;
        float n1, n2, n3, soma;
        
    var = JOptionPane.showInputDialog("Digite o primeiro valor.");
    n1 = Float.parseFloat(var);
    var = JOptionPane.showInputDialog("Digite o segundo valor.");
    n2 = Float.parseFloat(var);
    var = JOptionPane.showInputDialog("Digiteo terceito valor.");
    n3 = Float.parseFloat(var);
    
    soma=n1+n2+n3;
    
    if (n1>0 && n2>0 && n3>0){
        JOptionPane.showMessageDialog(null, "Não há números negativos ou zero.");
    }
    else {
        JOptionPane.showMessageDialog(null, soma);
    }
    }
    
}
