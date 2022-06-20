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
        }
        lista[n++]=o;
    }

    private void expand()//quanto arrivo a dimensione massima espando l'array a mano
    {
        Dipendente[] nuovo = new Dipendente[lista.length+10];
        int i=0;
        for(Dipendente o : lista)//ricopio il vecchio nel nuovo
        {
            nuovo[i++]=o;
        }
        lista = null;//libero la memoria del vecchio
        lista = nuovo;//lista adesso é l'array nuovo
    }

    private void shrink()
    {
        Dipendente[] nuovo = new Dipendente[lista.length-10];
        //int i=0;
        for(int i=0; i<n; i++)//ricopio il vecchio nel nuovo
        {
            nuovo[i]=lista[i];
        }
        lista = null;//libero la memoria del vecchio
        lista = nuovo;//lista adesso é l'array nuovo
    }

    public void remove(String nome)
    {
        if(n==0)
        {
            System.err.println("Non c'é piú nessuno da rimuovere");
        }
        else if(!isIn(nome))
        {
            System.err.println("Nessun utente individuato con questo nome: " + nome);
        }
        else
        {
            for (int i = fetch(nome); i<lista.length-1; i++)
            {
                lista[i]=lista[i+1];
            }
            n--;
            if((lista.length-n)>10)//per esempio se lenght =20 ma n = 9 20-9 = 11 quindi sto sprecando spazio
                shrink();
        }
    }

    private boolean isIn(String d)
    {
        if(d == null)
            return false;
        for(int i = 0; i < n; i++)
        {
            if(lista[i].nome.equals(d))
                return true;
        }
        return false;
    }

    private int fetch(String name)//restituisce la pos di un dato nome
    {
        for (int i = 0; i < n; i++)
        {
            if(lista[i].nome.equals(name))
                return i;
        }
        return -1;//impossibile raggiungere questo return
    }

    public String getInfo(String nome)
    {
        if(!isIn(nome))//se non c'e comunica il fallimento della ricerca
        {
            return "Nessun risultato";
        }
        return lista[fetch(nome)].getInfo();
    }

    public String getInfo(int p) throws wrongIndex
    {
        if(p >=  n)
        {
            throw new wrongIndex("É stato dato un indice inesistente");
        }
        return lista[p].getInfo();
    }
}
