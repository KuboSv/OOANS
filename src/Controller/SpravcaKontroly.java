package Controller;

import Model.Mechanik;
import Model.ServisnyZakrok;
import Model.Vozidlo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SpravcaKontroly {
    private Mechanik prihlasenyMechanik;
    private List<Vozidlo> vozidla;

    public SpravcaKontroly() {

        SpravcaMechanikov spravcaM = new SpravcaMechanikov();
        this.prihlasenyMechanik = spravcaM.getMechanikovia().get(0);
        this.prihlasenyMechanik.pridajPriradeneVozidla(new Vozidlo(1, "SEDAN", "BMW", "nakontrolu", 12040, false));
        this.prihlasenyMechanik.pridajPriradeneVozidla(new Vozidlo(2, "COMBI", "SKODA", "nakontrolu", 9800, true));

    }

    public void zaevidujStavKontroly(int idVozidla, String stavVozidla) {
        ServisnyZakrok servisnyZakrok = new ServisnyZakrok("kontrola", prihlasenyMechanik.getPriezvisko(), idVozidla, stavVozidla);
        //add to db
        System.out.println("Stav vozidla bol Zaevidovany!");
    }


    public List<Vozidlo> vyhladajVozidlaMechanika() {
        vozidla = prihlasenyMechanik.getPriradeneVozidla();
        return vozidla;
    }

}
