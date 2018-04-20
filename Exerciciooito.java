import javax.swing.JOptionPane;

public class Exerciciooito{

   public static void main(String[] args){

       int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1 - Bolo Brigadeiro - R$ 29.50\n2 - Bolo Floresta Negra - R$ 2.00\n3 - Bolo Leite com Nutell - R$ 29.23\n4 - Bolo Mousse de Chocolate - R$ 7.10\n5 - Bolo Nega Maluca - R$ 19.33\n6 - Bomba de Creme - R$ 17.71\n7 - Bomba de Morango - R$ 4.82\n8 - Filé Mignon com fritas e cheddar - R$ 21.16\n9 - Hamburguer com queijos, champignon e rúcula - R$ 12.70\n10 - Provolone com salame R$ 19.70\n11 - Vegetariao de berinjela - R$ 28.22\n12 - Calabresa - R$ 8.98\n13 - Napolitana - R$ 0.42\n14 - Peruana - R$ 18.36\n15 - Portuguesa - R$ 27.50"));
       int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1 - Bolo Brigadeiro - R$ 29.50\n2 - Bolo Floresta Negra - R$ 2.00\n3 - Bolo Leite com Nutell - R$ 29.23\n4 - Bolo Mousse de Chocolate - R$ 7.10\n5 - Bolo Nega Maluca - R$ 19.33\n6 - Bomba de Creme - R$ 17.71\n7 - Bomba de Morango - R$ 4.82\n8 - Filé Mignon com fritas e cheddar - R$ 21.16\n9 - Hamburguer com queijos, champignon e rúcula - R$ 12.70\n10 - Provolone com salame R$ 19.70\n11 - Vegetariao de berinjela - R$ 28.22\n12 - Calabresa - R$ 8.98\n13 - Napolitana - R$ 0.42\n14 - Peruana - R$ 18.36\n15 - Portuguesa - R$ 27.50"));
       int opcao3 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1 - Bolo Brigadeiro - R$ 29.50\n2 - Bolo Floresta Negra - R$ 2.00\n3 - Bolo Leite com Nutell - R$ 29.23\n4 - Bolo Mousse de Chocolate - R$ 7.10\n5 - Bolo Nega Maluca - R$ 19.33\n6 - Bomba de Creme - R$ 17.71\n7 - Bomba de Morango - R$ 4.82\n8 - Filé Mignon com fritas e cheddar - R$ 21.16\n9 - Hamburguer com queijos, champignon e rúcula - R$ 12.70\n10 - Provolone com salame R$ 19.70\n11 - Vegetariao de berinjela - R$ 28.22\n12 - Calabresa - R$ 8.98\n13 - Napolitana - R$ 0.42\n14 - Peruana - R$ 18.36\n15 - Portuguesa - R$ 27.50"));
       
       double preco1;
       double preco2;
       double preco3;
       double total; 


        if (opcao == 1 && opcao2 == 2 && opcao3 == 3)  {
            preco1 = 29.50;
            preco2 = 2.00;
            preco3= 29.23;
            total = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, "Produtos : " +
                                                 "\nBolo de brigadeiro R$" + preco1 + 
                                                 "\nbolo floresta negra R$" + preco2 + 
                                                 "\nBolo Leite com nutella R$" + preco3 + 
                                                 "\nResultado: " + total);
        
        } else if (opcao == 3 && opcao2 == 4 && opcao3 == 5)  {
            preco1 = 7.10;
            preco2 = 19.33;
            preco3 = 17.71;
            total = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, "Produtos : " +
                                                 "\nBolo mousse de chocolate R$" + preco1 + 
                                                 "\nbolo nega maluca R$" + preco2 + 
                                                 "\nBomba de creme R$" + preco3 + 
                                                 "\nResultado: " + total);
        } else if (opcao == 6 && opcao2 == 7 && opcao3 == 8)  {
            preco1 = 4.82;
            preco2 = 21.16;
            preco3= 12.70;
            total = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, "Produtos : " +
                                                 "\nBomba de morango R$" + preco1 + 
                                                 "\nFilé mignon com fritas e cheddar R$" + preco2 + 
                                                 "\nHamburguer com queijos, champignon e rúcula R$" + preco3 + 
                                                 "\nResultado: " + total);
        }else if (opcao == 9 && opcao2 == 10 && opcao3 == 11)  {
            preco1 = 19.70;
            preco2 = 28.22;
            preco3= 8.98;
            total = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, "Produtos : " +
                                                 "\nProvolone com salame R$" + preco1 + 
                                                 "\nVegetariano de berinjela R$" + preco2 + 
                                                 "\nCalabresa  R$" + preco3 + 
                                                 "\nResultado: " + total);
        } else if (opcao == 12 && opcao2 == 13 && opcao3 == 14)  {
            preco1 = 0.42;
            preco2 = 18.36;
            preco3= 27.50;
            total = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, "Produtos : " +
                                                 "\nNapolitana R$" + preco1 + 
                                                 "\nPeruana R$" + preco2 + 
                                                 "\nPortuguesa R$" + preco3 + 
                                                 "\nResultado: " + total);
        }




   }

}   