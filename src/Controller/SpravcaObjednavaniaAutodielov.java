package Controller;

import Model.APIDodavatela1;
import Model.APIDodavatela2;
import adapter.Adapter1;
import adapter.Adapter2;

import java.util.List;

public class SpravcaObjednavaniaAutodielov {
    private int zvolDodavatela;

    public List<String> vyhladajProdukt(String ean) {

        APIDodavatela1 api = new APIDodavatela1();
        Adapter1 adapter1 = new Adapter1(api);
        List<String> najdenyProdukt1 = adapter1.VyhladajProdukt(ean);

        APIDodavatela2 api2 = new APIDodavatela2();
        Adapter2 adapter2 = new Adapter2(api2);
        List<String> najdenyProdukt2 = adapter2.VyhladajProdukt(ean);

        if (Integer.parseInt(najdenyProdukt1.get(1)) < Integer.parseInt(najdenyProdukt2.get(1))) {
            zvolDodavatela = 1;
            return najdenyProdukt1;
        } else {
            zvolDodavatela = 2;
            return najdenyProdukt2;
        }
    }

    public boolean objednajDiel(String ean, String mnozstvo, String priezvisko) {

        if (zvolDodavatela == 1) {
            APIDodavatela1 api = new APIDodavatela1();
            Adapter1 adapter1 = new Adapter1(api);
            return adapter1.VytvorObjednavku(ean, mnozstvo, priezvisko);
        } else if (zvolDodavatela == 2) {
            APIDodavatela2 api2 = new APIDodavatela2();
            Adapter2 adapter2 = new Adapter2(api2);
            return adapter2.VytvorObjednavku(ean, mnozstvo, priezvisko);
        }
        return false;
    }
}
