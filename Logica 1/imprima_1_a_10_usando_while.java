
package ldp1n;

import javax.swing.JOptionPane;

public class imprima_1_a_10_usando_while {
    public static void main(String[] args) {
        String var;
        int i=0;
        
        while(i<=9){
            i++;
             System.out.println("i="+i);
             JOptionPane.showMessageDialog(null, i);
        }
    }
    
}
