package Scenare;

import java.io.*;
import java.util.List;

import Controller.*;
import Model.*;
import memento.ObjednavkaMemento;
import state.*;
import strategy.*;

public class Scenar01 {
	
	public static void main(String[] args) throws IOException {
		
		Zakaznik zakaznik = new Zakaznik("Jakub", "Jusko");
		Predajca predajca = new Predajca("Matus","Kovac");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		SpravcaObjednavok spravcaO = new SpravcaObjednavok();
		SpravcaVozidiel spravcaV= new SpravcaVozidiel();
		SpravcaHistorieObjednavok spravcaH = new SpravcaHistorieObjednavok();
		
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
					System.out.printf("ID dostupneho vozidla znacky %s a cenou %f � = %d\n",vozidla.get(i1).getZnacka(), vozidla.get(i1).getNakupnaCena(), i1+1);
				}
				
				System.out.print("=================================================\nZadaj ID vozidla, ktore chces zavazne objednat:");
				int vyber = Integer.parseInt(reader.readLine());
					
				// Stav -> vytvarana, nebola zavazne vytvorena
				Objednavka o = spravcaO.vytvorObjednavku(vozidla.get(vyber-1), predajca, zakaznik);
				
				System.out.print("Chces zavazne objednat A/N, v pripade Nie bude tvoja objednavka zrusena:");
				String potvrd = reader.readLine();
				ObjednavkaMemento om = null;
						
				if (potvrd.equals("A")) {
					
					// Ak bola zavazne objednana -> spravcaObjednavok.VytvorObjednavku()
					// STATE
					spravcaO.vyhladajObjednavku(o.getId()).Objednaj();
					vozidla.get(vyber-1).registruj(zakaznik);
					
					// ObjednavaciFormular.VyberSposobPlatby()
					System.out.print("Zadaj druh platby:");
					String sposobPlatby = reader.readLine();
					
					//STRATEGY
					if (sposobPlatby.equals("paypal")) {
						spravcaO.vyhladajObjednavku(o.getId()).zaplatObjednavku(new PayPal("myemail@example.com", "Heslo"));
					} else if (sposobPlatby.equals("karta")) {
						spravcaO.vyhladajObjednavku(o.getId()).zaplatObjednavku(new PlatbaKartou("849999 98798 98498"));
					} else if (sposobPlatby.equals("mobil")) {
						spravcaO.vyhladajObjednavku(o.getId()).zaplatObjednavku(new PlatbaMobilom("0998741281"));
					}
					
					System.out.print("\nChces zrusit uz zaplatenu objednavku? A/N:");
					String rollback = reader.readLine();
					
					
					if (rollback.equals("A")) {
						spravcaH.pridajMemento(spravcaO.vyhladajObjednavku(o.getId()).Uloz());
						spravcaO.vyhladajObjednavku(o.getId()).zrus();
					}
							
				} else if (potvrd.equals("N")) {
					spravcaH.pridajMemento(spravcaO.vyhladajObjednavku(o.getId()).Uloz());
					spravcaO.vyhladajObjednavku(o.getId()).zrus();
				}
				
				spravcaO.vyhladajObjednavku(o.getId()).zrus();
				System.out.print("\nChces zvratit zrusenie objednavky? A/N:");
				String zvrat = reader.readLine();
				
				if(zvrat.equals("A")) {
					System.out.print("\nZadaj ID objednavky:");
					int vybr = Integer.parseInt(reader.readLine());
					spravcaO.vyhladajObjednavku(vybr).restore(spravcaH.vyhladajhistorickuObjednavku(vybr));			
				}
				
				System.out.println("1 den\n2 den\n...\nPo 5 dnoch keby sa objednavka spracovala, vybrane vozidlo sa stalo nedostupne");
				spravcaO.vyhladajObjednavku(o.getId()).getVozidlo().setStav("nasrot");
				spravcaO.vyhladajObjednavku(o.getId()).getVozidlo().notifikujObserverou("Havarjina udalost", "vozidlo mala nehody a nieje v dobrom stave na prenajom");
				
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
