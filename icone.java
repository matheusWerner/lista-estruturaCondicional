import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



   public class icone{


     public static void main (String[] ars){

        JOptionPane.showMessageDialog(null, "Olá Mundo",
        "Sistema da Vovó", JOptionPane.WARNING_MESSAGE,
           new ImageIcon(
           icone.class.getResource
           ("/imagem/ninja.png")
        )

        );


     }

}
     