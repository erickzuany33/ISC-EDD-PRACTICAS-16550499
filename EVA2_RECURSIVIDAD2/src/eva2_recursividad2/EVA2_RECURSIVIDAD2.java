
package eva2_recursividad2;

import java.util.Scanner;

/**
 *
 * @author 16550499
 */
public class EVA2_RECURSIVIDAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingresa texto");
        System.out.println(quitarX(dato.next()));
    }
 public static String quitarX (String sC){
    if (sC.charAt(0) == 'x'){ 
        if(sC.length()-1>0){ 
            return quitarX(sC.substring(1)); 
        }
        
    }
    else{
        if(sC.length()-1 > 0){ 
            return sC.charAt(0) + quitarX(sC.substring(1)); 
        }
        else{
            return sC; 
        }
    }
        return "";
 }   
}

