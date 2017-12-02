
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> MiLista=new LinkedList();
        MiLista.add("Hola");
        MiLista.add("");
        MiLista.add("Mundo");
        MiLista.add("");
        MiLista.add("Cruel");
        MiLista.add("");
        MiLista.add("Collections");
        for (String MiLista1 : MiLista) {
            System.out.println(MiLista1);
            
        }
        MiLista.remove(4);
        System.out.println("");
        System.out.println(MiLista);
        MiLista.add(4, "Bondoso");
        System.out.println(MiLista);
        
    }
    
}
