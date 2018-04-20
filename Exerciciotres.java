import javax.swing.JOptionPane;

public class Exerciciotres{

   public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int numerodois = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
      

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opcão\n1 - Somar\n2 - Dividir\n3 - Multiplicar\n4 - Dvidir"));
  
        


          if (opcao == 1) {
            int numerosoma = numero + numerodois;
            JOptionPane.showMessageDialog(null, "Resultado: " + numerosoma);
        
        } else if (opcao == 2) {
            int numerosub = numero - numerodois;
            JOptionPane.showMessageDialog(null, "Resultdo: " + numerosub);

        } else if (opcao == 3) {
            int numeromulti = numero * numerodois;     
            JOptionPane.showMessageDialog(null, "Resultado: " + numeromulti);
        
        } else if (opcao == 4) {
            int numerodivi = numero / numerodois; 
            JOptionPane.showMessageDialog(null, "Resultdo: " + numerodivi);

        }
  }

}