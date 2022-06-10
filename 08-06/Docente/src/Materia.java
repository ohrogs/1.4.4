public class Materia {
    private String nome, descrizione;
    private float ore;

    public Materia()
    {
        nome = "cazzeggio libero";
        descrizione = "Libero arbitrio (anarchia) per n tempo";
        ore = 666;
    }

    public Materia(String nome, String descrizione, float ore)
    {
        this.nome = nome;
        this.descrizione = descrizione;
        this.ore = ore;
    }

    public String getInfo()
    {
        return nome + ", " + descrizione + ", ore= " + ore;
    }
}
