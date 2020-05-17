
package ldp1n;

import javax.swing.JOptionPane;

public class while_ler_varios_n_e_dar_media_finaliza_em_0 {
    public static void main(String[] args) {
        String var;
        float n=1, media=0, soma=0;
        int i=0;
        while(n!=0){
            var=JOptionPane.showInputDialog("Digite um número:");
            n=Float.parseFloat(var);
           
            soma=soma+n;
            media=soma/i;
            i++;
        }
        JOptionPane.showMessageDialog(null,media);
    }
}
