import javax.swing.JOptionPane;

public class Exercicioquatorze{

   public static void main(String[] args){

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
    int numerodois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
    int numerotres = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
    
    

          if (numero >= numerodois && numerodois >= numerotres)  {
     

            JOptionPane.showMessageDialog(null, "Menor: " + numerotres +
                                                "\nMeio: " + numerodois +
                                                "\nMaior: " + numero);
        
        } else if (numero >= numerotres && numerotres >= numerodois) {

            JOptionPane.showMessageDialog(null, "Menor: " + numerodois +
                                                "\nMeio: " + numerotres +
                                                "\nMaior: " + numero);
                                           
        } else if (numerodois >= numero && numero >= numerotres) {

            JOptionPane.showMessageDialog(null, "Menor: " + numerotres +
                                                "\nMeio: " + numero +
                                                "\nMaior: " + numerodois);

        } else if (numerotres >= numero && numero >= numerodois) {

            JOptionPane.showMessageDialog(null, "Menor: " + numerodois +
                                                "\nMeio: " + numero +
                                                "\nMaior: " + numerotres);

        } else if (numerodois >= numerotres && numerotres >= numero) {

            JOptionPane.showMessageDialog(null, "Menor: " + numero +
                                                "\nMeio: " + numerotres +
                                                "\nMaior: " + numerodois);

        } else if (numerotres >= numerodois && numerodois >= numero) {

            JOptionPane.showMessageDialog(null, "Menor: " + numero + 
                                                "\nMeio: " + numerodois +
                                                "\nMaior: " + numerotres);
        }


   }

}