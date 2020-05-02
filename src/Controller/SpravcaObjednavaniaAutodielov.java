package Controller;

import Model.APIDodavatela1;
import Model.APIDodavatela2;
import adapter.JsonAdapter;
import adapter.XmlAdapter;

import java.util.List;

public class SpravcaObjednavaniaAutodielov {
    private int zvolDodavatela;

    public List<String> vyhladajProdukt(String ean) {

        APIDodavatela1 api = new APIDodavatela1();
        JsonAdapter jsonAdapter = new JsonAdapter(api);
        List<String> najdenyProdukt1 = jsonAdapter.VyhladajProdukt(ean);

        APIDodavatela2 api2 = new APIDodavatela2();
        XmlAdapter xmlAdapter = new XmlAdapter(api2);
        List<String> najdenyProdukt2 = xmlAdapter.VyhladajProdukt(ean);

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
            JsonAdapter jsonAdapter = new JsonAdapter(api);
            return jsonAdapter.VytvorObjednavku(ean, mnozstvo, priezvisko);
        } else if (zvolDodavatela == 2) {
            APIDodavatela2 api2 = new APIDodavatela2();
            XmlAdapter xmlAdapter = new XmlAdapter(api2);
            return xmlAdapter.VytvorObjednavku(ean, mnozstvo, priezvisko);
        }
        return false;
    }
}
