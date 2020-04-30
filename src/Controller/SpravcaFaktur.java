package Controller;

import Model.Vozidlo;
import Model.Zakaznik;
import templateMethod.ProcesVytvoreniaFaktury;
import templateMethod.VystavFakturuZaDiely;
import templateMethod.VystavFakturuZaVozidlo;

public class SpravcaFaktur {
    private Vozidlo vozidlo;
    private Zakaznik zakaznik;

    public SpravcaFaktur(Zakaznik zakaznik,Vozidlo vozidlo){
        this.vozidlo=vozidlo;
        this.zakaznik=zakaznik;
    }
    public void vystavFakturuZaVozidlo(){
        ProcesVytvoreniaFaktury faktura = new VystavFakturuZaVozidlo(zakaznik,vozidlo);
        faktura.vystavFakturu();
    }
    public void vystavFakturuZaDiely(){
        ProcesVytvoreniaFaktury faktura = new VystavFakturuZaDiely(zakaznik,vozidlo);
        faktura.vystavFakturu();
    }
}
