public class Opera {
    protected double l, h, euro;
    protected int anno;
    protected boolean restaurato;
    protected String codice, descr, autore;

    public Opera()
    {
        l = 0;h = 0;euro = 0; anno = 0;
        codice = null; descr = null; autore = null;
        restaurato = true;
    }

    public Opera(double l)
    {
        this();
        this.l=l;
    }

    public Opera(double l , double h)
    {
        this(l);
        this.h = h;
    }

    public Opera(double l , double h, double euro)
    {
        this(l, h);
        this.euro = euro;
    }

    public Opera(double l , double h, double euro, String codice)
    {
        this(l, h, euro);
        this.codice = codice;
    }

    public Opera(double l , double h, double euro, String codice, String descr)
    {
        this(l, h, euro, codice);
        this.descr = descr;
    }

    public Opera(String autore, String codice, String descr, double l , double h, double euro)
    {
        this(l, h, euro, codice, descr);
        this.autore = autore;
    }

    public Opera(String autore, int anno,String codice, String descr, double l , double h, double euro)
    {
        this(autore, codice, descr, l, h, euro);
        this.anno = anno;
    }
    public Opera(String autore, int anno,String codice, String descr, double l , double h, double euro, boolean restaurato)
    {
        this(autore, anno, codice, descr, l, h, euro);
        this.restaurato = restaurato;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    //@Override
    public String toString() {
        return codice + " " + autore + " " + anno +
                "\nRestaurato = " + restaurato +
                "\n" + descr +
                "\nprezzo = " + euro + "$" ;
    }
}
