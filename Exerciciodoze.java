import javax.swing.JOptionPane;

public class Exerciciodoze{

   public static void main(String[] args){

       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));

       if (numero1 > numero2) {

           JOptionPane.showMessageDialog(null, "Maior número: " + numero1 +
                                               "Menor número: " + numero2);
       } else {

           JOptionPane.showMessageDialog(null, "Maior número: " + numero2 +
                                               "Menor número: " + numero1);
       }

   }

}                                              

          
