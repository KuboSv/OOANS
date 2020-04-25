package Scenare;

import java.io.*;
import java.util.List;

import Controller.*;
import Model.*;
import strategy.*;

public class Scenar01 {
	
	private Zakaznik zakaznik;
	private Predajca predajca;
	private Vozidlo v1;
	private Vozidlo v2;
	private Vozidlo v3;
	private Poistenie p1;
	private Poistenie p2;
	private SpravcaObjednavok spravcaO;
	private SpravcaVozidiel spravcaV;
	private SpravcaPoistenia spravcaP;

	public Scenar01() {
		this.zakaznik = new Zakaznik("Jakub", "Jusko");
		this.predajca = new Predajca("Matus","Kovac");
		this.v1 = new Vozidlo(1, "SEDAN", "BMW", "voprave", 10000, false);
		this.v2 = new Vozidlo(2, "COMBI", "SKODA", "vporiadku", 9800, true);
		this.v3 = new Vozidlo(3, "SUV", "MERCEDES", "vporiadku", 6800, true);
		this.p1 = new Poistenie(1, 20, "proti kradezi", this.zakaznik.getPriezvisko(), 2);
		this.p2 = new Poistenie(2, 30, "havarijne", this.zakaznik.getPriezvisko(), 2);
		this.spravcaO = new SpravcaObjednavok();
		this.spravcaV = new SpravcaVozidiel();
		this.spravcaV.pridajVozidlo(v1);
		this.spravcaV.pridajVozidlo(v2);
		this.spravcaV.pridajVozidlo(v3);
		this.spravcaP = new SpravcaPoistenia();
	}

	public static void main(String[] args) throws IOException {
		
		Scenar01 scenar01 = new Scenar01();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		
		// ObjednavaciFormular.ZadajParametre()
		System.out.print("Zadaj druh vozidla:");
		String druh = reader.readLine(); 
		
		System.out.print("Zadaj znacku vozidla:");
		String znacka = reader.readLine(); 
	
		// spravcaVozidiel.VyhladajVozidlo()
		List<Vozidlo> vozidla = scenar01.spravcaV.vyhladajVozidlo(druh,znacka);
		
		for(int i = 0; i < vozidla.size();i++) {
			// spravcaVozidiel.zistiDostupnost()
			boolean dostupnost = scenar01.spravcaV.zistiDostupnost(vozidla.get(i) );
			
			if  (!dostupnost) {
				System.out.printf("Lutujeme vozidlo s  ID %d nieje dostupne",vozidla.get(i).getId());
			} else {
			
				// spravcaObjednavok.VytvorObjednavku()
				Objednavka o = scenar01.spravcaO.vytvorObjednavku(vozidla.get(i), scenar01.predajca, scenar01.zakaznik);
				
				// ObjednavaciFormular.VyberSposobPlatby()
				System.out.print("Zadaj druh platby:");
				String sposobPlatby = reader.readLine();
				
				if (sposobPlatby.equals("paypal")) {
					o.zaplatObjednavku(new PayPal("myemail@example.com", "Heslo"));
				} else if (sposobPlatby.equals("karta")) {
					o.zaplatObjednavku(new PlatbaKartou());
				} else if (sposobPlatby.equals("mobil")) {
					o.zaplatObjednavku(new PlatbaMobilom());
				}
			
			}
		}
		// Alternativny scenar
		// ObjednavaciFormular.VyberPoistenie()
		// spravcaPoistenia.vyhladajPoistenie()
		// ObjednavaciFormular.ZadajParametre()
		// spravcaPoistenia.spraujVozidlo(Vozidlo vozidlo)
		// spravcaPOistenia.VytvorPoistenie()
	}
}
