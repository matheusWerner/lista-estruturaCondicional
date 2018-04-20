import javax.swing.JOptionPane;

public class Exercicioseis{

   public static void main(String[] args){

       
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

       if (numero != 1) {
            JOptionPane.showMessageDialog(null, "Esse número é diferente de 1");
        
        } else {
            JOptionPane.showMessageDialog(null, "Esse número é igual a 1");
        }

   }

}   