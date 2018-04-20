import javax.swing.JOptionPane;

public class Exerciciodois{

   public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "Esse número é positivo");
        
        } else {
            JOptionPane.showMessageDialog(null, "Esse número é negativo");
        }

  }

}