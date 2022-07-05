import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedList;

public class Mostra {
    LinkedList<Opera> elenco;
    private int n;

    public Mostra()
    {
        elenco = new LinkedList<Opera>();
        n=0;
    }

    public void add(Opera a)
    {
        elenco.add(a);
        n++;
    }

    public ArrayList<Opera> Antiche()
    {
        ArrayList<Opera> ret = new ArrayList<Opera>();
        //System.out.println(Year.now().getValue());
        for (Opera a:elenco) {
            if((Year.now().getValue() - a.anno)>=50)//la condizione non va
            {
                ret.add(a);
            }
        }
        return ret;
    }
}
