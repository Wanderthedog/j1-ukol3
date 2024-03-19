package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public Disk() {
    }

    public Disk(long kapacita, long vyuziteMisto) {
        this.kapacita = kapacita;
        this.vyuziteMisto = vyuziteMisto;
    }

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto >= 0 && vyuziteMisto <= kapacita) {
            this.vyuziteMisto = vyuziteMisto;
        } else {
            System.err.println("Pokoušíte se využít zápornou nebo větší kapacitu disku");
        }
    }

    @Override
    public String toString() {
        return "Disk: kapacita je " + kapacita + "B " + " a vyuzite misto je " + vyuziteMisto + "B";
    }
}