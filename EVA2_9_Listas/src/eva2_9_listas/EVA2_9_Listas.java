
package eva2_9_listas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 16550499
 */
public class EVA2_9_Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.imprimirNodo();
        System.out.println("");
        
       /* miLista.agregarNodo(new Nodo(15));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.agregarNodo(new Nodo(30));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.agregarNodo(new Nodo(45));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.agregarNodo(new Nodo(75));
        miLista.imprimirNodo();
        System.out.println("");
        miLista.imprimirNodo();
        miLista.vaciarLista();
        System.out.println("");
        miLista.imprimirNodo();*/
        
        for (int i = 0; i < 10; i++) {
            int iAlea= (int) (Math.random()*1000)+1;
            miLista.agregarNodoMejorado(new Nodo(iAlea));
            
        }
       // miLista.imprimirNodo();
        System.out.println("Cantidad de elementos: "+ miLista.contarElementos());
        try {
            System.out.println("El elemento en la posición 5= "+ miLista.valorEn(5));
        } catch (Exception ex) {
            Logger.getLogger(EVA2_9_Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       /* System.out.println("");
        miLista.insentarEn(0, new Nodo(999));
        miLista.imprimirNodo();
         System.out.println("");
        miLista.insentarEn(5, new Nodo(5));
        miLista.imprimirNodo();
        */
        System.out.println("Lista Original");
        miLista.imprimirNodo();
        System.out.println( "\nBorrar nodo");
        miLista.borrarElemnto(2);
        miLista.imprimirNodo();
        System.out.println("\nInsertar en x posición");
        miLista.insentarEn(2, new Nodo(00));
        miLista.imprimirNodo();
    }

}

class Nodo {

    private int iVal;
    private Nodo nSig;

    public Nodo() {//CONSTRUCTOR POR DEFAULT
        iVal = 0;
        nSig = null;
    }

    public Nodo(int iValor) {
        iVal = iValor;
        nSig = null;
    }

    public Nodo(int iVal, Nodo nod) {
        iVal = iVal;
        nSig = nod;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

class Lista {

    private Nodo nIni, nFin;

    public Lista() {
        nIni = null;
        nFin= null;
    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin= nNodo;
    }

    //AGREGAR NODO SIEMPRE LO PONE AL FINAL DE LA LISTA

    public void agregarNodo(Nodo nNodo) {//¡¡¡¡NO USAR ESTE METODO!!!!
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            nIni = nNodo;//SOLO CUANDO LAS LISTA ESTA VACIA
        } else {
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }
    
    public void agregarNodoMejorado(Nodo nNodo){
        
        if(nIni== null){
            nIni= nNodo;
            nFin= nNodo;
        }else{
            nFin.setnSig(nNodo);
            nFin= nNodo;
        }
        
    }

    //IMPRIMIR NODO

    public void imprimirNodo() {
        //MOVERNOS AL FINAL DE LA LISTA
        Nodo nTemp = nIni;
        if (nIni == null) {
            System.out.println("La lista esta vacia");
        } else {
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
            }

        }
    }

    //VACIAR LA LISTA--->Al menos para java, simplemente se asigna null a nIni.

    public void vaciarLista() {
        nIni = null;
        nFin=null;
    }
    
    //CONTAR EL TAMAÑO DE LA LISTA
    public int contarElementos(){
        Nodo nTemp= nIni;
        if(nIni== null){
            return 0;
        }else{
            int iCont=0;
            while(nTemp!=null){
                iCont++;
                nTemp= nTemp.getnSig();
            }
            return iCont;
        }
    }
    
    public int valorEn(int iPos) throws Exception{
        //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
        int iVal=0;
        if((iPos< contarElementos()) && (iPos >= 0)){
            Nodo nTemp= nIni;
 
            for (int i = 0; i < iPos; i++) {
               nTemp= nTemp.getnSig();
             }
            iVal=nTemp.getiVal();
        }else{
            throw new Exception("La posición no es válida.");
        }
        return iVal;
    }
    
    public void insentarEn(int iPos, Nodo nNodo){
        //VENIRFICAR IPOS >=0, IPOS < TAMAÑO DE LA LISTA
        
    if(iPos==0){//INSERTAR AL INICIO  DE LA LISTA
        nNodo.setnSig(nIni);
        nIni= nNodo;
    }else{//INSERTAR EN CUALQUIER POSICIÒN
        Nodo nTemp= nIni;
        for (int i = 0; i < (iPos-1); i++) {
            nTemp= nTemp.getnSig();
        }
        nNodo.setnSig(nTemp.getnSig());
        nTemp.setnSig(nNodo);
    }
    
    }
    
    public void borrarElemnto(int iPos){
        iPos= iPos-1;
        Nodo nTemp=nIni;
        for (int i = 0; i < (iPos-1); i++) {
            nTemp= nTemp.getnSig();
        }
        nTemp.setnSig(nTemp.getnSig().getnSig());
    }
    
}