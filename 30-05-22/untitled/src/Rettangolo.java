public class Rettangolo {
    private float b, h;

    public Rettangolo()
    {
        b=0;
        h=0;
    }

    public Rettangolo(float h, float b)
    {
        /*if(h < 0 || b < 0)
        {
            System.err.println("IMPOSSIBILE");
            return;
        }*/
        this.b = b;
        this.h = h;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

    public void setB(float b) {
        /*if(b < 0)
        {
            System.err.println("IMPOSSIBILE");
            return;
        }*/
        this.b = b;
    }

    public void setH(float h) {
        /*if(h < 0)
        {
            System.err.println("IMPOSSIBILE");
            return;
        }*/
        this.h = h;
    }

    public float area()
    {
        return b*h;
    }

    public float perimetro()
    {
        return 2*(b+h);
    }

    public double diagonale()
    {
        return Math.sqrt((b*b)+(h*h));
    }

    public void printAll()
    {
        System.out.println("base = " + b + " altezza = " + h + " Area = " + this.area() + " Perimetro = " + this.perimetro());
    }
}
