package strategy;

public class PlatbaMobilom implements PlatobnaStrategia {
	
	private String CisloMobilu;
	
	public PlatbaMobilom(String cisloMobilu) {
		CisloMobilu = cisloMobilu;
	}

	public String getCisloMobilu() {
		return CisloMobilu;
	}


	public void setCisloMobilu(String cisloMobilu) {
		CisloMobilu = cisloMobilu;
	}


	@Override
	public boolean zaplat(double cena) {
		System.out.printf("Zaplatil si cenu %f Eur cez mobilnu platbu", cena);
		return true;
	}

}
