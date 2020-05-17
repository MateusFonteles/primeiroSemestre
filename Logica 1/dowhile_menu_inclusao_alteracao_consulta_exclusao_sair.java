
package ldp1n;

import javax.swing.JOptionPane;

public class dowhile_menu_inclusao_alteracao_consulta_exclusao_sair {
    public static void main(String[] args) {
        
        String var;
        do{
              var=JOptionPane.showInputDialog("Digite a opção desejada");
        switch(var){
            case("i"):
                JOptionPane.showMessageDialog(null,"Inclusão");
                break;
            
                  case("a"):
                JOptionPane.showMessageDialog(null,"Alteração");
                break;
                
                  case("c"):
                JOptionPane.showMessageDialog(null,"Consulta");
                break;
                
                  case("e"):
                JOptionPane.showMessageDialog(null,"Exclusão");
                break;
                
                  default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
               
        }
        } while (!var.equals("x"));
        JOptionPane.showMessageDialog(null,"Programa Encerrado");    
        }
        }






        



