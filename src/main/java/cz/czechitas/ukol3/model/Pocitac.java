package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }
        long vyuziteMistoPredVytvorenimSouboru = pevnyDisk.getVyuziteMisto();
        long vyuziteMistoPoVytvoreniSouboru = vyuziteMistoPredVytvorenimSouboru + velikost;
        pevnyDisk.setVyuziteMisto(vyuziteMistoPoVytvoreniSouboru);
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty()) {
            return;
        }
        long vyuziteMistoPredMazanimSouboru = pevnyDisk.getVyuziteMisto();
        long vyuziteMistoPoMazaniSouboru = vyuziteMistoPredMazanimSouboru - velikost;
        pevnyDisk.setVyuziteMisto(vyuziteMistoPoMazaniSouboru);
    }

    public void zapniSe() {
        // Pokud je počítač již zapnutý, nelze znovu zapnout
        if (jeZapnuty) {
            System.out.println("Pocitac je jiz zapnut.");
            return;
        }
        // Pokud chybí paměť, nelze počítač zapnout
        if (ram == null) {
            jeZapnuty = false;
            System.err.println("Nelze zapnout, chybí pamet.");
            return;
        }
        // Pokud chybí další komponenty, nelze zabnout
        if (cpu == null || pevnyDisk == null) {
            jeZapnuty = false;
            System.err.println("Nelze zapnout, chybí některá komponenta (procesor, disk).");
            return;
        }
        // Pokud nechybí komponenty, PC se zapne
        jeZapnuty = true;
        System.out.println("Pocitac byl zapnut.");
    }
    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Pocitac byl vypnut.");
        }
    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }
}