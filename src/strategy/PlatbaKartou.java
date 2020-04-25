package strategy;

public class PlatbaKartou implements PlatobnaStrategia {

	@Override
	public boolean zaplat(double cena) {
		System.out.printf("Zaplatil si cenu %f Eur pomocou platobnej karty", cena);
		return true;
	}

}
