package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");//info o spusteni



        //PAMET
        Pamet janaPamet = new Pamet();
        janaPamet.setKapacita(500_5000_5000L);
        System.out.println(janaPamet.toString());

        //PROCESOR
        Procesor janaProcesor = new Procesor();
        janaProcesor.setRychlost(3_490_000_000L);
        janaProcesor.setVyrobce("Lenovo");
        System.out.println(janaProcesor.toString());


        //DISK
        Disk janaDisk = new Disk();
        janaDisk.setKapacita(85254441L);
        janaDisk.setVyuziteMisto(50000000L);
        System.out.println(janaDisk.toString());


        //POCITAC
        Pocitac janaPocitac = new Pocitac();
        janaPocitac.zapniSe(); // nema neco nastavene

        janaPocitac.setCpu(janaProcesor);
        janaPocitac.setRam(janaPamet);
        janaPocitac.setPevnyDisk(janaDisk);
        System.out.println(janaPocitac.toString());

        janaPocitac.zapniSe(); //false
        janaPocitac.zapniSe();//uz je zapnuty

        janaPocitac.vypniSe(); // true
        janaPocitac.vypniSe(); // uze je vypnuty



    }

}
