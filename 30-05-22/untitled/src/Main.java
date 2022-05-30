import java.util.Scanner;

public class Main {
    //Rettangolo test();

    public static void main(String[] args) {
        /*Rettangolo r0 = new Rettangolo();
        Rettangolo r1 = new Rettangolo(7, 3);
        Rettangolo r3 = test();
        System.out.println("Area r1 = " + r1.area() + " 2p r2 = " + r1.perimetro() + "Diagonale = " + r1.diagonale());
        System.out.println("Area r3 = " + r3.area() + " 2p r3 = " + r3.perimetro());
        Rettangolo[] elenco = new Rettangolo[3];
        elenco[0] = r0;
        elenco[1] = r1;
        elenco[2] = r3;
        System.out.println("Area max = " + maxRect(elenco));

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisca 1 per il rettangolo e 2 per il cerchio");
        int choice = input.nextInt();
        switch (choice){
            case 2:
                double r;
                do
                {
                    System.out.println("Inserisca un raggio");
                    r = input.nextDouble();
                }while(r<=0);
                Cerchio c1 = new Cerchio(r);
                c1.printAll();
                break;
            case 1:
                float b, h;
                do
                {
                    System.out.println("Inserisca la base");
                    b = input.nextFloat();
                }while (b<=0);
                do
                {
                    System.out.println("Inserisca l'altezza");
                    h = input.nextFloat();
                }while (h<=0);
                Rettangolo r0 = new Rettangolo(h, b);
                r0.printAll();
                break;
            default:
                System.err.println("errore");
                break;
        }

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