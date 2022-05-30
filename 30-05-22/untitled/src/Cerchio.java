public class Cerchio {
    private double r;
    private double diametro;

    public Cerchio()
    {
        r=1;
        diametro=1*1;
    }

    public Cerchio(double r)
    {
        this.r = r;
        this.diametro = r*2;
    }

    public void setR(double r) {
        this.r = r;
        this.diametro = r*2;
    }

    public double getR() {
        return r;
    }

    public double circonferenza()
    {
        return diametro*Math.PI;
    }

    public double area()
    {
        return r*r*Math.PI;
    }

    public void printAll()
    {
        System.out.println("raggio = " + r + " diametro = " + diametro + " Area = " + this.area() + " Circonferenza = " + this.circonferenza());
    }
}
