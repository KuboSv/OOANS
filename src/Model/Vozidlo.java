package Model;

public class Vozidlo {
	private int id;
	private String druh;
	private String znacka;
	private String stav;
	private double nakupnaCena;
	private boolean dostupnost;
	
	public Vozidlo(int id, String druh, String znacka, String stav, double nakupnaCena, boolean dostupnost) {
		this.id = id;
		this.druh = druh;
		this.znacka = znacka;
		this.stav = stav;
		this.nakupnaCena = nakupnaCena;
		this.dostupnost = dostupnost;
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
}
