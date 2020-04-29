package Scenare;

import java.io.*;

import Controller.*;
import Model.*;

public class Scenar02 {

	public static void main(String[] args) throws IOException {
		Zakaznik zakaznik = new Zakaznik("Jakub", "Jusko");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		SpravcaReklamacii spravcaR = new SpravcaReklamacii();
		
		boolean koniec = false;
	    while(koniec == false){
	    	System.out.print("Chces podat reklamaciu A/N:");
			String reklamacia = reader.readLine(); 
			
			
			if (reklamacia.equals("A")) {
				System.out.print("Vyber typ reklamacie\n1 reklamacie opravy\n2 reklamacia vozidla\nTvoja volba:");
				int vyber = Integer.parseInt(reader.readLine());
				System.out.printf("Tvoja volba je %d \n",vyber);
				Reklamacia r = null;
				
				switch(vyber) {
				case 1:
					r = new Reklamacia(null, zakaznik, vyber);
					break;
				case 2:
					r = new Reklamacia(null, zakaznik, vyber);
					break;
				case 3:
					r = new Reklamacia(null, zakaznik, vyber);
				    break;
				}

				System.out.print("Zadaj text reklamacie:");
				String text = reader.readLine(); 
				
				r.setDovod(text);

				System.out.print("Chces odoslat reklamaciu A/N:");
				String choice = reader.readLine(); 
				
				if (choice.equals("A")) {
					spravcaR.odosliReklamaciu(r);	
				}	
				
				if (reklamacia.equals("N")) {
					koniec = true;
				} 
			}
	    }
	}
}
