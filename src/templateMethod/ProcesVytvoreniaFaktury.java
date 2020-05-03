package templateMethod;

import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;

public abstract class ProcesVytvoreniaFaktury {

    Vozidlo vozidlo;
    Zakaznik zakaznik;
    Predajca predajca;

    public final void vystavFakturu() {
        pridajOsobneUdaje();
        pridajZodpovednuOsobu();
        pridajPolozkyFaktury();
        vytlac();
    }

    private void pridajOsobneUdaje() {
        System.out.println("Zakaznik: " + zakaznik.getMeno() + " " + zakaznik.getPriezvisko());
        System.out.println("Boli pridane udaje zakaznika!");
    }

    private void pridajZodpovednuOsobu() {
        System.out.println("Zamestnanec: " + predajca.getMeno() + " " + predajca.getPriezvisko());
        System.out.println("Boli pridane udaje o zodpovednej osobe!");
    }

    abstract void pridajPolozkyFaktury();

    private void vytlac() {
        System.out.println("Faktura bola Vylacena!");
    }

}
