package strategy;

public class PlatbaMobilom implements PlatobnaStrategia {

	@Override
	public boolean zaplat(double cena) {
		System.out.printf("Zaplatil si cenu %f Eur cez mobilnu platbu", cena);
		return true;
	}

}
