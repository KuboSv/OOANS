package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Poistenie;

public class SpravcaPoistenia {
	
	private List<Poistenie> poistenia = new ArrayList<Poistenie>();
	
	public void pridajPoistenia(Poistenie poistenie) {
		this.poistenia.add(poistenie);
	}
	
	public Poistenie vyhladajPoistenie(String druh) {
		return null;
	}
	
	public void sparujVozidlo() {
		
	}

}
