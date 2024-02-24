package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
        //PAMET
        Pamet janaPamet = new Pamet();
        janaPamet.setKapacita(33_000_000_000L);

        //PROCESOR
        Procesor janaProcesor = new Procesor();
        janaProcesor.setRychlost(3_490_000_000L);
        janaProcesor.setVyrobce("Lenovo");

        //DISK
        Disk janaDisk = new Disk();
        janaDisk.setKapacita(85254441L);
        janaDisk.setVyuziteMisto(50000000L);

        //POCITAC
        Pocitac janaPocitac = new Pocitac();

        janaPocitac.setCpu(janaProcesor);
        janaPocitac.setRam(janaPamet);
        janaPocitac.setPevnyDisk(janaDisk);

        System.out.println(janaDisk.toString());
        System.out.println(janaPamet.toString());
        System.out.println(janaProcesor.toString());

        janaPocitac.zapniSe(); // Počítač se zapne
        System.out.println(janaPocitac.toString());

       // janaPocitac.vypniSe(); // Počítač se vypne
      //  System.out.println(janaPocitac.toString());



    }

}
