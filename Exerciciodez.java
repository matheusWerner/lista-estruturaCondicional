import javax.swing.JOptionPane;

public class Exerciciodez{

   public static void main(String[] args){

       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
       int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo número: "));

       if (numero == numero1 && numero2 == numero3 || numero == numero2 && numero3 == numero1 || numero == numero3 && numero2 == numero1) {

           JOptionPane.showMessageDialog(null, "É um retângulo");
       } else {
             
             JOptionPane.showMessageDialog(null, "Não é um retângulo");

       }

   }

}      