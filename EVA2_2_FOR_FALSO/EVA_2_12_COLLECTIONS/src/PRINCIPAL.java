
import java.util.ArrayList;
import java.util.Iterator;


public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> alMiArrayList=new ArrayList();
        alMiArrayList.add(100);
        alMiArrayList.add(200);
        alMiArrayList.add(300);
        alMiArrayList.add(400);
        alMiArrayList.add(500);
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        alMiArrayList.add(2, 999);
        System.out.println("");
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.print(alMiArrayList1 + " - ");
        }
        System.out.println("\n ITERATOR");
        Iterator itRecorrerArray = alMiArrayList.iterator();
        while(itRecorrerArray.hasNext()){
            System.out.print(itRecorrerArray.next() + " - ");
        }
                
    }
    
}
