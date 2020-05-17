package ldp1n;

import javax.swing.JOptionPane;

public class dowhile_recebe_sexo_informa_n_de_homens_mulheres_invalidos {

    public static void main(String[] args) {

        String var;
        int mas = 0, fem = 0, inv = 0;

        do {
            var = JOptionPane.showInputDialog("Digite \nm para masculino \nf para feminino");
            switch (var) {
                case "m":
                case "M":
                    mas++;
                    break;
                case "f":
                case "F":
                    fem++;
                    break;
                case "x":
                case "X":
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                default:
                    inv++;
            }
        } while (!var.equals("x"));
        JOptionPane.showMessageDialog(null, "Masculino="+mas+"\nFeminino="+fem+"\nInválidos="+inv);
    }
}
