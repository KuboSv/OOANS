package Controller;

import java.util.*;

import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;

public class SpravcaVozidiel {

    private List<Vozidlo> vozidla = new ArrayList<Vozidlo>();


    public SpravcaVozidiel() {

        this.vozidla.add(new Vozidlo(1, "SEDAN", "BMW", "voprave", 12040, false));
        this.vozidla.add(new Vozidlo(2, "COMBI", "SKODA", "vporiadku", 9800, true));
        this.vozidla.add(new Vozidlo(3, "SUV", "MERCEDES", "vporiadku", 6800, true));
        this.vozidla.add(new Vozidlo(4, "SEDAN", "AUDI", "voprave", 16800, false));
        this.vozidla.add(new Vozidlo(5, "LIFTBACK", "MACLAREN", "vporiadku", 36800, true));
        this.vozidla.add(new Vozidlo(4, "COMBI", "SKODA", "vporiadku", 16800, true));
        this.vozidla.add(new Vozidlo(5, "LIFTBACK", "MACLAREN", "vporiadku", 36100, true));
    }

    public List<Vozidlo> vyhladajVozidlo(String druh, String znacka) {

        List<Vozidlo> vo = new ArrayList<Vozidlo>();

        for (int i = 0; i < this.vozidla.size(); i++) {
            if (this.vozidla.get(i).getDruh().equals(druh) && this.vozidla.get(i).getZnacka().equals(znacka)) {
                if (this.vozidla.get(i).getStav().equals("vporiadku")) {
                    vo.add(this.vozidla.get(i));
                } else {
                    System.out.println("Zvolene vozidlo nieje aktualne dobrom stave, zvol si ine prosim!");
                }
            }
        }
        return vo;
    }


    public boolean zistiDostupnost(Vozidlo vozidlo) {

        boolean dostupne = false;
        if (vozidlo.isDostupnost()) {
            dostupne = true;
        }

        return dostupne;
    }

    public SpravcaFaktur zaevidujVozidlo(Predajca predajca, Zakaznik zakaznik, String druh, String znacka, int cena) {
        Vozidlo vozidlo = new Vozidlo(10, druh, znacka, "pripaveneNaKontrolu", cena, false);
        vozidla.add(vozidlo);

        SpravcaFaktur faktura = new SpravcaFaktur(predajca, zakaznik, vozidlo);
        return faktura;
    }

    public void dokonciZaevidovanie() {
        Vozidlo vozidlo = vozidla.get(vozidla.size() - 1);
        SpravcaMechanikov spravcaM = new SpravcaMechanikov();
        spravcaM.priradVozidloMechanikovi(vozidlo);
        System.out.println("Vozidlo bolo priradene mechanikovi!");
    }
}
