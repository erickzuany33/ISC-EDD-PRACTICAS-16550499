
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Persona> sPersona=new LinkedList();
        sPersona.add(new Persona ("Daniela", "Uzárraga", 18, true, 1400));
        sPersona.add(new Persona ("Alan", "Oloño", 20, true, 1500));
        sPersona.add(new Persona ("Carlos", "Pedroza", 19, true, 1600));
        sPersona.add(new Persona ("Iram", "Navarrete", 19, true, 1700));
        sPersona.add(new Persona ("Roberto", "Espino", 19, true, 1800));
//        for (Persona sPersona1 : sPersona) {
//            System.out.println("Nombre: " + sPersona1.getsNom() + "\n" + 
//                    "Apellido: " + sPersona1.getsApe() + "\n"+
//                    "Edad: " + sPersona1.getiEdad() + "\n" +
//                    "Sexo: " + sPersona1.isbSex() + "\n"+
//                    "Salario: " + sPersona1.getdSal() + "\n");
//        }
//        Comparator cmCriterioOrden = new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                Persona p1=(Persona)o1;
//                Persona p2=(Persona)o2;
//                String sApe1, sApe2;
//                sApe1=p1.getsApe();
//                sApe2=p1.getsApe();
//                char c1, c2;
//                c1=sApe1.charAt(0);
//                c2=sApe2.charAt(0);
//                return c1 - c2;
//                }
//        };
//        Collections.sort(sPersona, cmCriterioOrden);
        for (Persona sPersona1 : sPersona) {
            System.out.println("Edad" + sPersona1.getiEdad() + "\n" +
                    "" +
                    "" +
                    "" +
                    "");
            
        }
        
    }
        private String sNom;
    private String sApe;
    private int iEdad;
    private boolean bSex;
    private double dSal;

    public PRINCIPAL(String sNom, String sApe, int iEdad, boolean bSex, double dSal) {
        this.sNom = sNom;
        this.sApe = sApe;
        this.iEdad = iEdad;
        this.bSex = bSex;
        this.dSal = dSal;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public boolean isbSex() {
        return bSex;
    }

    public void setbSex(boolean bSex) {
        this.bSex = bSex;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }
    
}

