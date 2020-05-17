
package ldp1n;

import javax.swing.JOptionPane;

public class while_escreve_soma_de_1_a_n {
    public static void main(String[] args) {
        
        String var;
        int n, soma=0, i=0;
                
        var=JOptionPane.showInputDialog("Digite um valor:");
        n=Integer.parseInt(var);
        while(i<n){
           i++;
           soma=i+soma;        
            System.out.println("i="+i+"\nsoma="+soma);
        }
                        JOptionPane.showMessageDialog(null, soma);
    }
    
}
