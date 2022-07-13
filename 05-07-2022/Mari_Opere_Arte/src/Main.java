import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mostra mostra = new Mostra();
        RiempiMostra(mostra);
        PrintMostra(mostra);
        ArrayList<Opera> antiche = mostra.Antiche();
        PrintAntiche(antiche);
        PrintDipinti(mostra.DipintiOrdinati());

    }

    private static void PrintDipinti(ArrayList<Dipinti> m)
    {
        for (Dipinti a: m) {
            System.out.println(a);
        }
    }
    private static void PrintAntiche(ArrayList<Opera> m)
    {
        for (Opera a: m) {
            System.out.println(a.autore + " "+ a.codice + " " + a.codice);
        }
    }

    private static void PrintMostra(Mostra m)
    {
        for (Opera a: m.elenco) {
            System.out.println(a + "\n");
        }
    }

    private static void RiempiMostra(Mostra mostra)
    {
        try {
            //Dipinto1 = new Dipinti("Carlo Brozzo", 1995, "555", "QUADRO DEI GENOANI", 15.5, 15.5, 66.6, true, "CARLO BROZZO", "stoffa");
            for(int i = 1; i <= 10; i++)
            {
                if(i%2 == 0)
                {
                    mostra.add(new Dipinti("Carlo Brozzo", 1795, "555" + i, "QUADRO DEI GENOANI", 15.5, 15.5, 66.6, true, "CARLO BROZZO", "stoffa"));
                    mostra.add(new Dipinti("Carlo Brozzo", 1995+i , "555" + i*10, "QUADRO DEI GENOANI", 15.5+i, 15.5+i, 66.6+i, false, "CARLO BROZZO", "tela"));
                }
                else
                {
                    mostra.add(new Sculture("Comune di genova", 1795, "111" + i, "Primocanale", 15.5, 15.5, 18.0, "Catrame", 5, true, 55+i));
                    mostra.add(new Sculture("Comune di genova", 1995+i, "111" + i*10, "Primocanale", 15.5, 15.5, 18.0, "Bronzo", 5, false, 55+i*10));
                }
            }
        }
        catch (WrongTypeGiven a)
        {
            a.printStackTrace();
        }
    }
}
