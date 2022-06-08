import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scuola natta = new Scuola(10);
        Scanner keyb = new Scanner(System.in);
        boolean k = true;
        do
        {
            printMenu();
            System.out.println(natta.getLen());
            System.out.print("Inserire scelta>");
            int choice = keyb.nextInt();
            switch (choice)
            {
                case 1:
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
                    for(int i = 0; i < natta.curr; i++)
                    {
                        System.out.println(natta.getInfo(i));
                    }
                    break;
                case 3:
                    System.out.println(natta.piuVecchio().getDinfo());
                    break;
                case 4:
                    if(natta.append(new Docente()))
                    {
                        System.out.println("tutto ok");
                    }
                    else
                    {
                        System.err.println("Eh e' la vita...");
                    }
                    break;
                /*case 5:
                    System.out.println(natta.getInfo(2));
                    break;*/
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
        //System.out.println("5 Visualizzazione precisa");
        System.out.println("0 o altro per uscire");
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
        System.out.print("Inserisca eta>");
        int eta = keyb.nextInt();
        return new Docente(nome, cognome, matricola, eta);
    }
}
