public class Operaio extends Dipendente{
    protected String settore;

    public Operaio(String settore) {
        super();
        this.settore = settore;
    }

    public Operaio(String nome, String indirizzo, int telefono, String settore, double stipendio) {
        super(nome, indirizzo, telefono, stipendio);
        this.settore = settore;
    }

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }

    public String getInfo() {
        return "Operaio{" +
                "settore='" + settore + '\'' +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", stipendio=" + stipendio +
                ", telefono=" + telefono +
                '}';
    }
}
