package Model;

public class Notifikacia {
	private String datum;
	private String telo;
	private String predmet;
	
	public String getDatum() {
		return datum;
	}
	public String getTelo() {
		return telo;
	}

	
	public Notifikacia(String datum, String predmet, String telo) {
		this.datum = datum;
		this.telo = telo;
		this.setPredmet(predmet);
	}
	
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
}
