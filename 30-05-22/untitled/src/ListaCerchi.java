public class ListaCerchi {
    private Cerchio[] elenco = null;
    public int dim;

    public ListaCerchi()
    {
        elenco = new Cerchio[999];
        dim=0;
    }

    public void append(Cerchio c)
    {
        elenco[dim++] = c;
    }

    public void printAll()
    {
        for (int i = 0; i<dim; i++)
        {
            System.out.print("[" + i + "]");
            elenco[i].printAll();
        }
    }

}
