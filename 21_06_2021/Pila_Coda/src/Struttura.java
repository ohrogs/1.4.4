import java.util.LinkedList;

public class Struttura {//Siccome mi sono accorto di usare la stessa lista in tutte e due le classe
    //é venuto naturale pensare di rendere la pila e la coda ereditiere
    protected LinkedList<Object> struttura;

    public Struttura()
    {
        struttura = new LinkedList<Object>();
    }

    public String allInfo()
    {
        String ret = "";
        for(Object o : struttura)
        {
            ret += " " + o;
        }
        return new StringBuilder(ret).reverse().toString(); //Funzione di java5 trovata su google che reversa una stringa
    }

    public Object top()
    {
        return struttura.getFirst();
    }

}
