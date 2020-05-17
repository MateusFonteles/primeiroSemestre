
package ldp1n;

import javax.swing.JOptionPane;

public class while_soma_dos_pares_até_n {
    public static void main(String[] args) {
        
        String var;
        int n, i=0,  soma=0;
        
        var=JOptionPane.showInputDialog("Digite um número:");
        n=Integer.parseInt(var);
        
        while(i<n){
             i=i+2;
            soma=i+soma;
         
        System.out.println("soma="+soma+"\ni="+i);
        }
        JOptionPane.showMessageDialog(null, soma);
                
    }
    
}
