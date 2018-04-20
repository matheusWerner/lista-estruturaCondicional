import javax.swing.JOptionPane;

public class Exerciciovinte{

   public static void main(String[] args){


       double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

       double imc = (peso / altura) * altura;

        if (imc =< 9.99) {

           JOptionPane.showMessageDialog(null, "Desnutrição Grau V");
       
       } else if (imc >= 10 && imc =< 12.9) {

           JOptionPane.showMessageDialog(null, "Desnutrição Grau IV");

       }  else if (imc >= 13 && imc =< 15.9) {

           JOptionPane.showMessageDialog(null, "Desnutrição Grau III");

       } else if (imc >= 16 && imc =< 16.9) {

           JOptionPane.showMessageDialog(null, "Desnutrição Grau II");

       } else if (imc >= 17 && imc =< 18.4) {

           JOptionPane.showMessageDialog(null, "Desnutrição Grau I");

       } else if (imc >= 18.5 && imc =< 24.9) {

           JOptionPane.showMessageDialog(null, "Normal");

       } else if (imc >= 25 && imc =< 29.9) {

           JOptionPane.showMessageDialog(null, "Pré-Obesidade");

       } else if (imc >= 30 && imc =< 34.5) {

           JOptionPane.showMessageDialog(null, "Obesidade Grau I");

       } else if (imc >= 35 && imc =< 39.9) {

           JOptionPane.showMessageDialog(null, "Obesidade Grau II");

       }  else if (imc > 39.9) {

           JOptionPane.showMessageDialog(null, "Obesidade Grau III");

       } 


   }

}   


