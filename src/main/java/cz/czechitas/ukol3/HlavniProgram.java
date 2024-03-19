package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");//info o spusteni


        //PAMET
        Pamet janaPamet = new Pamet();
        janaPamet.setKapacita(3_706_455_040L);
        System.out.println(janaPamet);

        //PROCESOR
        Procesor janaProcesor = new Procesor();
        janaProcesor.setRychlost(160_000_000L);
        janaProcesor.setVyrobce("Lenovo");
        System.out.println(janaProcesor);


        //DISK
        Disk janaDisk = new Disk();
        janaDisk.setKapacita(510_770_802_688L);
        janaDisk.setVyuziteMisto(121_343_635L);
        System.out.println(janaDisk);


        //POCITAC
        Pocitac janaPocitac = new Pocitac();
        janaPocitac.setRam(janaPamet);
        janaPocitac.setPevnyDisk(janaDisk);
        janaPocitac.zapniSe(); // nema neco nastavene, vypise error hlasku

        //nastaveni PC
        janaPocitac.setCpu(janaProcesor);
        janaPocitac.setRam(janaPamet);
        janaPocitac.setPevnyDisk(janaDisk);
        System.out.println(janaPocitac);

        janaPocitac.zapniSe(); //ma vse nastavene, zepne se
        System.out.println(janaPocitac);
        janaPocitac.vytvorSouborOVelikosti(150_888_88L);
        janaPocitac.vymazSouboryOVelikosti(500_500_500_500L);
        System.out.println(janaDisk);
        janaPocitac.zapniSe();//uz je zapnuty

        janaPocitac.vypniSe(); // true
        System.out.println(janaPocitac);
        janaPocitac.vypniSe(); // uz je vypnuty
        System.out.println(janaPocitac);
    }
}
