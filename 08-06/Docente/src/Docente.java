public class Docente {
    private String nome, cognome, matricola;
    private int eta;

    public Docente()
    {
        nome = "null";
        cognome = "null";
        matricola = "null";
        eta = 1;
    }

    public Docente(Docente nuovo)
    {
        this.nome = nuovo.nome;
        this.cognome = nuovo.cognome;
        this.matricola = nuovo.matricola;
        this.eta = nuovo.eta;
    }

    public Docente(String nome, String cognome, String matricola, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDinfo()
    {
        return nome + ", " + cognome + ", " + eta + ", " + matricola;
    }
}