import javax.swing.JOptionPane;


   public class exemplopane3{


     public static void main (String[] ars){

        String opcaoSelecionada = JOptionPane.showInputDialog (null,
                   
             "Selecione um estado",
             "SISTEMA - DA Vovó",

        JOptionPane.QUESTION_MESSAGE,
        null,
        new Object[]{

            "", "PR","RS","SC"
        },
        ""        
        ).toString();


        if(opcaoSelecionada.equals("SC")){

            JOptionPane.showMessageDialog(null, "Santa Catarina");
        
        }else if(opcaoSelecionada.equals("PR")){

            JOptionPane.showMessageDialog(null, "Paraná");
        
        } else if(opcaoSelecionada.equals("RS")){

            JOptionPane.showMessageDialog(null, "Rio Grande do Sul");
        
        } 



    }

}    
         