public class Dipendente {
    protected String nome, indirizzo;

    protected double stipendio;
    protected int telefono;

    public Dipendente()
    {
        nome = null;
        indirizzo = null;
        telefono = 0;
        stipendio = 0.0;
    }

    public Dipendente(String nome, String indirizzo, int telefono, double stipendio) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public String getInfo() {
        return "Dipendente{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", stipendio=" + stipendio +
                ", telefono=" + telefono +
                '}';
    }
}
