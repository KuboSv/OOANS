package Controller;

import Model.Autodiel;
import Model.Vozidlo;

import java.util.ArrayList;
import java.util.List;

public class SpravcaAutodielov {
    private List<Autodiel> autodiely = new ArrayList<Autodiel>();

    public void pridajAutodiel(Autodiel autodiel) {
        this.autodiely.add(autodiel);
    }

    public List<Autodiel> vyhladajDiel(String ean) {

        List<Autodiel> au = new ArrayList<Autodiel>();

        for (int i = 0; i < this.autodiely.size(); i++) {
            if (this.autodiely.get(i).getEan().equals(ean)) {
                if (this.autodiely.get(i).getMnozstvo() != 0) {
                    au.add(this.autodiely.get(i));
                } else {
                    System.out.println("Zvoleny diel nie je na sklade!");
                }
            }
        }
        return au;
    }

    public List<Autodiel> znizStavZasob(String ean, int mnozstvo) {

        List<Autodiel> au = new ArrayList<Autodiel>();

        for (int i = 0; i < this.autodiely.size(); i++) {
            if (this.autodiely.get(i).getEan().equals(ean)) {
                int aktualneMnozstvo = this.autodiely.get(i).getMnozstvo();
                if (mnozstvo > aktualneMnozstvo) {
                    System.out.println("Nedostatok tovaru na sklade!");
                } else {
                    this.autodiely.get(i).setMnozstvo(aktualneMnozstvo - mnozstvo);
                    System.out.println("Stav Zasob bol Znizeny!");
                }
            }
        }
        return au;
    }
}
