public class Dipinti extends Opera{
    protected String supp, isp;

    public Dipinti()
    {
        super();
        supp = null; isp = null;
    }

    public Dipinti(String isp)
    {
        this();
        this.isp = isp;
    }

    public Dipinti(String autore, int anno,String codice, String descr, double l , double h, double euro, boolean restaurato, String isp, String supp) throws WrongTypeGiven
    {
        super(autore, anno, codice, descr, l, h, euro, restaurato);
        this.isp = isp;
        if (!supp.equals("stoffa") && !supp.equals("tela"))
        {
            throw new WrongTypeGiven("Wrong type given: " + supp + "Instead of stoffa or tela");
        }
        else
        {
            this.supp = supp;
        }
    }



    //@Override
    public String toString() {
        return super.toString() + " DIM(LXH) = (" + l + "X" + h +")"+
                "\n" + "Supporto = " + supp
                +"\n" + "Corrente = " + isp;

    }
}
