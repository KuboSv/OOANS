package proxy;

import Model.Pouzivatel;
import Model.Uctovnik;
import java.util.ArrayList;
import java.util.List;

public class ProxyPristupKUctu implements SpravcaPristupuKUctu {
    private SpravcaPristupuKUctu ucet = new PristupuKUctu();
    private static List<String> povolenyPristup;

    static {
        povolenyPristup = new ArrayList<String>();
        povolenyPristup.add("JanaMokra");
    }

    @Override
    public void vyplatMzdy(Pouzivatel pouzivatel) throws Exception {
        if (!(pouzivatel instanceof Uctovnik) || !(povolenyPristup.contains(pouzivatel.getMeno() + pouzivatel.getPriezvisko()))) {
            throw new Exception("Nemas prava na vyplatenie miezd!");
        }
        ucet.vyplatMzdy(pouzivatel);
    }
}
