import java.util.ArrayList;

public class Pila {
    public ArrayList<Object> pila;

    public void append(Object o)
    {
        pila.add(o);
    }

    public Object remove(int pos)
    {
        if(!pila.contains())
        return pila.remove(pos);
    }
}
