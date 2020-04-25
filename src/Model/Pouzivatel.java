package Model;

public class Pouzivatel {
	
	private String meno;
	private String priezvisko;
	
	public Pouzivatel(String meno, String priezvisko) {
		this.meno = meno;
		this.priezvisko = priezvisko;
	}
	
	public String getMeno() {
		return meno;
	}
	public void setMeno(String meno) {
		this.meno = meno;
	}
	public String getPriezvisko() {
		return priezvisko;
	}
	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}
}
