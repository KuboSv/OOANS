package Model;

import java.util.List;

public class Mechanik extends Pouzivatel {
    private List<Vozidlo> priradeneVozidla;
    private boolean zaneprezdneny;

    public Mechanik(String meno, String priezvisko, boolean zaneprezdneny) {
        super(meno, priezvisko);
        this.zaneprezdneny = zaneprezdneny;
    }
}
