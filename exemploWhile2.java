import javax.swing.JOptionPane;

public class exemploWhile2{

    public static void main (String[] args){

        
         String nome = JOptionPane.showInputDialog("Digite o seu nome");

         double somaMedia = 0;
         int quantidadeTotaldeAlunos = 0;
        

         while (!nome.equalsIgnoreCase("sair")){
            double nota1 = Double.parseDouble(JOptionPane
                        .showInputDialog("Digite a sua nota 1"));
            double nota2 = Double.parseDouble(JOptionPane
                        .showInputDialog("Digite a sua nota 2"));
            double nota3 = Double.parseDouble(JOptionPane
                        .showInputDialog("Digite a sua nota 3"));
            double media = (nota1 + nota2 + nota3) / 3; 

            somaMedia = somaMedia + media;
            quantidadeTotaldeAlunos = quantidadeTotaldeAlunos + 1;

            if(media < 7){

                JOptionPane.showMessageDialog(null, "Reprovado jovi");
            
            }else{

                JOptionPane.showMessageDialog(null, "Jovem padawan");
            } 

           nome = JOptionPane.showInputDialog("Digite seu nome.\nSe desejar sair digite \"Sair\"");
         }

           
           double mediaDasMedias = somaMedia / quantidadeTotaldeAlunos;
           JOptionPane.showMessageDialog(null, 
           "Média das médias é: " + mediaDasMedias);

          



    }
}