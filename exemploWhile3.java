import javax.swing.JOptionPane;

public class exemploWhile3{

    public static void main (String[] args){


    int numero = Integer.parseInt(JOptionPane.showInputDialog(
    "\n1 Pizza de calabresa R$ 25,00" +
    "\n2 Pizza de 4 queijos R$ 27,00" +
    "\n3 Pizza de bacon     R$ 45,00" +
    "\n4 - Sair"));

    double preco = 0; 
    double precoTotal = 0;

    while (numero != 4){

    if(numero ==1){

        preco = 25.00;
    
    }else if (numero ==2){
        preco = 27.00;
    
    }else if (numero==3){
        preco = 45.00;
    }

    JOptionPane.showMessageDialog(null, "Opreço é : R$" + preco);
    precoTotal = precoTotal + preco;

    Integer.parseInt(JOptionPane.showInputDialog(
    "\n1 Pizza de calabresa R$ 25,00" +
    "\n2 Pizza de 4 queijos R$ 27,00" +
    "\n3 Pizza de bacon     R$ 45,00" +
    "\n4 - Sair"));




    }


    }

}    

