
package ldp1n;

import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[]arg){
        
        /*calcule media de duas notas e diga se aprovado ou não. Média 6.*/
        
        float n1, n2, media;
        String var;
        
        var = JOptionPane.showInputDialog("Digite a primeira nota.");
        n1 = Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite a segunda nota.");
        n2 = Float.parseFloat(var);
            media=(n1+n2)/2;
        if (media==6 || media>6) {
            JOptionPane.showMessageDialog(null, "Aprovado");
    }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado");
                                }            
        
                
    }
}
