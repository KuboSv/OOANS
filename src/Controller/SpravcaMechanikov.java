package Controller;

import Model.Mechanik;
import Model.Vozidlo;

import java.util.List;

public class SpravcaMechanikov {
    private List<Mechanik> mechanikovia;
    SpravcaMechanikov(){
        mechanikovia.add(new Mechanik("Jozef","Plochy", true));
        mechanikovia.add(new Mechanik("Milan","Kral", true));
        mechanikovia.add(new Mechanik("Jan","Lomnicky", false));
    }

    public void priradVozidloMechanikovi(Vozidlo vozidlo) {
        //TODO chain
    }
}
