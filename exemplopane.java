import javax.swing.JOptionPane;


public class exemplopane{


public static void main (String[] ars){

   
   int opcao =  JOptionPane.showConfirmDialog(null, "Deseja cadastrar?", "AVISO", JOptionPane.YES_NO_OPTION);



   if (opcao == JOptionPane.OK_OPTION) {

       JOptionPane.showMessageDialog(null, "Registrado salvo com sucesso");
       
   } else if (opcao == JOptionPane.NO_OPTION) {

       JOptionPane.showMessageDialog(null, "Opcao invalida");
   
   } else if (opcao == JOptionPane.CANCEL_OPTION) {

       JOptionPane.showMessageDialog(null, "Voce cancelou");
   
   } else {

       JOptionPane.showMessageDialog(null, "Fechado com sucesso");
   }



}

}