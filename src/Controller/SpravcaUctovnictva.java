package Controller;

import Model.Uctovnik;
import proxy.ProxyPristupKUctu;
import proxy.SpravcaPristupuKUctu;
import java.util.ArrayList;
import java.util.List;

public class SpravcaUctovnictva {
    private List<Uctovnik> uctovnici= new ArrayList<>();
    private Uctovnik prihlasenyUctovnik;
    public SpravcaUctovnictva(){
        uctovnici.add(new Uctovnik("Jana", "Mokra"));
        uctovnici.add(new Uctovnik("Milan", "Kral"));
        uctovnici.add(new Uctovnik("Jan", "Lomnicky"));
        prihlasenyUctovnik=uctovnici.get(0);
    }

    public void odosliVyplaty() {
        SpravcaPristupuKUctu ucet = new ProxyPristupKUctu();
        try
        {
            ucet.vyplatMzdy(prihlasenyUctovnik);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
