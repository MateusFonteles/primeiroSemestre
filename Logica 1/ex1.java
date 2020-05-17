
package ldp1n;

import javax.swing.JOptionPane;


public class ex1 {
public static void main(String[]arg){
    
    char op;
    String var;
    
    var = JOptionPane.showInputDialog("Digite a opção desejada: \nI - inclusão\nA - alteração\nE - exclusão\nC- consulta");
    op = var.charAt(0);
    
    switch(op){
        case 'I':
        JOptionPane.showMessageDialog(null, "Inclusão");
        break;
        
        case 'A':
            JOptionPane.showMessageDialog(null,"Alteração");
        break;
                
        case 'E':
            JOptionPane.showMessageDialog(null,"Exclusão");
            break;
                 
        case 'C':
            JOptionPane.showMessageDialog(null, "Consulta");
            break;
            
        default:
            JOptionPane.showMessageDialog(null, "Opção inválida");
                
        
        
    }
    
           
}    
}
