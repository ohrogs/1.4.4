public class Impiegato extends Dipendente{
    protected String ufficio;

    public Impiegato(String ufficio) {
        this.ufficio = ufficio;
    }

    public Impiegato(String nome, String indirizzo, int telefono, double stipendio, String ufficio) {
        super(nome, indirizzo, telefono, stipendio);
        this.ufficio = ufficio;
    }

    public String getUfficio() {
        return ufficio;
    }

    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }

    public String getInfo() {
        return "Impiegato{" +
                "ufficio='" + ufficio + '\'' +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", stipendio=" + stipendio +
                ", telefono=" + telefono +
                '}';
    }
}
