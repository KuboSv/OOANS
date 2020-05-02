package Model;
import memento.ObjednavkaMemento;
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
	
	public void Spracuj() {
		this.setStav(SpracovanaObjednavka.INSTANCE);
	}

	public void Objednaj() {
		this.setStav(VytvorenaObjednavka.INSTANCE);
	}
	
	public ObjednavkaMemento Uloz() {
		return this.createMemento();
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
	
	public ObjednavkaMemento createMemento(){
		ObjednavkaMemento m = new ObjednavkaMemento(id, CelkovaCena, predajca, sposobPlatby, stav, vozidlo, zakaznik);
	    return m;
	}
	     
	public void restore(ObjednavkaMemento m) {
    	this.id = m.getId();
		this.CelkovaCena = m.getCelkovaCena();
		this.predajca = m.getPredajca();
		this.stav = m.getStav();
		this.vozidlo = m.getVozidlo();
		this.zakaznik = m.getZakaznik();
	}
	
}
