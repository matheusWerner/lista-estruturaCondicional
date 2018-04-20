import javax.swing.JOptionPane;


public class exemplopane2{


public static void main (String[] ars){

    int opcao = JOptionPane.showOptionDialog(null, 
                                "Selecione o menu desejado", "MENU DO SISTEMA", 
                                0,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[]{
                                    "Cadastro", "Edição", "Lista"
                                },
                                "Edição");

           if (opcao == 1) {

             JOptionPane.showMessageDialog(null, "Edição selecionada");
                          
           } else if (opcao == 0) {

            JOptionPane.showMessageDialog(null, "Cadastro selecionada");
                         
          }  else if (opcao == 2) {

            JOptionPane.showMessageDialog(null, "Lista selecionada");
                         
          }                                      
                                
    }

}   
    
                                

                                                                                                                