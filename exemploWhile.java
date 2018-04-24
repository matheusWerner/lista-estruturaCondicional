import javax.swing.JOptionPane;

public clss ExemploWhile{

    public static void main (String[] args){

        int quantidadeMaxima = 4;
        int atual = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        

        while (atual < quantidaxeMaxima){
            String nome = JOptionPane.showInputDialog(null,
                              "Digite o se nome");

            int idade = Integer.parseInt("Digite a sua idade"));

            if (idade > maiorIdade){
                maiorIdade = idade;
            } 
                

            System.out.print("Atual: " + atul);
            atual = atual +1;                  
        }

        JOptionPane.showMessageDialog(null, "A maior idade é: " + maior Idade);


           
           
    }
}