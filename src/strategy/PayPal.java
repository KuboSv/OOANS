package strategy;

public class PayPal implements PlatobnaStrategia {
	
	private String emailId;
	private String heslo;

	public PayPal(String emailId, String heslo) {
		this.emailId = emailId;
		this.heslo = heslo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHeslo() {
		return heslo;
	}

	public void setHeslo(String heslo) {
		this.heslo = heslo;
	}

	
	@Override
	public boolean zaplat(double cena) {
		System.out.printf("Zaplatil si cenu %f Eur cez Paypal", cena);
		return true;
	}

	
}
