package adapter;

import Model.APIDodavatela;

import java.util.List;

public class Adapter implements Dodavatel {

    private APIDodavatela api;

    public Adapter(APIDodavatela api){
        this.api= api;
    }

    @Override
    public boolean VytvorObjednavku(String ean, String mnozstvo, String priezvisko) {

        String json = "{\"ean\":\"" + ean + "\",\"mnozstvo\":\"" + mnozstvo + "\",\"mnozstvo\":\"" + priezvisko + "\"}";
        return this.api.Objednaj(json);
    }

    @Override
    public List<String> VyhladajProdukt(String ean) {

        String json = "{\"ean\":\"" + ean + "\"}";
        return this.api.Vyhladaj(json);
    }
}
