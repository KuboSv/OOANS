package Controller;

import Model.*;

public class SpravcaObjednavok {
	
	public void potvrdObjednavku() {}
	
	public Objednavka vyhladajObjednavku(int id) {
		return null;
	}
	

	public Objednavka vytvorObjednavku(Vozidlo v, Predajca p, Zakaznik z) {
		Objednavka o = new Objednavka(1, (int) (v.getNakupnaCena()+0.2*v.getNakupnaCena()), p, v, z);
		return o;
	}
}
