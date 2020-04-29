package Model;

import java.util.ArrayList;
import java.util.List;

public class ServisnyZakrok {
    private String druhZakroku;
    private String mechanik;
    private int vozidloId;
    private String opis;
    private List<Autodiel> autodiely = new ArrayList<>();

    public ServisnyZakrok(String druhZakroku, String mechanik, int vozidloId, String opis) {
        this.druhZakroku = druhZakroku;
        this.mechanik = mechanik;
        this.vozidloId = vozidloId;
        this.opis = opis;
    }
}
