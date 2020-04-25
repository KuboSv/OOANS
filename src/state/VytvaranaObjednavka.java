package state;

import Model.Objednavka;

public enum VytvaranaObjednavka implements StavObjednavky{

	INSTANCE;
	
	private VytvaranaObjednavka() {};
	
	@Override
	public void zrus(Objednavka objednavka) {
		System.out.println("Vytvarana objednavka bola zrusena, teraz je v stave zrusena");
		objednavka.setStav(ZrusenaObjednavka.INSTANCE);
		
	}

}
