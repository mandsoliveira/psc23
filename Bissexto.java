import javax.swing.JOptionPane;
public class Bissexto {
    public static void main(String[] args){
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
            
            if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)){
                JOptionPane.showInputDialog(null,"É um ano bissexto");
            
            }else{
                JOptionPane.showMessageDialog(null,"Não é um ano bissexto");
        }
    }
}

