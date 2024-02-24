package cz.czechitas.ukol3;


public class Pocitac {
    private boolean jeZapnuty = false;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Chyba: Počítač je již zapnutý.");
            return;
        }

        if (cpu == null || ram == null || pevnyDisk == null) {
            System.out.println("Chyba: Nelze zapnout počítač - chybí procesor, paměť nebo disk.");
            return;
        }

        jeZapnuty = true;
        System.out.println("Počítač se zapnul.");
    }

    public void vypniSe() {
        if (!jeZapnuty) {
            // Počítač již je vypnutý, ignorujeme opakované vypínání
            return;
        }

        jeZapnuty = false;
        System.out.println("Počítač se vypnul.");
    }

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

    @Override
    public String toString() {
        String stav = jeZapnuty ? "zapnutý" : "vypnutý";

        return "Stav počítače: " + stav + "\n" +
                "Procesor: " + (cpu != null ? cpu.toString() : "Procesor není nainstalován") + "\n" +
                "Paměť: " + (ram != null ? ram.toString() : "Paměť není nainstalována") + "\n" +
                "Pevný disk: " + (pevnyDisk != null ? pevnyDisk.toString() : "Pevný disk není nainstalován");
    }
}
