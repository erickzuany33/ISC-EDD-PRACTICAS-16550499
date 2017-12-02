
package eva2_recursividad1;

import java.util.Scanner;

/**
 *
 * @author 16550499
 */
public class EVA2_RECURSIVIDAD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa el número");
        Scanner dato = new Scanner(System.in);
        int iNum = dato.nextInt();
        System.out.println("Suma de los digitos de " + iNum + " = " + sumaDigi(iNum));
    }
    
    public static int sumaDigi(int iNum){
       if(iNum<10){ 
           return iNum;
       }
       else{
           return iNum%10 + sumaDigi(iNum/10); 
       }
    }
}
