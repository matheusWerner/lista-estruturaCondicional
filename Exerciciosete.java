import javax.swing.JOptionPane;

public class Exerciciosete{

   public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        

          if (numero % 2 == 0) {
           
          JOptionPane.showMessageDialog(null, "Essse número é par");


        } else 
          if (numero == 0) {

            JOptionPane.showMessageDialog(null, "Esse número é neutro");  
 

        } else 
          if (numero % 2 == 1) 

            JOptionPane.showMessageDialog(null, "Esse númeor é impar");

        
            if (numero >= 0) {
           
          JOptionPane.showMessageDialog(null, "Essse número é positivo");


        
        } else 
        

            JOptionPane.showMessageDialog(null, "Esse número é negativo");  
        
           
            if (numero < 10) {
           
          JOptionPane.showMessageDialog(null, "Essse número é menor que 10");


        
        } else 
            if (numero > 10) 

            JOptionPane.showMessageDialog(null, "Esse número é maior que 10");  

          if (numero < 50) {
           
          JOptionPane.showMessageDialog(null, "Essse número é menor que 50");


        
        } else 
            if (numero > 50) 

            JOptionPane.showMessageDialog(null, "Esse número é maior que 50");

            if (numero < -10) {
           
          JOptionPane.showMessageDialog(null, "Essse número é menor que -10");


        
        } else 
            if (numero > -10) 

            JOptionPane.showMessageDialog(null, "Esse número é maior que -10");

            if (numero > 30) {
           
          JOptionPane.showMessageDialog(null, "Essse número é maior que 30");


        
        } else 
            if (numero == 30) 

            JOptionPane.showMessageDialog(null, "Esse número é igual a 30");

          if (numero != 1) {
           
          JOptionPane.showMessageDialog(null, "Essse número é diferente de 1");

        
        } else 
            if (numero == 1) 

            JOptionPane.showMessageDialog(null, "Esse número é igual a 1");

   }

}       