
package eva2_recursividad3;

import java.util.Scanner;

/**
 *
 * @author 16550499
 */
public class EVA2_RECURSIVIDAD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un número a elevar");
        Scanner dato = new Scanner(System.in);
        int iNum = dato.nextInt();
        System.out.println("Ingresa la potencia");
        int iPo = dato.nextInt();
        System.out.println(iNum + "^" + iPo + " = " + potencia(iNum,iPo));
    }
    
    public static int potencia(int iNum, int iPo){
        if(iPo==0){ 
            return 1; 
        }
        else{
            return iNum * potencia(iNum,iPo-1); 
        }
    }
}
