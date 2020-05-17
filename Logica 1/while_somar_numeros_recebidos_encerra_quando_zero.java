
package ldp1n;

import javax.swing.JOptionPane;

public class while_somar_numeros_recebidos_encerra_quando_zero {
    public static void main(String[] args) {
        String var;
        float n=0, soma=0;
 
        var=JOptionPane.showInputDialog("Digite um número:");
        n=Float.parseFloat(var);
        while(n!=0){
              soma=n+soma;
               var=JOptionPane.showInputDialog("Digite um número:");
        n=Float.parseFloat(var);
        
       
       
            System.out.println("n="+n+"\nsoma="+soma);
        }
        JOptionPane.showMessageDialog(null, "Soma= "+soma);
        
        
    }
}
