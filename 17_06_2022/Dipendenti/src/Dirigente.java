public class Dirigente extends Dipendente {
    protected String targa;

    public Dirigente()
    {
        super();
        targa = null;
    }

    public Dirigente(String nome, String indirizzo, int telefono, String targa, double stipendio) {
        super(nome, indirizzo, telefono, stipendio);
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getInfo() {
        return "Dirigente{" +
                "targa='" + targa + '\'' +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", stipendio=" + stipendio +
                ", telefono=" + telefono +
                '}';
    }
}
