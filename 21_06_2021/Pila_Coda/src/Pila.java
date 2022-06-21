import java.util.LinkedList;

public class Pila extends Struttura {


    public Pila() {
        struttura = new LinkedList<Object>();
    }

    public void push(Object o)
    {
        struttura.addFirst(o);
    }

    public Object pop()
    {
        return struttura.removeFirst();
    }


}
