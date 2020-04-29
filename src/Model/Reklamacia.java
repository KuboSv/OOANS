package Model;

public class Reklamacia {
	
	private String dovod;
	private Zakaznik zakaznik;
	private int druh;
	
	public Reklamacia(String dovod, Zakaznik zakaznik, int druh) {
		this.dovod = dovod;
		this.zakaznik = zakaznik;
		this.druh = druh;
	}

	public String getDovod() {
		return dovod;
	}

	public void setDovod(String dovod) {
		this.dovod = dovod;
	}

	public Zakaznik getZakaznik() {
		return zakaznik;
	}

	public void setZakaznik(Zakaznik zakaznik) {
		this.zakaznik = zakaznik;
	}

	public int getDruh() {
		return druh;
	}

	public void setDruh(int druh) {
		this.druh = druh;
	}
	
	
}
