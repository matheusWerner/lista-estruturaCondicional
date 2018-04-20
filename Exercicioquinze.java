import javax.swing.JOptionPane;

public class Exercicioquinze{

   public static void main(String[] args){

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
    int numerodois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
    int numerotres = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
    
    

          if (numero <= numerodois && numerodois <= numerotres)  {
     

            JOptionPane.showMessageDialog(null, "Maior: " + numerotres +
                                                "\nMeio: " + numerodois +
                                                "\nMenor: " + numero);
        
        } else if (numero <= numerotres && numerotres <= numerodois) {

            JOptionPane.showMessageDialog(null, "Maior: " + numerodois +
                                                "\nMeio: " + numerotres +
                                                "\nMenor: " + numero);
                                           
        } else if (numerodois <= numero && numero <= numerotres) {

            JOptionPane.showMessageDialog(null, "Maior: " + numerotres +
                                                "\nMeio: " + numero +
                                                "\nMenor: " + numerodois);

        } else if (numerotres <= numero && numero <= numerodois) {

            JOptionPane.showMessageDialog(null, "Maior: " + numerodois +
                                                "\nMeio: " + numero +
                                                "\nMenor: " + numerotres);

        } else if (numerodois <= numerotres && numerotres <= numero) {

            JOptionPane.showMessageDialog(null, "Maior: " + numero +
                                                "\nMeio: " + numerotres +
                                                "\nMenor: " + numerodois);

        } else if (numerotres <= numerodois && numerodois <= numero) {

            JOptionPane.showMessageDialog(null, "Maior: " + numero + 
                                                "\nMeio: " + numerodois +
                                                "\nMenor: " + numerotres);
        }


   }

}