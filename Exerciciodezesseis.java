import javax.swing.JOptionPane;

public class Exerciciodezesseis{

   public static void main(String[] args){

    double conversao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a conversão que deseja: " 
                                                                 + "\n\n1 - De Farenheit para Celsius"  
                                                                 + "\n2 - De Celsius para Farenheit"
                                                                 + "\n3 - De Kelvin para Celsius"
                                                                 + "\n4 - De Celsius para Kelvin"
                                                                 + "\n5 - De Kelvin para Farenheit"
                                                                 + "\n6 - De Farenheit para Kelvin"));

    double origem = Integer.parseInt(JOptionPane.showInputDialog("Digite a tempetura de origem"));
    

    if (conversao == 1) {

        origem = (origem-32) / 1.8;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " C");

    } else if (conversao == 2) {

        origem = (origem*1.8) + 32;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " F");

    } else if (conversao == 3) {

        origem = 273 - origem;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " C");

    } else if (conversao == 4) {

        origem = origem + 273;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " K");

    } else if (conversao == 5) {

        origem = (origem * 9/5) - 459.67;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " F");

    } else if (conversao == 6) {

        origem = (origem + 459.67) * 5/9;


        JOptionPane.showMessageDialog(null, "A converão é : " + origem + " K");

    } 



   }

}   