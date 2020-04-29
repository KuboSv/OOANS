package Scenare;

import java.io.*;
import java.util.List;

import Controller.*;
import Model.*;
import state.*;
import strategy.*;

public class Scenar01 {
	
	public static void main(String[] args) throws IOException {
		
		Zakaznik zakaznik = new Zakaznik("Jakub", "Jusko");
		Predajca predajca = new Predajca("Matus","Kovac");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		SpravcaObjednavok spravcaO = new SpravcaObjednavok();
		SpravcaVozidiel spravcaV= new SpravcaVozidiel();
		SpravcaPoistenia spravcaP= new SpravcaPoistenia();
		
		boolean koniec = false;
	    while(koniec == false){
		
			// ObjednavaciFormular.ZadajParametre()
			System.out.print("Zadaj druh vozidla:");
			String druh = reader.readLine(); 
			
			System.out.print("Zadaj znacku vozidla:");
			String znacka = reader.readLine(); 
		
			// spravcaVozidiel.VyhladajVozidlo() + zistStav()
			List<Vozidlo> vozidla = spravcaV.vyhladajVozidlo(druh,znacka);
			
			if (!vozidla.isEmpty()) {

				for(int i = 0; i < vozidla.size();i++) {
					// spravcaVozidiel.zistiDostupnost()
					boolean dostupnost = spravcaV.zistiDostupnost(vozidla.get(i));
					
					if  (!dostupnost) {
						System.out.printf("Lutujeme vozidlo s  ID %d nieje dostupne",vozidla.get(i).getId());
						return;
					} 
				}
					
				for (int i1 = 0; i1 < vozidla.size(); i1++) {
					System.out.printf("ID dostupneho vozidla znacky %s a cenou %f € = %d\n",vozidla.get(i1).getZnacka(), vozidla.get(i1).getNakupnaCena(), i1+1);
				}
				
				System.out.print("=================================================\nZadaj ID vozidla, ktore chces zavazne objednat:");
				int vyber = Integer.parseInt(reader.readLine());
					
				// Stav -> vytvarana, nebola zavazne vytvorena
				Objednavka o = spravcaO.vytvorObjednavku(vozidla.get(vyber-1), predajca, zakaznik);
				
				System.out.print("Chces zavazne objednat A/N, v pripade Nie bude tvoja objednavka zrusena:");
				String potvrd = reader.readLine();
						
				if (potvrd.equals("A")) {
					
					// Ak bola zavazne objednana -> spravcaObjednavok.VytvorObjednavku()
					// STATE
					o.setStav(VytvorenaObjednavka.INSTANCE);
					vozidla.get(vyber-1).register(zakaznik);
					
					// ObjednavaciFormular.VyberSposobPlatby()
					System.out.print("Zadaj druh platby:");
					String sposobPlatby = reader.readLine();
					
					//STRATEGY
					if (sposobPlatby.equals("paypal")) {
						o.zaplatObjednavku(new PayPal("myemail@example.com", "Heslo"));
					} else if (sposobPlatby.equals("karta")) {
						o.zaplatObjednavku(new PlatbaKartou("849999 98798 98498"));
					} else if (sposobPlatby.equals("mobil")) {
						o.zaplatObjednavku(new PlatbaMobilom("0998741281"));
					}
					
					System.out.print("\nChces zrusit uz zaplatenu objednavku? A/N:");
					String rollback = reader.readLine();
					
					if (rollback.equals("A")) {
						o.zrus();
					}
							
				} else if (potvrd.equals("N")) {
					o.zrus();
				}
				System.out.println("1 den\n2 den\n...\nPo 5 dnoch keby sa objednavka spracovala, vybrane vozidlo sa stalo nedostupne");
				o.getVozidlo().setStav("nasrot");
				o.getVozidlo().notifyAllObservers("Havarjina udalost", "vozidlo mala nehody a nieje v dobrom stave na prenajom");
				
				System.out.print("\nChces znovu objednavat A/N:");
				String znovu = reader.readLine();
				
				if (znovu.equals("N")) {
					koniec = true;
				} 
			
			}
	    }
	    
	    zakaznik.vypisNotifikacie();
	    
	    
	    
	    
		// Alternativny scenar
		// ObjednavaciFormular.VyberPoistenie()
		// spravcaPoistenia.vyhladajPoistenie()
		// ObjednavaciFormular.ZadajParametre()
		// spravcaPoistenia.spraujVozidlo(Vozidlo vozidlo)
		// spravcaPOistenia.VytvorPoistenie()
	}
}
