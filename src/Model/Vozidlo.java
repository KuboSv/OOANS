package Model;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

public class Vozidlo implements Subject {
	
	private int id;
	private String druh;
	private String znacka;
	private String stav;
	private double nakupnaCena;
	private boolean dostupnost;
	private List<Observer> observery;
	

	public Vozidlo(int id, String druh, String znacka, String stav, double nakupnaCena, boolean dostupnost) {
		this.id = id;
		this.druh = druh;
		this.znacka = znacka;
		this.stav = stav;
		this.nakupnaCena = nakupnaCena;
		this.dostupnost = dostupnost;
		this.observery = new ArrayList<Observer>();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDruh() {
		return druh;
	}
	public void setDruh(String druh) {
		this.druh = druh;
	}
	public String getZnacka() {
		return znacka;
	}
	public void setZnacka(String znacka) {
		this.znacka = znacka;
	}
	public String getStav() {
		return stav;
	}
	public void setStav(String stav) {
		this.stav = stav;
	}
	public double getNakupnaCena() {
		return nakupnaCena;
	}
	public void setNakupnaCena(double nakupnaCena) {
		this.nakupnaCena = nakupnaCena;
	}
	public boolean isDostupnost() {
		return dostupnost;
	}
	public void setDostupnost(boolean dostupnost) {
		this.dostupnost = dostupnost;
	}

	@Override
	public void register(Observer o) {
		observery.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observery.remove(o);
	}

	@Override
	public void notifyAllObservers(String predmet, String telo) {
		for(Observer follower : observery){	
			follower.update(new Notifikacia("29.5.2020",predmet,telo));
		}
	}

}
