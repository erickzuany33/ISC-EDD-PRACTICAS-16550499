
package eva2_11_queue;

/**
 *
 * @author 16550499
 */
public class EVA2_11_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue qFilaSuper = new Queue();
        System.out.println(qFilaSuper.leerPrimerNodo());
        System.out.println("");
        qFilaSuper.agregarNodo(new Nodo(100));
//        qFilaSuper.agregarNodo(new Nodo(200));
//        qFilaSuper.agregarNodo(new Nodo(300));
//        qFilaSuper.agregarNodo(new Nodo(400));

        System.out.println(qFilaSuper.leerPrimerNodo());
        System.out.println("La cola tiene: " + qFilaSuper.contarElementos() + " elementos.");

        System.out.println(qFilaSuper.removerPrimerNodo());
//        System.out.println(qFilaSuper.removerPrimerNodo());
//        System.out.println(qFilaSuper.removerPrimerNodo());
//        System.out.println(qFilaSuper.removerPrimerNodo());
        System.out.println(qFilaSuper.leerPrimerNodo());

        System.out.println("\nVaciar Cola");
        qFilaSuper.vaciarCola();
        qFilaSuper.leerPrimerNodo();

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

class Queue {

    Nodo nIni, nFin;

    public Queue() {
        nIni = null;
        nFin = null;
    }

    public Queue(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {//AGREGAMOS NODOS AL FINAL DE LA LISTA
        if (nIni == null) {//LISTA VACIA EL NODO SE PONE AL INICIO
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public int leerPrimerNodo() {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            System.out.println("La lista esta vacía");
        } else {
            iVal = nIni.getiVal();
        }
        return iVal;
    }

    public int removerPrimerNodo() {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            System.out.println("La lista esta vacía");
        } else {
            iVal = nIni.getiVal();
            //ELIMINAR EL PRIMER NODO DE LA LISTA
            //VERIFICAR CANTIDAD DE NODOS
            // SI SOLO HAY UN NODO nIni = null, nFin =null
            if (nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                //SI HAY DOS O MAS NODOS SE CONECTAN
                nIni = nIni.getnSig();
                nIni.setnPrev(null);
            }

        }
        return iVal;
    }

    public void vaciarCola() {
        nIni = null;
        nFin = null;
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
}
