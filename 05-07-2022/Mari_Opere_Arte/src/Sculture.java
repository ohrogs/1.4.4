public class Sculture extends Opera{
    protected double p, ore;
    protected String materiale;
    public Sculture()
    {
        super();
        p = 0; ore = 0;
        materiale = null;
    }

    public Sculture(double p)
    {
        super();
        this.p = p;
    }

    public Sculture(String autore, int anno,String codice, String descr, double l , double h, double p, String materiale,double euro, boolean restaurato, double ore)
    {
        super(autore, anno, codice, descr, l, h, euro, restaurato);
        this.p = p;
        this.ore = ore;
        this.materiale = materiale;
    }

    public String toString() {
        return super.toString() + " DIM(LXHXP) = (" + l + "X" + h + "X" + p +")"
                +"\n Numero di ore impiegate = " + ore +
                "\n Materiale = " + materiale;
    }
}
