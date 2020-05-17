
package ldp1n;

import javax.swing.JOptionPane;

public class Escrever_pares_ate_n {
    public static void main(String[] args) {
        
        String var;
        int n, res;
        
        var=JOptionPane.showInputDialog("Digite um número par");
        n=Integer.parseInt(var);
        
        for(int i=0; i<=n; i+=2){
                      System.out.println(i);
      }
    }
}
