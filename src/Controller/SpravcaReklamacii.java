package Controller;

import java.util.*;

import Model.Reklamacia;

public class SpravcaReklamacii {

	private List<Reklamacia> reklamacie = new ArrayList<Reklamacia>();
	
	public void odosliReklamaciu(Reklamacia re) {
		this.reklamacie.add(re);
		System.out.print("Reklamacia bola zaevidovana\n");
	}
}
