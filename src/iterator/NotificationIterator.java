package iterator;

import java.util.List;

import Model.Notifikacia;

public class NotificationIterator implements Iterator {

	int pos = 0; 
	private List<Notifikacia> notifikacie;
	
	@Override
	public boolean hasNext() {
		if (pos >= notifikacie.size() || 
        		notifikacie.get(pos) == null) 
            return false; 
        else
            return true; 
	}

	@Override
	public Object next() {
        Notifikacia notification = notifikacie.get(pos); 
        pos += 1; 
        return notification; 
	}
	

	public NotificationIterator(List<Notifikacia> notifikacie) {
		this.notifikacie = notifikacie;
	}

}
