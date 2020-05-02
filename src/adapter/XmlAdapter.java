package adapter;

import Model.APIDodavatela2;

import java.util.List;

public class XmlAdapter implements Dodavatel {

    private APIDodavatela2 api;

    public XmlAdapter(APIDodavatela2 api) {
        this.api = api;
    }

    @Override
    public boolean VytvorObjednavku(String ean, String mnozstvo, String priezvisko) {
        String json = "<body><ean>" + ean + "</ean><mnozstvo>" + mnozstvo + "</mnozstvo><priezvisko>" + priezvisko + "</priezvisko></body>";
        System.out.println("Parametre boli adaptovane pre dodatavatela2!");
        return this.api.Objednaj(json);
    }

    @Override
    public List<String> VyhladajProdukt(String ean) {

        String json = "<body><ean>" + ean + "</ean></body>";
        return this.api.Vyhladaj(json);
    }
}
