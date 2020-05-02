package observer;

public interface Subject {
	
	public void registruj(Observer o);
	public void odregistruj(Observer o);
	public void notifikujObserverou(String predmet, String telo);
	
}
