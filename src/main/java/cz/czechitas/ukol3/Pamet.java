package cz.czechitas.ukol3;


public class Pamet {
    private long kapacita;

    public Pamet() {
    }

    public Pamet(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return "Pamet: kapacita je " + kapacita + "B";
    }
}