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
    protected void pridajPolozkyFaktury() {
        System.out.println("Polozky faktury:");
        System.out.println(vozidlo.getZnacka()+" "+vozidlo.getDruh()+": "+vozidlo.getNakupnaCena());
        System.out.println("Celkova cena = " + vozidlo.getNakupnaCena());
        System.out.println("Bolo pridane vozidlo do Faktury!");
    }
}
