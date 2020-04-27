package Model;
import state.*;
import strategy.*;

public class Objednavka {

	private int id;
	private double CelkovaCena;
	private Predajca predajca;
	private PlatobnaStrategia sposobPlatby;
	private StavObjednavky stav;
	private Vozidlo vozidlo;
	private Zakaznik zakaznik;
	
	public Objednavka(int id, int celkovaCena, Predajca predajca, 
			Vozidlo vozidlo, Zakaznik zakaznik) {
		super();
		this.id = id;
		this.CelkovaCena = celkovaCena;
		this.predajca = predajca;
		this.stav = VytvaranaObjednavka.INSTANCE;
		this.vozidlo = vozidlo;
		this.zakaznik = zakaznik;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCelkovaCena() {
		return CelkovaCena;
	}
	public void setCelkovaCena(int celkovaCena) {
		CelkovaCena = celkovaCena;
	}
	public Predajca getPredajca() {
		return predajca;
	}
	public void setPredajca(Predajca predajca) {
		this.predajca = predajca;
	}
	public PlatobnaStrategia getSposobPlatby() {
		return sposobPlatby;
	}
	public void setSposobPlatby(PlatobnaStrategia sposobPlatby) {
		this.sposobPlatby = sposobPlatby;
	}
	public StavObjednavky getStav() {
		return stav;
	}
	public void setStav(StavObjednavky stav) {
		this.stav = stav;
	}
	public Vozidlo getVozidlo() {
		return vozidlo;
	}
	public void setVozidlo(Vozidlo vozidlo) {
		this.vozidlo = vozidlo;
	}
	public Zakaznik getZakaznik() {
		return zakaznik;
	}
	public void setZakaznik(Zakaznik zakaznik) {
		this.zakaznik = zakaznik;
	}
	
	public void Expeduj() {
		
	}

	public void Objednaj() {
		
	}
	
	public void Odosli() {
		
	}
	
	public void Uloz() {
		
	}
	
	public double vypocitajCenu(){
		return 0;
	}
	
	public void zaplatObjednavku(PlatobnaStrategia strategia) {
		strategia.zaplat(this.CelkovaCena);
	}
	
	public void zrus() {
		this.getStav().zrus(this);
	}
	
}
