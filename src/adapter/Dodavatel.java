package adapter;

import java.util.List;

public interface Dodavatel {

    boolean VytvorObjednavku(String ean, String mnozstvo, String priezvisko);

    List<String> VyhladajProdukt(String ean);
}
