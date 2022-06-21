import java.util.LinkedList;

public class Struttura {
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
