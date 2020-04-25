package state;

import Model.Objednavka;

public enum ZrusenaObjednavka implements StavObjednavky {
	
	INSTANCE;
	
	private ZrusenaObjednavka () { }

	@Override
	public void zrus(Objednavka objednavka) {
		System.out.println("Zrusena objednavka bola odstranena");
		objednavka = null;
		
	}

}
