package cz.czechitas.ukol3;

import java.util.Objects;

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

             public void zapniSe() {
                 if (ram == null) {
                     System.err.println("Nelze zapnout, chybí pamet.");
                     return;
                 } else {
                     jeZapnuty = false;
                     System.out.println("Pocitac zapnutý.");
                 }
             }

        public void vypniSe() {
            if (!jeZapnuty) {
                return;
            } else {
                jeZapnuty = false;
                System.out.println("Pocitac byl vypnut.");
            }
        }


        @Override
        public String toString() {
            if (jeZapnuty) {
                return "Počítač: zapnutý";
            } else {
                return "Počítač: vypnutý";
            }
        }
            public boolean JeZapnuty() {
                return jeZapnuty;
            }
    }