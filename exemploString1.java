import javax.swing.JOptionPane;

public class exemploString1{

    public static void main (String [] args){

        String nome = "Curso de Java do Francisco";
        // retorna a quantidade de caracteres da String
        System.out.println(nome);
        System.out.println("Tamanho da String: "
        + nome.length());

        String nick = JOptionPane.showInputDialog(null,
               "Informe o nick do seu pager");

        if (nick.equals("")){

            JOptionPane.showMessageDialog(null,
            "Filho eu pedi voce o seu, ta dificil");
        }  

        String jogoDoAno = " League of Legend   ";
        // remove espaços do começo e do fim
        jogoDoAno = jogoDoAno.trim();


        // colocar o texto todo em caix alta
        String sistemaOperacional = "LiNUX";
        sistemaOperacional = sistemaOperacional
                    .toUpperCase();
        System.out.println(sistemaOperacional);

        //colocar o texto todo em caixa baixa
        sistemaOperacional = sistemaOperacional
                    .toLowerCase();
        System.out.println(sistemaOperacional);

        // pegar um caracter em determinado índice
        char letra = sistemaOperacional.charAt(2);

        String nomeCompleto = "Juan Roberto da Rocha";
        System.out.println(nomeCompleto.substring(5,12)); 

        
        

                               




    }
}