
package ldp1n;

import javax.swing.JOptionPane;

public class dowhile_ler_n__numeros_imprime_media_finaliza_com_0 {
    public static void main(String[] args) {
        
        String var;
        float n, soma=0, media, cont=-1;
        
        do{
            var=JOptionPane.showInputDialog("Digite um número");
            n=Float.parseFloat(var);
            soma=soma+n;
            cont++;
                    
        }while(n!=0);
        if(cont==0){
            JOptionPane.showMessageDialog(null, "Erro de divisão");
        }else{
    media=soma/cont;
    JOptionPane.showMessageDialog(null, media);
        }
        }
    
    
}
