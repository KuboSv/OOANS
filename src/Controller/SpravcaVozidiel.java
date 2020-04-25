package Controller;

import java.util.*;

import Model.Vozidlo;

public class SpravcaVozidiel {

	private List<Vozidlo> vozidla = new ArrayList<Vozidlo>();
	
	public void pridajVozidlo(Vozidlo vozidlo) {
		this.vozidla.add(vozidlo);
	}

	
	public List<Vozidlo> vyhladajVozidlo(String druh, String znacka) {
		
		List<Vozidlo> vo = new ArrayList<Vozidlo>();
		
		for(int i =0; i < this.vozidla.size();i++) {
			if (this.vozidla.get(i).getDruh().equals(druh) && this.vozidla.get(i).getZnacka().equals(znacka)) {
				if (this.vozidla.get(i).getStav().equals("vporiadku")) {
					vo.add(this.vozidla.get(i));
				}
			}
		}
		return vo;
	}

	
	public boolean zistiDostupnost(Vozidlo vozidlo) {
		
		boolean dostupne = false;
		if (vozidlo.isDostupnost()) {
				dostupne = true;
		}
		
		return dostupne;
	}

}
