package iterator;

import java.util.ArrayList;
import java.util.List;

import Model.*;

public class KolekciaNotifikacii implements Kolekcia {
	
	private List<Notifikacia> notifikacie = new ArrayList<Notifikacia>();
	
    public void pridajNotifikaciu(Notifikacia notfikacia) { 
            notifikacie.add(notfikacia);
    } 

	@Override
	public Iterator createIterator() {
		return new IteratorNotifikacii(notifikacie); 
	}

}
