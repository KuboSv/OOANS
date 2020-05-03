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

    abstract void vytlac();

    abstract void pridajZodpovednuOsobu();

    abstract void pridajPolozkyFaktury();

    abstract void pridajOsobneUdaje();

}
