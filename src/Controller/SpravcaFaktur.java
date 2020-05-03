package Controller;

import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;
import templateMethod.ProcesVytvoreniaFaktury;
import templateMethod.VystavFakturuZaDiely;
import templateMethod.VystavFakturuZaVozidlo;

public class SpravcaFaktur {
    private Vozidlo vozidlo;
    private Zakaznik zakaznik;
    private Predajca predajca;

    public SpravcaFaktur(Predajca predajca, Zakaznik zakaznik, Vozidlo vozidlo) {
        this.vozidlo = vozidlo;
        this.zakaznik = zakaznik;
        this.predajca = predajca;
    }

    public void vystavFakturuZaVozidlo() {
        ProcesVytvoreniaFaktury faktura = new VystavFakturuZaVozidlo(predajca, zakaznik, vozidlo);
        faktura.vystavFakturu();
    }

    public void vystavFakturuZaDiely() {
        ProcesVytvoreniaFaktury faktura = new VystavFakturuZaDiely(predajca, zakaznik, vozidlo);
        faktura.vystavFakturu();
    }
}
