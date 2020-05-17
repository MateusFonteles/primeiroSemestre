package ldp1n;

import javax.swing.JOptionPane;

public class dowhile_recebe_varios_n_inform_soma_media_qtd_de_recebidos {
    public static void main(String[] args) {
        
        String var;
        float n, soma=0, media;
        int cont=-1;
        
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
    JOptionPane.showMessageDialog(null, "media= "+media+"\nsoma= "+soma+"\nN de números= "+cont);
        }
        }
    
    
}
