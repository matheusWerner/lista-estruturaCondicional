import javax.swing.JOptionPane;

public class Exercicioonze{

   public static void main(String[] args){

       double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota: "));
       double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota: "));
       double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota: "));
       double nota4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota: "));
       double nota5 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quinta nota: "));


       double media = nota1+nota2+nota3+nota4+nota5 / 5;

       if (media <= 5.9) {

            JOptionPane.showMessageDialog(null, "Reprovado");

       } else 
       
          if (media >= 6.0 || media <= 7.9) {

            JOptionPane.showMessageDialog(null, "Recuperação");
       
       } else

         if (media >= 8.0) {

            JOptionPane.showMessageDialog(null, "Aprovado");
         }        


   }

}       