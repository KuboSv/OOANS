package strategy;

public class PlatbaKartou implements PlatobnaStrategia {
	
	private String CisloKarty;
	
	public PlatbaKartou(String cisloKarty) {
		CisloKarty = cisloKarty;
	}

	public String getCisloKarty() {
		return CisloKarty;
	}

	public void setCisloKarty(String cisloKarty) {
		CisloKarty = cisloKarty;
	}


	@Override
	public boolean zaplat(double cena) {
		System.out.printf("Zaplatil si cenu %f Eur pomocou platobnej karty", cena);
		return true;
	}

}
