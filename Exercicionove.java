import javax.swing.JOptionPane;

public class Exercicionove{

   public static void main(String[] args){

       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
       int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo número: "));

       if (numero == numero1 && numero1 == numero2 && numero2 == numero3) {

           JOptionPane.showMessageDialog(null, "É um quadrado");
       } else {

           JOptionPane.showMessageDialog(null, "Nao é um quadrado");

       }  
       

   }  
          
}
