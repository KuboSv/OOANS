package Controller;

import java.util.*;

import Model.*;

public class SpravcaObjednavok {
	
	private List<Objednavka> objednavky = new ArrayList<Objednavka>();
	
	public void potvrdObjednavku() {}
	
	public Objednavka vyhladajObjednavku(int id) {
		  for (Objednavka o : objednavky) {
		        if (o.getId() == id) {
		            return o;
		        }
		    }
		    return null;
	}

	public Objednavka vytvorObjednavku(Vozidlo v, Predajca p, Zakaznik z) {
		Objednavka o = new Objednavka(1, (int) (v.getNakupnaCena()+0.2*v.getNakupnaCena()), p, v, z);
		System.out.println("Objednavka bola vytvorena");
		objednavky.add(o);
		return o;
	}
}
