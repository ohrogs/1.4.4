import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Coda coda = new Coda();
        boolean check = true;
        Scanner keyb = new Scanner(System.in);
        do {
            menu1();
            System.out.println("Inserisca un numero intero");
            int scelta = keyb.nextInt();
            keyb.nextLine();
            switch (scelta){
                case 1:
                    System.out.println("Inserisca un numero intero da inserire");
                    pila.push(keyb.nextInt());
                    System.out.println("Inserito...");
                    cleanConsole(10);
                    break;

                case 2:
                    System.out.println("Elemento rimosso: " + pila.pop());
                    break;

                case 3:
                    System.out.println("Stampa:");
                    System.out.println(pila.allInfo());
                    break;

                case 4:
                    System.out.println("Inserisca un numero intero da inserire");
                    coda.enqueue(keyb.nextInt());
                    System.out.println("Inserito...");
                    cleanConsole(10);
                    break;

                case 5:
                    System.out.println("Elemento rimosso: " + coda.dequeue());
                    break;

                case 6:
                    System.out.println("Stampa:");
                    System.out.println(coda.allInfo());
                    break;

                default:
                    check = false;
                    break;
            }
        }while(check);

    }

    private static void menu1()
    {
        System.out.println("Premere");
        System.out.println("-1 per inserire un elemento nella pila");
        System.out.println("-2 per rimuovere un elemento dalla pila");
        System.out.println("-3 per stampare la pila");
        System.out.println("-4 per inserire un elemento nella coda");
        System.out.println("-5 per rimuovere un elemento dalla coda");
        System.out.println("-6 per stampare la coda");
        System.out.println("-0 o altro per uscire");
    }
    private static void cleanConsole(int q)
    {
        for (int i = 1; i <= q; i++)
            System.out.println("");
    }

}
