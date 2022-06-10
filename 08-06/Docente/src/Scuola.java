import javax.print.Doc;
import java.util.Dictionary;

public class Scuola {
    private Docente[] Elenco = null;
    public int curr;

    public Scuola()
    {
        Elenco = new Docente[999];
        curr = 0;
    }

    public Scuola(Scuola nuovo)
    {
        this.Elenco = nuovo.Elenco;
        this.curr = nuovo.curr;
    }

    public Scuola(int dim)
    {
        Elenco = new Docente[dim];
        curr = 0;
    }

    public int getLen()
    {
        return Elenco.length;
    }
    public boolean append(Docente d)
    {
        if(Elenco.length == curr)
        {
            return false;
        }
        Elenco[curr++] = d;
        return true;
    }

    public Docente[] getElenco() {
        return Elenco;
    }

    public Docente getDoc(int i)
    {
        if(i > curr)
        {
            return new Docente();
        }
        return Elenco[i];
    }

    public String getInfo(int i)
    {
        /*if(curr == 1)
        {
            return Elenco[0].getInfo();
        }*/

        if(i > curr)
        {
            return "SUIII";
        }
        return Elenco[i].getDinfo();
    }

    public Docente piuVecchio()
    {
        if(curr == 1)
        {
            return Elenco[0];
        }
        Docente aux = Elenco[0];
        for (int i = 0; i < curr; i++){
            if(Elenco[i].getEta() > aux.getEta())
            {
                aux = Elenco[i];
            }
        }
        return aux;
    }

    private int contaSopraMedia()
    {
        int conta = 0;
        for (int i = 0; i < curr; i++){
            if(Elenco[i].getEta() > getMediaEta())
            {
                conta++;
            }
        }
        return conta;
    }

    public float getMediaEta()
    {
        if(curr == 1)
        {
            return Elenco[0].getEta();
        }
        float sum = 0;
        for (int i = 0; i < curr; i++){
            sum += (float)Elenco[i].getEta();
        }
        return sum/((float)curr-1);
    }

    public float percEta()
    {
        return ((float)contaSopraMedia()/((float)curr-1)*(float)100);
    }

    public Docente fetch(String matricola)
    {
        for(Docente x : Elenco)
        {
            if(x.getMatricola().equals(matricola))
                return x;
        }
        return new Docente();
    }
}
