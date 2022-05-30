public class ListaRect {
    private Rettangolo[] elenco = null;
    public int dim;

    public ListaRect()
    {
        elenco = new Rettangolo[999];
        dim=0;
    }

    public void append(Rettangolo r)
    {
        elenco[dim++] = r;
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
