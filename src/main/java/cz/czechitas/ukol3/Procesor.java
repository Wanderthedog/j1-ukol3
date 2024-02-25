package cz.czechitas.ukol3;
import java.util.Objects;

public class Procesor {
    public String vyrobce;

    public long rychlost;

    public Procesor() {
    }

    public Procesor(String vyrobce, long rychlost) {
        this.vyrobce = vyrobce;
        this.rychlost = rychlost;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = Objects.requireNonNull(vyrobce);
        if (vyrobce.isBlank()) {
            System.err.println("Vyrobce musi byt vyplnen.");
            return;
        }
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        this.rychlost = rychlost;
    }

    @Override

    public String toString() {
            if (vyrobce == null || vyrobce.isEmpty()){
            return "Procesor: vyrobce je neznámý, rychlost je " + rychlost + " Hz";
        } else {
            return "Procesor: vyrobce je " + vyrobce + ", rychlost je " + rychlost + " Hz";
        }
    }
}