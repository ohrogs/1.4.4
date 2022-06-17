public class Azienda {
    private Dipendente[] lista = null;
    private int n;

    public Azienda()
    {
        n=0;
        lista = new Dipendente[100];
    }

    public Azienda(int dim) throws Exception
    {
        if(dim <= 0)
            throw new wrongIndex("Hai fatto una belinata");
        n=0;
        lista = new Dipendente[dim];
    }

    public int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }

    public void append(Dipendente o)
    {
        if (n==lista.length)
        {
            expand();
            lista[n++]=o;
        }
        else
        {
            lista[n++]=o;
        }
    }

    private void expand()
    {
        Dipendente[] nuovo = new Dipendente[lista.length+10];
        int i=0;
        for(Dipendente o : lista)
        {
            nuovo[i++]=o;
        }
        lista = null;
        lista = nuovo;
    }

    private boolean isIn(String d)
    {
        for(Dipendente o : lista)
        {
            if(o.nome.equals(d))
                return true;
        }
        return false;
    }

    private int fetch(String name)
    {
        for (int i = 0; i < n; i++)
        {
            if(lista[i].nome.equals(name))
                return i;
        }
        return -1;
    }

    public String getInfo(String nome)
    {
        if(!isIn(nome))
        {
            return "Nessun risultato";
        }
        return lista[fetch(nome)].getInfo();
    }

    public String getInfo(int p) throws wrongIndex
    {
        if(p >=  n)
        {
            throw new wrongIndex("Grandissima belinata");
        }
        return lista[p].getInfo();
    }
}
