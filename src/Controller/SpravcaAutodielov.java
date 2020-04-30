package Controller;

import Model.Autodiel;
import Model.Vozidlo;

import java.util.ArrayList;
import java.util.List;

public class SpravcaAutodielov {
    private List<Autodiel> autodiely = new ArrayList<Autodiel>();

    public SpravcaAutodielov(){
        this.autodiely.add(new Autodiel(1, "0123", "motorovyOlej", 5, true, "A1", 5.54));
        this.autodiely.add(new Autodiel(2, "0124", "brzdovaKvapalina", 0, true, "A1", 4.01));
        this.autodiely.add(new Autodiel(3, "0125", "Pelovyfilter", 1, false, "A2", 8));
        this.autodiely.add(new Autodiel(4, "0126", "brzdoveDosticky", 0, false, "A3", 10.99));
        this.autodiely.add(new Autodiel(5, "0127", "brzdovyKotuc", 3, false, "A3", 20));
    }

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
