package Model;

import java.util.ArrayList;
import java.util.List;

public class Mechanik extends Pouzivatel {
    private List<Vozidlo> priradeneVozidla= new ArrayList<>();
    private boolean zaneprezdneny;

    public Mechanik(String meno, String priezvisko, boolean zaneprezdneny) {
        super(meno, priezvisko);
        this.zaneprezdneny = zaneprezdneny;
    }

    public List<Vozidlo> getPriradeneVozidla() {
        return priradeneVozidla;
    }

    public void pridajPriradeneVozidla(Vozidlo priradeneVozidlo) {
        this.priradeneVozidla.add(priradeneVozidlo);
    }
}
