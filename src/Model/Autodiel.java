package Model;

import Visitor.Visitor;
import Visitor.Polozka;

public class Autodiel implements Polozka {
	
    private int id;
    private String ean;
    private String nazov;
    private int mnozstvo;
    private boolean typ;
    private String umiestnenie;
    private double cena;

    public Autodiel(int id, String ean, String nazov, int mnozstvo, boolean typ, String umiestnenie, double cena) {
        this.id = id;
        this.ean = ean;
        this.nazov = nazov;
        this.mnozstvo = mnozstvo;
        this.typ = typ;
        this.umiestnenie = umiestnenie;
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public int getMnozstvo() {
        return mnozstvo;
    }

    public void setMnozstvo(int mnozstvo) {
        this.mnozstvo = mnozstvo;
    }

    public boolean isTyp() {
        return typ;
    }

    public void setTyp(boolean typ) {
        this.typ = typ;
    }

    public String getUmiestnenie() {
        return umiestnenie;
    }

    public void setUmiestnenie(String umietnenie) {
        this.umiestnenie = umietnenie;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public boolean znizZasoby(int mnozstvo) {
        if(mnozstvo<=this.mnozstvo){
            this.mnozstvo-=mnozstvo;
            return true;
        }
        else {
            return false;
        }
    }
}
