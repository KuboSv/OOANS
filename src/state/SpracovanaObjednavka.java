package state;

import Model.Objednavka;

public enum SpracovanaObjednavka implements StavObjednavky{
	
	INSTANCE;
	
	private SpracovanaObjednavka () {};

	@Override
	public void zrus(Objednavka objednavka) {
		System.out.println("Tato objednavka sa uz spracovava ale bola oznacena na zrusenia, cakam na posudenie predajcom ...");
	}

}
