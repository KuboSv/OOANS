package proxy;

import Model.Pouzivatel;

public class PristupuKUctu implements SpravcaPristupuKUctu {

    @Override
    public void vyplatMzdy(Pouzivatel pouzivatel) {
        System.out.println("Platbne prikazy boli vytvorene, uctovnickou :" + pouzivatel.getMeno() + " " + pouzivatel.getPriezvisko());
    }
}
