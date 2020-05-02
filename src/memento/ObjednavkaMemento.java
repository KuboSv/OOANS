package memento;

import Model.Predajca;
import Model.Vozidlo;
import Model.Zakaznik;
import state.StavObjednavky;
import strategy.PlatobnaStrategia;

public class ObjednavkaMemento {
	
	private int id;
	private double CelkovaCena;
	private Predajca predajca;
	private PlatobnaStrategia sposobPlatby;
	private StavObjednavky stav;
	private Vozidlo vozidlo;
	private Zakaznik zakaznik;
	
	public ObjednavkaMemento(int id, double celkovaCena, Predajca predajca, PlatobnaStrategia sposobPlatby,
			StavObjednavky stav, Vozidlo vozidlo, Zakaznik zakaznik) {
		this.id = id;
		CelkovaCena = celkovaCena;
		this.predajca = predajca;
		this.sposobPlatby = sposobPlatby;
		this.stav = stav;
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
	public void setCelkovaCena(double celkovaCena) {
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
}
