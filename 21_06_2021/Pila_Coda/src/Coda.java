public class Coda extends Struttura {


    public Coda()
    {
        super();
    }

    public void enqueue(Object o)
    {
        struttura.addLast(o);
    }

    public Object dequeue()
    {
        return struttura.removeFirst();
    }




}
