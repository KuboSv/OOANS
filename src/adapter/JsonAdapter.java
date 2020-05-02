package adapter;

import Model.APIDodavatela1;

import java.util.List;

public class JsonAdapter implements Dodavatel {

    private APIDodavatela1 api;

    public JsonAdapter(APIDodavatela1 api) {
        this.api = api;
    }

    @Override
    public boolean VytvorObjednavku(String ean, String mnozstvo, String priezvisko) {

        String json = "{\"ean\":\"" + ean + "\",\"mnozstvo\":\"" + mnozstvo + "\",\"mnozstvo\":\"" + priezvisko + "\"}";
        System.out.println("Parametre boli adaptovane pre Dodatavatela1!");
        return this.api.Objednaj(json);
    }

    @Override
    public List<String> VyhladajProdukt(String ean) {

        String json = "{\"ean\":\"" + ean + "\"}";
        return this.api.Vyhladaj(json);
    }
}
