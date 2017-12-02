
package eva2_10_listas_dob_enl;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550499
 */
public class EVA2_10_LISTAS_DOB_ENL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDE miListaDE = new ListaDE();
//        miListaDE.imprimirElementos();
//        miListaDE.imprimirElementosInv();
       for (int i = 0; i < 10; i++) {
           miListaDE.agregarNodo(new Nodo((int) (Math.random() * 100) + 1));
    }
//        System.out.println("");
//        miListaDE.imprimirElementos();
//        System.out.println("");
//        miListaDE.imprimirElementosInv();
        System.out.println("");
        System.out.println("La lista tiene: " + miListaDE.contarElementos() + " elementos.");

        try {
            System.out.println("El elemento buscado esta en la posición: " + miListaDE.valorEn(7));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_10_LISTAS_DOB_ENL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        miListaDE.imprimirElementos();
        System.out.println("\nInsertar en");
        miListaDE.insertarEn(0, new Nodo(1));
        miListaDE.imprimirElementos();
//        System.out.println("\nImprimir lista inversa");
//         miListaDE.imprimirElementosInv();
         System.out.println("\nBorrar de");
         miListaDE.eliminarDe(0);
         miListaDE.imprimirElementos();
         System.out.println("\nVaciar lista");
         miListaDE.vaciarLista();
         miListaDE.imprimirElementos();
         
         
                 
    }

}

class Nodo {

    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nPrev = null;
        nSig = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nPrev = null;
        nSig = null;

    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class ListaDE {

    Nodo nIni, nFin;

    public ListaDE() {
        nIni = null;
        nFin = null;
    }

    public ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {//AGREGAMOS NODOS AL FINAL DE LA LISTA
        if (nIni == null) {//LISTA VACIA
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public void imprimirElementos() {

        if (nIni == null) {
            System.out.println("La lista esta vacia.");
        } else {
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
            }
        }

    }

    public void imprimirElementosInv() {

        if (nIni == null) {
            System.out.println("La lista esta vacia.");
        } else {
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }

    public int contarElementos() {
        Nodo nTemp = nIni;
        if (nIni == null) {
            return 0;
        } else {
            int iCont = 0;
            while (nTemp != null) {
                iCont++;
                nTemp = nTemp.getnSig();
            }
            return iCont;
        }
    }
    
     public void vaciarLista() {
        nIni = null;
        nFin=null;
    }
     
    public int valorEn(int iPos) throws Exception {
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
        int iVal = 0;
        if ((iPos < contarElementos()) && (iPos >= 0)) {
            Nodo nTemp = nIni;

            for (int i = 0; i < iPos; i++) {
                nTemp = nTemp.getnSig();
            }
            iVal = nTemp.getiVal();
        } else {
            throw new Exception("La posición no es válida.");
        }
        return iVal;
    }

    public void insertarEn(int iPos,Nodo nNodo){
            if (iPos<contarElementos() && iPos>=0) {
            //INSERTAR AL INICIO DE LA LISTA
                if (iPos==0) {
                nNodo.setnSig(nIni);
                nIni=nNodo;
                
            }else{//INSERTAR EN CUALQUIER POSICION EXCEPTO AL FINAL
                Nodo nTemp = nIni;
                for (int i = 0; i < (iPos); i++) {
                    nTemp = nTemp.getnSig();
                }
                nNodo.setnPrev(nTemp.getnPrev());
                nNodo.setnSig(nTemp);
                nTemp.getnPrev().setnSig(nNodo);
                nTemp.setnPrev(nNodo);
            }
        }else{
                System.out.println("La posición no es válida");
            }
    }
    
    public void eliminarDe(int iPos){
        
        if (iPos==0) {
            nIni=nIni.getnSig();
        }else{
            Nodo nTemp = nIni;
            for (int i = 0; i < iPos-1; i++) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nTemp.getnSig().getnSig());
            nTemp.setnPrev(nTemp.getnPrev().getnPrev());
            
            
        }
    }
}
