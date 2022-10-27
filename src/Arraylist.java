import java.util.ArrayList;

import java.swing.JOptionPane;


public class Arraylist {
    public static void main(String[] args);
        ArrayList<String> compras = new ArrayList<String>();
        int selecionado = 0
        Object[]opcoes = { "Incluir", "Listar","Apagar", "Modificar","Finalizar"};
        do {
            selecionado = javax.swing.JOptionPane.showOptionDialog(null, 
            "Lista Compras: ", 
            "Exemplo", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE, 
            null, 
            opcoes, 
            opcoes[0]);
            if (selecionado == 0){
                String item = JOptionPane.showInputDialog("Digite");
                lista.add(item);
            }
            if (selecionado == 1){
                String msg = "";
                for (String item : lista){
                    msg += item + "\n";
                }
                javax.swing.JOptionPane.showMessageDialog(null, msg);
            }
            if(selecionado == 2){
                Object [] opcaoApagar = new Object[lista.size()];
                for (int 1 = 0; i <opcaoApagar.length; i++){
                    opcaoApagar[i] = lista.get(i);
                }
                Object itemSelecionado = javax.swing.JOptionPane.showInputDialog(null,
                 "Selecione o item para Apagar", 
                 "Apagar", 
                 javax.swing.JOptionPane.INFORMATION_MESSAGE, 
                 null, 
                 opcaoApagar, opcaoApagar[0]);
                 //System.out.println(itemSelecionado.toString());
                 for (int i = 0; i<lista.size(); i ++){
                    if(itemSelecionado.toString().equals(lista.get(i))){
                        lista.remove(i);
                    }
                 }
            }
            if (selecionado == 3){
            Object [] opcaoApagar = new Object[lista.size()];
            for (int i = 0; i <opcaoApagar.length; i ++) {
                opcaoApagar[i] = lista.get(i);
            }
            Object itemSelecionado = javax.swing.JOptionPane.showInputDialog(null, 
            "Selecione o item para Alterar", 
            "Alterar", 
            javax.swing.JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opcaoApagar, opcaoApagar[0]);
            System.out.println(itemSelecionado.toString());
            for (int i = 0; i <lista.size(); i ++){
                if(itemSelecionado.toString().equals(lista.get(i))){
                    lista.remove(i);

                    String item = JOptionPane.showInputDialog("Digite");
                    lista.add(item);
                }
            }
        }
    }while (selecionado != 4 );

}


