import java.util.List;
import java.util.Scanner;

public class Main {
    //Rettangolo test();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        ListaRect elencoRettangoli = new ListaRect();
        ListaCerchi elencoCerchi = new ListaCerchi();
        do {
            System.out.println("Inserisca 1 per il rettangolo e 2 per il cerchio");
            int choice = input.nextInt();
            switch (choice) {
                case 2:
                    double r;
                    do {
                        System.out.println("Inserisca un raggio");
                        r = input.nextDouble();
                    } while (r <= 0);
                    Cerchio c1 = new Cerchio(r);
                    //c1.printAll();
                    elencoCerchi.append(c1);
                    break;
                case 1:
                    float b, h;
                    do {
                        System.out.println("Inserisca la base");
                        b = input.nextFloat();
                    } while (b <= 0);
                    do {
                        System.out.println("Inserisca l'altezza");
                        h = input.nextFloat();
                    } while (h <= 0);
                    Rettangolo r0 = new Rettangolo(h, b);
                    //r0.printAll();
                    elencoRettangoli.append(r0);
                    break;
                default:
                    loop = false;
                    break;
            }
        }while(loop);

        elencoCerchi.printAll();
        elencoRettangoli.printAll();

    }

    static Rettangolo test(){
        return new Rettangolo(3,3);
    }

    static float maxRect(Rettangolo[] elenco)
    {
        float max = elenco[0].area();
        /*for(int i = 1; i < elenco.length; i++)
        {
            if(max < elenco[i].area())
            {
                max = elenco[i].area();
            }
        }*/

        for (Rettangolo x : elenco) {
            if(max < x.area()) {
                max = x.area();
            }
        }
        return max;
    }

}