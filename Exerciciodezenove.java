import javax.swing.JOptionPane;

public class Exerciciodezenove{

   public static void main(String[] args){

    double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu saldo"));
    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito"));
    double emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Valor da parcela de empréstimo"));
    double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor dos Saques"));

    double saldoFinal;
    double saldoFinal2;

    saldoFinal = (saldo+deposito) - emprestimo;
    saldoFinal2 = saldoFinal - saque;

       if (saldoFinal2 == 0) {

           JOptionPane.showMessageDialog(null, "Saldo Neutro");
       
       } else if (saldoFinal2 > 0) {

           JOptionPane.showMessageDialog(null, "Saldo Positivo");

       }  else if (saldoFinal2 < 0) {

           JOptionPane.showMessageDialog(null, "Saldo Negativo");

       }

   }

}       

    



 

