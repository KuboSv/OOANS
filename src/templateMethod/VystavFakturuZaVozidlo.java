package templateMethod;

import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;

public class VystavFakturuZaVozidlo extends ProcesVytvoreniaFaktury {
	
    public VystavFakturuZaVozidlo(Predajca predajca, Zakaznik zakaznik, Vozidlo vozidlo) {
        this.vozidlo = vozidlo;
        this.zakaznik = zakaznik;
        this.predajca = predajca;
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
        System.out.println("Polozky faktury:");
        System.out.println(vozidlo.getZnacka()+" "+vozidlo.getDruh()+": "+vozidlo.getNakupnaCena());
        System.out.println("Bolo pridane vozidlo do Faktury!");
    }

    @Override
    void pridajOsobneUdaje() {
        System.out.println("Boli pridane udaje zakaznika!");
    }
}
