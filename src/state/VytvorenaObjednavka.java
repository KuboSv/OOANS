package state;

import Model.Objednavka;

public enum VytvorenaObjednavka implements StavObjednavky {
	
	INSTANCE;	
	
	private VytvorenaObjednavka() {};

	@Override
	public void zrus(Objednavka objednavka) {
		System.out.println("Vytvorena objednavka bola oznacena na zrusenia, cakam na posudenie predajcom ...");
	}

}
