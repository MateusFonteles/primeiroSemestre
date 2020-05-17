
package ldp1n;

import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[]arg){
        
        /*Ler percentual de faltas e duas notas, aprovado se nota 6 ou mais e menos que 20% de faltas. */
        
    String var;
    float n1, n2, faltas, media;
        
        var = JOptionPane.showInputDialog("Digite a porcentagem de faltas.");
        faltas = Float.parseFloat(var);
        
        var = JOptionPane.showInputDialog("Digite a primeira nota.");
        n1 = Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite a segunda nota.");
        n2 = Float.parseFloat(var);
        
        media=(n1+n2)/2;
        
    if (media>=6 && faltas<20){
        JOptionPane.showMessageDialog(null,"Aprovado");
    }
    else {
        JOptionPane.showMessageDialog(null, "Reprovado");
    }
        
        
        
        
    }
    
}
