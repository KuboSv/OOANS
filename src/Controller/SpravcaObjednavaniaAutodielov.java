package Controller;

import Model.APIDodavatela;
import adapter.Adapter;
import java.util.List;

public class SpravcaObjednavaniaAutodielov {
    public List<String> vyhladajProdukt(String ean) {

        APIDodavatela api = new APIDodavatela();
        Adapter adapter = new Adapter(api);
        return adapter.VyhladajProdukt(ean);
    }

    public boolean objednajDiel(String ean, String mnozstvo, String priezvisko) {

        APIDodavatela api = new APIDodavatela();
        Adapter adapter = new Adapter(api);
        return adapter.VytvorObjednavku(ean, mnozstvo, priezvisko);
    }
}
