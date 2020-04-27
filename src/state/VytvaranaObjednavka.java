package state;

import Model.Objednavka;

public enum VytvaranaObjednavka implements StavObjednavky{

	INSTANCE;
	
	private VytvaranaObjednavka() {};
	
	@Override
	public void zrus(Objednavka objednavka) {
		objednavka.setStav(ZrusenaObjednavka.INSTANCE);
		System.out.printf("Vytvarana objednavka bola zrusena, teraz je v stave ZRUSENA\n");		
	}

}
