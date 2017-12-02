
package eva2_12_stack;

/**
 *
 * @author 16550499
 */
public class EVA2_12_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack sStack = new Stack();
        System.out.println(sStack.leerUltimoNodo());
        System.out.println("");
        sStack.push(new Nodo (1));
        sStack.push(new Nodo (2));
        
        System.out.println("El Stack contiene: "+sStack.contarElementos() +" elementos.");
//        sStack.push(new Nodo (3));
//        sStack.push(new Nodo (4));
//        sStack.push(new Nodo (5));
        System.out.println(sStack.leerUltimoNodo());
        System.out.println(sStack.pop());
        System.out.println(sStack.pop());
//        System.out.println(sStack.pop());
//        System.out.println(sStack.pop());
//        System.out.println(sStack.pop());
        sStack.vaciarStack();
        System.out.println(sStack.leerUltimoNodo());
        
       
        
     
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

class Stack {

    Nodo nIni, nFin;

    public Stack() {
        nIni = null;
        nFin = null;
    }

    public Stack(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void push(Nodo nNodo) {//AGREGAMOS NODOS AL FINAL DE LA LISTA
        if (nIni == null) {//LISTA VACIA EL NODO SE PONE AL INICIO
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

   

    public int leerUltimoNodo() {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            System.out.println("Stack vacío");
        } else {
            iVal = nFin.getiVal();
        }
        return iVal;
    }

    public int pop() {
        int iVal = 0;
        if (nIni == null) {
            //lanzar una execpción
            System.out.println("La lista esta vacía");
        } else {
            iVal = nFin.getiVal();
            //ELIMINAR EL ULTIMO NODO DE LA LISTA
            //VERIFICAR CANTIDAD DE NODOS
            // SI SOLO HAY UN NODO nIni = null, nFin =null
            if (nIni.getnSig() == null) {
                nIni = null;
                nFin = null;
            } else {
                //SI HAY DOS O MAS NODOS SE CONECTAN
                nFin = nFin.getnPrev();
                nFin.setnSig(null);
            }

        }
        return iVal;
    }
    
     public void vaciarStack() {
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
