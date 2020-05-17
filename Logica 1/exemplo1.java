/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldp1n;

import javax.swing.JOptionPane;

public class exemplo1 {
    public static void main(String[]args) {
        
    int n1;
    String var;

    var = JOptionPane.showInputDialog("Digite um número.");
    n1 = Integer.parseInt(var);

    if (n1>0) 
        {JOptionPane.showMessageDialog(null, "Positivo");
    }
        else {
    if (n1<0) 
        {JOptionPane.showMessageDialog(null, "Negativo");
    } 
        else 
    {JOptionPane.showMessageDialog(null, "Zero");
            }
        }
    }
    
}



