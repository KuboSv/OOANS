package templateMethod;

import Model.Vozidlo;
import Model.Zakaznik;

public class VystavFakturuZaDiely extends ProcesVytvoreniaFaktury {

    public VystavFakturuZaDiely(Zakaznik zakaznik, Vozidlo vozidlo) {
        this.vozidlo = vozidlo;
        this.zakaznik = zakaznik;
    }

    @Override
    void vytlac() {
        System.out.println("Faktura bola Vylacena!");
    }

    @Override
    void pridajZodpovednuOsobu() {
        System.out.println("Boli pridane udaje o zodpovednej osobe!");
    }

    @Override
    void pridajPolozkyFaktury() {
        System.out.println("Boli pridane autodiely do Faktury!");
    }

    @Override
    void pridajOsobneUdaje() {
        System.out.println("Boli pridane udaje zakaznika!");
    }
}
