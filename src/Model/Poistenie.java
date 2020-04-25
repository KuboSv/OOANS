package Model;

public class Poistenie {
	
	private int id;
	private double cena;
	private String druh;
	private String udajeZiadatela; 
	private long dobaPlatnosti;
	
	public Poistenie(int id, double cena, String druh, String udajeZiadatela, long dobaPlatnosti) {
		this.id = id;
		this.cena = cena;
		this.druh = druh;
		this.udajeZiadatela = udajeZiadatela;
		this.dobaPlatnosti = dobaPlatnosti;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public String getDruh() {
		return druh;
	}
	public void setDruh(String druh) {
		this.druh = druh;
	}
	public String getUdajeZiadatela() {
		return udajeZiadatela;
	}
	public void setUdajeZiadatela(String udajeZiadatela) {
		this.udajeZiadatela = udajeZiadatela;
	}
	public long getDobaPlatnosti() {
		return dobaPlatnosti;
	}
	public void setDobaPlatnosti(long dobaPlatnosti) {
		this.dobaPlatnosti = dobaPlatnosti;
	}
	
	

}
