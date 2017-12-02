
public class Persona {
    private String sNom;
    private String sApe;
    private int iEdad;
    private boolean bSex;
    private double dSal;

    public Persona(String sNom, String sApe, int iEdad, boolean bSex, double dSal) {
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

