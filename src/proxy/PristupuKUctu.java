package proxy;

import Model.Pouzivatel;

public class PristupuKUctu implements SpravcaPristupuKUctu {

    @Override
    public void vyplatMzdy(Pouzivatel pouzivatel) {
        System.out.println("Platobne prikazy boli vytvorene, uctovnickou :" + pouzivatel.getMeno() + " " + pouzivatel.getPriezvisko());
    }
}
