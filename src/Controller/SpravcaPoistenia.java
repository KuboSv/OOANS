package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Poistenie;

public class SpravcaPoistenia {
	
	private List<Poistenie> poistenia = new ArrayList<Poistenie>();
	
	public SpravcaPoistenia() {
		this.poistenia.add(new Poistenie(1, 0, "proti kradezi", null, 0));
		this.poistenia.add(new Poistenie(2, 0, "havarijne", null, 0));
	}

	public Poistenie vyhladajPoistenie(String druh) {
		
		Poistenie p = null;
		for(int i = 0; i < poistenia.size();i++) {
			if (poistenia.get(i).getDruh().contentEquals(druh)) {
				p = poistenia.get(i);
			}
		}
		return p;
	}
	
	public void sparujVozidlo() {
		
	}

}
