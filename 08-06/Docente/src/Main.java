import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scuola natta = new Scuola(80);
        Scanner keyb = new Scanner(System.in);
        boolean k = true;
        do
        {
            printMenu();
            //System.out.println(natta.getLen());
            System.out.print("Inserire scelta>");
            int choice = keyb.nextInt();
            switch (choice)
            {
                case 1:
                    flush(50);
                    if(natta.append(inputDocente()))
                    {
                        System.out.println("tutto ok");
                    }
                    else
                    {
                        System.err.println("Eh e' la vita...");
                    }
                    break;
                case 2:
                    flush(50);
                    for(int i = 0; i < natta.curr; i++)
                    {
                        System.out.println(natta.getInfo(i));
                    }
                    break;
                case 3:
                    flush(50);
                    System.out.println(natta.piuVecchio().getDinfo());
                    break;
                case 4:
                    flush(50);
                    if(natta.append(new Docente()))
                    {
                        System.out.println("tutto ok");
                    }
                    else
                    {
                        System.err.println("Eh e' la vita...");
                    }
                    break;
                case 5:
                    flush(50);
                    System.out.println("Media etá= " + natta.getMediaEta() + " Percentuale superiore alla media" +
                            "= " + natta.percEta() + "%");
                    break;
                case 6:
                    flush(50);
                    String i = getString("Inserisca la matricola");
                    System.out.println(natta.fetch(i).getDinfo());
                    break;
                case 7:
                    flush(50);
                    ScuolaTest(natta, 10);
                    break;
                default:
                    k = false;
                    break;
            }

        }while (k);

    }

    private static void printMenu()
    {
        System.out.println("1 Inserire docente");
        System.out.println("2 Visualizzazione");
        System.out.println("3 Docente piu' vecchio");
        System.out.println("4 Inserimento Docente()");
        System.out.println("5 Stampa percentuale e media eta'");
        System.out.println("6 Fetchare una matricola");
        System.out.println("7 Inserire 10 alunni generati progressivamente");
        System.out.println("0 o altro per uscire");
    }

    private static void ScuolaTest(Scuola scuola, int dim)
    {
        String defaultN = "Giacomo";
        String defaultC = "Pastorino";
        Materia defaultM = new Materia("Materia scolastica", "Random", ThreadLocalRandom.current().nextInt(1, 998 + 1));
        for(int i = 0; i < dim; i++)
        {
            scuola.append(new Docente(defaultN+i, defaultC+i, String.valueOf(ThreadLocalRandom.current().nextInt(0, i + 1)),ThreadLocalRandom.current().nextInt(0, 99 + 1), defaultM));
        }
    }

    private static String getString(String string)
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println(string);
        return keyb.nextLine();
    }

    private static int getInt(String string)
    {
        Scanner keyb = new Scanner(System.in);
        System.out.println(string);
        return keyb.nextInt();
    }

    private static Docente inputDocente()
    {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Inserisca nome>");
        String nome = keyb.nextLine();
        System.out.print("Inserisca cognome>");
        String cognome = keyb.nextLine();
        System.out.print("Inserisca matricola>");
        String matricola = keyb.nextLine();
        System.out.print("Inserisca nome materia>");
        String nomeMateria = keyb.nextLine();
        System.out.print("Inserisca descrizione materia>");
        String descrMateria = keyb.nextLine();
        System.out.print("Inserisca ore insegnate della materia>");
        int ore = keyb.nextInt();
        System.out.print("Inserisca eta>");
        int eta = keyb.nextInt();
        return new Docente(nome, cognome, matricola, eta, new Materia(nomeMateria, descrMateria, ore));
    }

    private static void flush(int len)
    {
        for (int i = 0; i<len; i++)
        {
            System.out.println("");
        }
    }
}
