package ldp1n;

import javax.swing.JOptionPane;

public class recebe_10_n_mostra_maior_e_menor {

    public static void main(String[] args) {
        String var;
        float n1, n2, maior, menor;

        var = JOptionPane.showInputDialog("Digite um número");
        n1 = Float.parseFloat(var);
        var = JOptionPane.showInputDialog("Digite um número");
        n2 = Float.parseFloat(var);
        if(n1>n2){
            maior=n1;
            menor=n2;
        }else{
            maior=n2;
            menor=n1;
        }
        for (int i = 0; i <= 7; i++) {
            var = JOptionPane.showInputDialog("Digite um número");
            n1=Float.parseFloat(var);
            if(n1>maior){
                maior=n1;
            }
            if(n1<menor){
                menor=n1;
            }
        }
        System.out.println("Maior="+maior);
        System.out.println("Menor="+menor);
    }
}
