import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Azienda LiguriaDigitale = createAzienda(10);
        boolean check = true;
        Scanner keyb = new Scanner(System.in);
        do
        {
            printMenu();
            System.out.println("inserisca la sua scelta");
            int scelta = keyb.nextInt();
            switch (scelta)
            {
                case 1:
                    cleanConsole(50);
                    add(LiguriaDigitale);
                    cleanConsole(50);
                    break;

                case 2:
                    fill(LiguriaDigitale, 40);
                    break;

                case 3:
                    cleanConsole(50);
                    try
                    {
                        for (int i = 0; i < LiguriaDigitale.getN(); i++) {
                            System.out.println(i + " " + LiguriaDigitale.getInfo(i));
                        }
                    }
                    catch (wrongIndex e)
                    {
                        e.printStackTrace();
                    }
                    //cleanConsole(LiguriaDigitale.getN());
                    break;

                default:
                    check=false;
                    break;

            }
        }while(check);
    }

    private static Azienda createAzienda(int dim)
    {
        Azienda ret = null;
        try
        {
            ret = new Azienda(dim);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
        /*catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }*/
        finally {
            System.out.println("Azienda creata con successo");
        }
        return ret;
    }

    private static void add(Azienda a)
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Inserisca un nome cognome");
        String nome = keyb.nextLine();
        System.out.println("Inserisca un indirizzo");
        String indirizzo = keyb.nextLine();
        System.out.println("Inserisca un numero di telefono");
        int telefono = keyb.nextInt();
        System.out.println("Inserisca un salario");
        double salario = keyb.nextDouble();
        boolean check = true;
        do {
            printSubMenu();
            System.out.println("inserisca la scelta");
            int scelta = keyb.nextInt();
            keyb.nextLine();
            switch (scelta)
            {
                case 1:
                    System.out.println("Inserisca una targa");
                    String targa = keyb.nextLine();
                    a.append(new Dirigente(nome, indirizzo, telefono, targa, salario));
                    check = false;
                    break;

                case 2:
                    System.out.println("Inserisca un settore");
                    String settore = keyb.nextLine();
                    a.append(new Operaio(nome, indirizzo, telefono, settore, salario));
                    check = false;
                    break;

                case 3:
                    System.out.println("Inserisca un ufficio");
                    String ufficio = keyb.nextLine();
                    a.append(new Impiegato(nome, indirizzo, telefono, salario, ufficio));
                    check = false;
                    break;

                default:
                    System.err.println("hai fatto una belinata");
                    break;
            }
        }while (check);
    }

    private static void printMenu()
    {
        System.out.println("1 per aggiungere un dipendente");
        //System.out.println("2 per rimuovere un dipendente");
        System.out.println("3 per stampare tutto");
        System.out.println("0 o altro per uscire");
    }

    private static void printSubMenu()
    {
        System.out.println("1 per il dirigente");
        System.out.println("2 per l'operaio");
        System.out.println("3 per l'impiegato");
    }

    private static void fill(Azienda a, int dim)
    {
        for(int i = 0; i < dim/3; i++)
        {
            a.append(new Operaio("nome"+i, "indirizzo a caso", 392, "tessile",7.0+i));
            a.append(new Impiegato("nome"+2*i, "indirizzo a caso", 392, 7.0+i, "tessile"));
            a.append(new Dirigente("nome"+3*i, "indirizzo a caso", 392, "eb",7.0+i));

        }

    }

    private static void cleanConsole(int q)
    {
        for (int i = 1; i <= q; i++)
            System.out.println("");
    }
}
