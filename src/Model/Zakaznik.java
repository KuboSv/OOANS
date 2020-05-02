package Model;

import iterator.*;
import observer.Observer;

public class Zakaznik extends Pouzivatel  implements Observer{

	private KolekciaNotifikacii notifikacie = new KolekciaNotifikacii(); 

	public Zakaznik(String meno, String priezvisko) {
		super(meno, priezvisko);
	}
	
	public void vypisNotifikacie() {
		Iterator iterator = notifikacie.createIterator(); 
        System.out.println("-------NOTIFIKACIE------------"); 
        while (iterator.hasNext()) 
        { 
            Notifikacia n = (Notifikacia)iterator.next(); 
            if (n.getDatum().contains("2020")){
            System.out.println(n.getPredmet()+" "+n.getTelo()); 
            }
        } 
	}

	@Override
	public void update(Notifikacia notif) {
		this.notifikacie.pridajNotifikaciu(notif);
	}

}
