
package ldp1n;

import javax.swing.JOptionPane;

public class leia_5_n_mostre_o_maior {
    public static void main(String[] args) {
        String var;
        float n, maior;
          var=JOptionPane.showInputDialog("Digite um número:");
            n=Float.parseFloat(var);    
            maior=n;
        for(int i=0; i<=3; i++){
            var=JOptionPane.showInputDialog("Digite um número:");
            n=Float.parseFloat(var);        
            if(n>maior){
                maior=n;
            }
                            System.out.println(maior);

        }
    }
    
    
}
